package pinchuk.sfg.beer.order.service.repositories;


import pinchuk.sfg.beer.order.service.domain.BeerOrder;
import pinchuk.sfg.beer.order.service.domain.BeerOrderStatusEnum;
import pinchuk.sfg.beer.order.service.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BeerOrderRepository  extends JpaRepository<BeerOrder, UUID> {

    Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);

    List<BeerOrder> findAllByOrderStatus(BeerOrderStatusEnum orderStatusEnum);

   // @Lock(LockModeType.PESSIMISTIC_WRITE)
   // BeerOrder findOneById(UUID id);
}
