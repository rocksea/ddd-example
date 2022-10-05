package kr.co.ddd.customer.interfaces;

import kr.co.ddd.customer.application.CustomerRegistrationService;
import kr.co.ddd.customer.domain.command.CustomerRegistrationCommand;
import kr.co.ddd.customer.interfaces.dto.CustomerRegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerRegistrationController {

    private final CustomerRegistrationService customerRegistrationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody CustomerRegistrationRequest request){
        CustomerRegistrationCommand customerRegistrationCommand = new CustomerRegistrationCommand(request.getCustomerName(), request.getRoles());
        customerRegistrationService.customerRegistration(customerRegistrationCommand);
    }
}
