package repositories;

import entities.Bakery;
import java.util.List;
import java.util.Optional;
public interface BakeryRepository {
    Bakery save(Bakery bakery);
    Optional<Bakery> findById(String id);
    List<Bakery> findAll();
    void deleteById(String id);
    boolean existsById(String id);
}
