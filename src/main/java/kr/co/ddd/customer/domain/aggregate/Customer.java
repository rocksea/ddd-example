package kr.co.ddd.customer.domain.aggregate;

import kr.co.ddd.customer.domain.event.CustomerRegistered;
import kr.co.ddd.customer.domain.vo.CustomerRole;
import lombok.*;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.data.domain.DomainEvents;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Builder
@Getter
@Table(name = "customer")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String customerName;
    @ElementCollection
    @CollectionTable(name = "customer_role", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Set<CustomerRole> roles;

    @Transient
    private final List<CustomerRegistered> domainEvents = new ArrayList<>();

    public void domainOperation() {
        domainEvents.add(new CustomerRegistered(this.id, this.customerName, this.roles));
    }

    @DomainEvents
    public List<CustomerRegistered> events() {
        return domainEvents;
    }

    @AfterDomainEventPublication
    public void clearDomainEvents() {
        domainEvents.clear();
    }
}
