package services;

import entities.Customer;
import entities.Order;

import java.time.LocalDateTime;
import java.util.List;
public interface OrderService {
    Order createOrder(String orderBakeryDetail, int orderAmount, double orderTotalPrice, String orderStatus, String orderPaymentMethod, String shopOrderDetail, Customer customerOrderDetail);
    Order getOrderById(String orderId);
    List<Order> getAllOrders();
    Order updateOrder(String orderId, String status);
    void deleteOrder(String orderId);
}

