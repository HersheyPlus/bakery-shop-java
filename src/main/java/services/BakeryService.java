package services;

import entities.Bakery;
import java.util.List;
public interface BakeryService {
    Bakery createBakeryInShop(String name, String description, int amount, double price);
    Bakery getBakeryInShopByName(String bakeryName);
    List<Bakery> getAllBakeriesInShop();
    Bakery updateBakeryInShop(String bakeryName,String newName, String newDescription, int newAmount, double newPrice);
    void deleteBakery(String id);
}
