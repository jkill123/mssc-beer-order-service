package pinchuk.sfg.beer.order.service.services;

import pinchuk.sfg.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);

}
