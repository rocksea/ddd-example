package kr.co.ddd.customer.domain.repository;

import kr.co.ddd.customer.domain.aggregate.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {}