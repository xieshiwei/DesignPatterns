package proxy.staticproxy;

/**
 * @ClassName Client
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2019/12/27 21:18
 **/
public class Client {

    public static void main(String[] args) {
        CreateOrderDaoProxy proxy = new CreateOrderDaoProxy(new CreateOrderDao());
        proxy.createOrder();
    }
}
