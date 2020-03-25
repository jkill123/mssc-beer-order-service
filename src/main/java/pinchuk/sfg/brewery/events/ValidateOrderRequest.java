package pinchuk.sfg.brewery.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pinchuk.sfg.brewery.model.BeerOrderDto;

/**
 * @author Pinchuk Yevhen
 * @created 25/03/2020 - 23:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ValidateOrderRequest {

    private BeerOrderDto beerOrder;
}
