package repositories;

import entities.Customer;
import java.util.List;
import java.util.Optional;
public interface CustomerRepository {
    Customer save(Customer customer);
    Optional<Customer> findById(String id);
    List<Customer> findAll();
    void deleteById(String id);
    boolean existsById(String id);
}
