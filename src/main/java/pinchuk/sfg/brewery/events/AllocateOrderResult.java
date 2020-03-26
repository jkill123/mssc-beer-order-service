package pinchuk.sfg.brewery.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pinchuk.sfg.brewery.model.BeerOrderDto;

/**
 * @author Pinchuk Yevhen
 * @created 26/03/2020 - 20:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderResult {
    private BeerOrderDto beerOrderDto;
    private Boolean allocationError = false;
    private Boolean pendingInventory = false;
}