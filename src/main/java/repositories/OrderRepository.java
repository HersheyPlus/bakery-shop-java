package repositories;

import entities.Order;
import java.util.List;
import java.util.Optional;
public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(String id);
    List<Order> findAll();
    void deleteById(String id);
    boolean existsById(String id);
}
