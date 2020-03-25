package pinchuk.sfg.beer.order.service.services;

import pinchuk.sfg.beer.order.service.domain.BeerOrder;
import pinchuk.sfg.brewery.model.BeerOrderDto;

import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 25/03/2020 - 22:11
 */
public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);

    void processValidationResult(UUID beerOrderId, Boolean isValid);

    void beerOrderAllocationPassed(BeerOrderDto beerOrder);

    void beerOrderAllocationPendingInventory(BeerOrderDto beerOrder);

    void beerOrderAllocationFailed(BeerOrderDto beerOrder);

    void beerOrderPickedUp(UUID id);

    void cancelOrder(UUID id);}
