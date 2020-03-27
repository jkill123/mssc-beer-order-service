package pinchuk.sfg.beer.order.service.services.testcomponents;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import pinchuk.sfg.beer.order.service.config.JmsConfig;
import pinchuk.sfg.brewery.model.events.ValidateOrderRequest;
import pinchuk.sfg.brewery.model.events.ValidateOrderResult;

/**
 * @author Pinchuk Yevhen
 * @created 27/03/2020 - 21:15
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class BeerOrderValidationListener {

    private final JmsTemplate jmsTemplate;

    @JmsListener(destination = JmsConfig.VALIDATE_ORDER_QUEUE)
    public void listen(Message msg){

        ValidateOrderRequest request = (ValidateOrderRequest) msg.getPayload();
        jmsTemplate.convertAndSend(JmsConfig.VALIDATE_ORDER_RESPONSE_QUEUE,
                ValidateOrderResult.builder()
                .isValid(true)
                .orderId(request.getBeerOrder().getId())
                .build());
    }
}
