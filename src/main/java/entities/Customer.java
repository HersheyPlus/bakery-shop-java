package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static helper.GenerateId.generateCustomerId;

public class Customer {
    private final String customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;
    private String customerPassword;
    private final List<Order> customerOrders = new ArrayList<>();

    public Customer(String customerId, String customerName, String customerEmail, String customerPhone, String customerAddress, String customerPassword) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.customerPassword = customerPassword;
    }

    public Customer(String customerName, String customerEmail, String customerPhone, String customerAddress, String customerPassword) {
        this(generateCustomerId(), customerName, customerEmail, customerPhone, customerAddress, customerPassword);
    }

    public String getCustomerId() {return customerId;}

    public String getCustomerName() {return customerName;}

    public String getCustomerEmail() {return customerEmail;}

    public String getCustomerPhone() {return customerPhone;}

    public String getCustomerAddress() {return customerAddress;}

    public String getCustomerPassword() {return customerPassword;}

    public void setCustomerName(String customerName) {
        this.customerName = customerName;}

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public List<Order> getCustomerOrders() {return customerOrders;}
    public int getCustomerOrdersCount() {return customerOrders.size();}
    public void addOrder(Order order) {customerOrders.add(order);}
    public void removeOrder(Order order) {customerOrders.remove(order);}
    public void clearOrders() {customerOrders.clear();}
    public Stream<Order> streamOrders() {return customerOrders.stream();}

    @Override
    public String toString() {
        return String.format("Customer{id: %s, name: '%s', email: '%s', phone: %s, address: '%s'}", customerId, customerName, customerEmail,
                customerPhone, customerAddress);
    }

}
