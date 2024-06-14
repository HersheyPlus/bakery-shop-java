package services;

import entities.Shop;
import java.util.List;
public interface ShopService {
    Shop createShop(String shopName, String shopAddress, String shopPhone, String shopEmail);
    Shop getShopById(String shopId);
    List<Shop> getAllShops();
    Shop updateShop(String shopId, String newShopName, String newShopAddress, String newShopPhone, String newShopEmail);
    void deleteShop(String shopId);
}
