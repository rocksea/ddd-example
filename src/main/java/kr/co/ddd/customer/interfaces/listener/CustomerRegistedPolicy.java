package kr.co.ddd.customer.interfaces.listener;

import kr.co.ddd.customer.domain.event.CustomerRegistered;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerRegistedPolicy {
    @EventListener
    public void handleTournamentEndedEvent(CustomerRegistered event) {
        log.info("===== Handling CustomerRegistedEvent ====");
        //blabla
        log.info(event.toString());
    }

}
