package services;

import entities.Customer;
import java.util.List;
public interface CustomerService {
    Customer createCustomer(String customerName, String customerEmail, String customerPhone, String customerAddress, String customerPassword);
    Customer getCustomerById(String customerId);
    List<Customer> getAllCustomers();
    Customer updateCustomer(String customerId, String newCustomerName, String newCustomerEmail, String newCustomerPhone, String newCustomerAddress, String newCustomerPassword);
    void deleteCustomer(String customerId);
}
