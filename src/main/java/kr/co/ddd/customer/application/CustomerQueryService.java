package kr.co.ddd.customer.application;

import kr.co.ddd.customer.application.exception.CustomerNotFoundException;
import kr.co.ddd.customer.domain.aggregate.Customer;
import kr.co.ddd.customer.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerQueryService {
    private final CustomerRepository customerRepository;

    public List<Customer> getCostomers() {
        return customerRepository.findAll();
    }

    public Customer getCostomer(Integer customerId) {
        return customerRepository.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("고객이 존재하지 않습니다"));
    }
}
