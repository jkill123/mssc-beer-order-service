
package pinchuk.sfg.beer.order.service.web.mappers;

import org.mapstruct.Mapping;
import pinchuk.sfg.beer.order.service.domain.BeerOrder;
import pinchuk.sfg.beer.order.service.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    @Mapping(target = "customerId", source = "customer.id")
    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
