package entities;
import java.time.LocalDateTime;
import static helper.GenerateId.generateOrderId;

public class Order {
    private final String orderId;
    private final LocalDateTime orderDate;
    private final String orderBakeryDetail;
    private final int orderAmount;
    private final double orderTotalPrice;
    private final String orderStatus;
    private final String orderPaymentMethod;
    private final String shopOrderDetail;
    private final Customer customerOrderDetail;

    public Order(String orderId, String orderBakeryDetail, int orderAmount, double orderTotalPrice, String orderStatus, String orderPaymentMethod, String shopOrderDetail, Customer customerOrderDetail) {
        this.orderId = orderId;
        this.orderDate = LocalDateTime.now();
        this.orderBakeryDetail = orderBakeryDetail;
        this.orderAmount = orderAmount;
        this.orderTotalPrice = orderTotalPrice;
        this.orderStatus = orderStatus;
        this.orderPaymentMethod = orderPaymentMethod;
        this.shopOrderDetail = shopOrderDetail;
        this.customerOrderDetail = customerOrderDetail;
    }
    
    public Order(LocalDateTime orderDate, String orderBakeryDetail, int orderAmount, double orderTotalPrice, String orderStatus, String orderPaymentMethod, String shopOrderDetail, Customer customerOrderDetail) {
        this(generateOrderId(), orderBakeryDetail, orderAmount, orderTotalPrice, orderStatus, orderPaymentMethod, shopOrderDetail, customerOrderDetail);
    }

    @Override
    public String toString() {
        return String.format("Order{id: %s, date: %s, bakery: '%s', amount: %s, total price: %s, status: '%s', " +
                "payment method: '%s', shop: '%s', customer: '%s'}", orderId, orderDate, orderBakeryDetail,
                orderAmount, orderTotalPrice, orderStatus, orderPaymentMethod, shopOrderDetail, customerOrderDetail);
    }
}
