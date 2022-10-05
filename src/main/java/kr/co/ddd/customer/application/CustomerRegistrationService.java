package kr.co.ddd.customer.application;

import kr.co.ddd.customer.domain.aggregate.Customer;
import kr.co.ddd.customer.domain.command.CustomerRegistrationCommand;
import kr.co.ddd.customer.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CustomerRegistrationService {
    private final CustomerRepository customerRepository;

    @Transactional
    public void customerRegistration(CustomerRegistrationCommand command) {
        Customer customer = Customer.builder()
                .customerName(command.getCustomerName())
                .roles(command.getCustomerRoles()).build();
        customer.domainOperation();
        customerRepository.save(customer);
    }
}
