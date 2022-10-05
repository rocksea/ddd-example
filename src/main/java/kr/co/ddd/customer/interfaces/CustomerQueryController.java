package kr.co.ddd.customer.interfaces;

import kr.co.ddd.customer.domain.aggregate.Customer;
import kr.co.ddd.customer.application.CustomerQueryService;
import kr.co.ddd.customer.interfaces.dto.CustomerRegistrationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerQueryController {
    private final CustomerQueryService customerQueryService;

    @GetMapping
    public ResponseEntity<List<CustomerRegistrationResponse>> getCustomers(){
        List<Customer> customers = customerQueryService.getCostomers();
        List<CustomerRegistrationResponse> customerRegistrationResponses = new ArrayList<>();
        for(Customer customer : customers){
            customerRegistrationResponses.add(
                CustomerRegistrationResponse.builder()
                    .customerName(customer.getCustomerName())
                    .customerRoles(customer.getRoles())
                    .build()
            );
        }
        return ResponseEntity.ok().body(customerRegistrationResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerRegistrationResponse> getCustomer(@PathVariable("id") Integer customerId){
        Customer customer = customerQueryService.getCostomer(customerId);
        return ResponseEntity.ok().body(
                CustomerRegistrationResponse.builder()
                .customerName(customer.getCustomerName())
                .customerRoles(customer.getRoles())
                .build()
                );
    }
}
