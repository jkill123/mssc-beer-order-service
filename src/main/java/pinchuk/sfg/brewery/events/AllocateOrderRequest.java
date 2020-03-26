package pinchuk.sfg.brewery.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pinchuk.sfg.brewery.model.BeerOrderDto;

/**
 * @author Pinchuk Yevhen
 * @created 26/03/2020 - 18:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderRequest {
    private BeerOrderDto beerOrder;

}
