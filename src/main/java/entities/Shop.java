package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static helper.GenerateId.generateShopId;

public class Shop {
    private final String shopId;
    private String shopName;
    private String shopAddress;
    private String shopPhone;
    private String shopEmail;
    private final List<Order> shopOrders = new ArrayList<>();
    private final List<Bakery> bakeriesInShop = new ArrayList<>();

    public Shop(String shopId, String shopName, String shopAddress, String shopPhone, String shopEmail) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopAddress = shopAddress;
        this.shopPhone = shopPhone;
        this.shopEmail = shopEmail;
    }

    public Shop(String shopName, String shopAddress, String shopPhone, String shopEmail) {
        this(generateShopId(), shopName, shopAddress, shopPhone, shopEmail);
    }

    public String getShopId() {
        return shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public String getShopEmail() {
        return shopEmail;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public void setShopEmail(String shopEmail) {
        this.shopEmail = shopEmail;
    }

    @Override
    public String toString() {
        return String.format("Shop{id: %s, name, '%s', address, '%s', phone, %s, email, '%s'}",
                shopId, shopName, shopAddress, shopPhone, shopEmail);
    }

    public Stream<Order> streamOrders() {return shopOrders.stream();}
    public Stream<Bakery> streamBakeries() {return bakeriesInShop.stream();}

    public List<Order> getShopOrders() {return shopOrders;}

    public int getShopOrdersCount() {return shopOrders.size();}

    public List<Bakery> getBakeriesInShop() {return bakeriesInShop;}

    public int getBakeriesInShopCount() {return bakeriesInShop.size();}

    public void addBakery(Bakery bakery) {bakeriesInShop.add(bakery);}

    public void removeBakery(Bakery bakery) {bakeriesInShop.remove(bakery);}

    public void clearBakeries() {bakeriesInShop.clear();}

    public void addOrder(Order order) {shopOrders.add(order);}

    public void removeOrder(Order order) {shopOrders.remove(order);}

    public void clearOrders() {shopOrders.clear();}

    public void addOrderToCustomer(Customer customer, Order order) {
        customer.addOrder(order);
        shopOrders.add(order);
    }

    public void removeOrderFromCustomer(Customer customer, Order order) {
        customer.removeOrder(order);
        shopOrders.remove(order);
    }

    public void clearOrdersFromCustomer(Customer customer) {
        customer.clearOrders();
        shopOrders.clear();
    }

    public void clearAllOrdersAndBakeriesInShop() {
        shopOrders.clear();
        bakeriesInShop.clear();
    }
}
