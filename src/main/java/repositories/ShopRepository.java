package repositories;

import entities.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopRepository {
    Shop save(Shop shop);
    Optional<Shop> findById(String id);
    List<Shop> findAll();
    void deleteById(String id);
    boolean existsById(String id);
}
