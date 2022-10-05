package kr.co.ddd.customer.interfaces.dto;

import kr.co.ddd.customer.domain.vo.CustomerRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegistrationResponse {
    private String customerName;
    private Set<CustomerRole> customerRoles;
}
