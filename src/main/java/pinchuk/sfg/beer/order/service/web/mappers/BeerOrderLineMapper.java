package pinchuk.sfg.beer.order.service.web.mappers;

import org.mapstruct.DecoratedWith;
import pinchuk.sfg.beer.order.service.domain.BeerOrderLine;
import pinchuk.sfg.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
