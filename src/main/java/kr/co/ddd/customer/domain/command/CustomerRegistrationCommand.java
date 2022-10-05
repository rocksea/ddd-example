package kr.co.ddd.customer.domain.command;

import kr.co.ddd.customer.domain.vo.CustomerRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegistrationCommand {
    private String customerName;
    private Set<CustomerRole> customerRoles;
}
