package pinchuk.sfg.beer.order.service.services.beer;

import pinchuk.sfg.beer.order.service.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * @author Pinchuk Yevhen
 * @created 18/03/2020 - 21:41
 */
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID beerId);

    Optional<BeerDto> getBeerByUpc(String upc);


}
