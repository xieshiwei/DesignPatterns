package proxy.cglib;

/**
 * @ClassName Client
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2019/12/28 1:17
 **/
public class Client {
    public static void main(String[] args) {
        CreateOrderDao proxyInstance = (CreateOrderDao) new ProxyFactory(new CreateOrderDao()).getProxyInstance();
        proxyInstance.createOrder();
    }
}
