package kr.co.ddd.customer.domain.event;

import kr.co.ddd.customer.domain.vo.CustomerRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CustomerRegistered {
    private Integer id;
    private String customerName;
    private Set<CustomerRole> roles;
}
