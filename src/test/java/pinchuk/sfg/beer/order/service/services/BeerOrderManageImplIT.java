package pinchuk.sfg.beer.order.service.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pinchuk.sfg.beer.order.service.domain.BeerOrder;
import pinchuk.sfg.beer.order.service.domain.BeerOrderLine;
import pinchuk.sfg.beer.order.service.domain.Customer;
import pinchuk.sfg.beer.order.service.repositories.BeerOrderRepository;
import pinchuk.sfg.beer.order.service.repositories.CustomerRepository;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static pinchuk.sfg.beer.order.service.domain.BeerOrderStatusEnum.ALLOCATED;

/**
 * @author Pinchuk Yevhen
 * @created 26/03/2020 - 21:48
 */
@SpringBootTest
public class BeerOrderManageImplIT {

    @Autowired
    BeerOrderManager beerOrderManager;

    @Autowired
    BeerOrderRepository beerOrderRepository;

    @Autowired
    CustomerRepository customerRepository;

    Customer testCustomer;

    UUID beerId = UUID.randomUUID();

    @BeforeEach
    void setUp() {
        testCustomer = customerRepository.save(Customer.builder()
                .customerName("Test Customer")
                .build());
    }

    @Test
    void testNewToAllocated() {
        BeerOrder beerOrder = createBeerOrder();
        BeerOrder savedBeer = beerOrderManager.newBeerOrder(beerOrder);

        assertNotNull(savedBeer);
        assertEquals(ALLOCATED, savedBeer.getOrderStatus());
    }

    public BeerOrder createBeerOrder(){
        BeerOrder beerOrder = BeerOrder.builder()
                .customer(testCustomer)
                .build();
        Set<BeerOrderLine> lines = new HashSet<>();
        lines.add(BeerOrderLine.builder()
                .beerId(beerId)
                .orderQuantity(1)
                .beerOrder(beerOrder)
                .build());

        beerOrder.setBeerOrderLines(lines);

        return beerOrder;
    }
}
