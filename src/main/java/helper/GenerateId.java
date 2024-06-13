package helper;

import java.util.UUID;

public class GenerateId {

    private static final String ADMIN_CODE = "AMx";
    private static final String Customer_CODE = "CTMx";
    private static final String ORDER_CODE = "ODRx";
    private static final String SHOP_CODE = "SHPx";
    private static final UUID uuid = UUID.randomUUID();

    public static String generateAdminId() {
        return ADMIN_CODE + "-" + uuid;
    }

    public static String generateCustomerId() {
        return Customer_CODE + "-" + uuid;
    }

    public static String generateOrderId() {
        return ORDER_CODE + "-" + uuid;
    }

    public static String generateShopId() {
        return SHOP_CODE + "-" + uuid;
    }

}
