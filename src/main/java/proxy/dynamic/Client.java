package proxy.dynamic;

/**
 * @ClassName Client
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2019/12/28 0:49
 **/
public class Client {

    public static void main(String[] args) {
        ICreateOrderDao proxyInstance = (ICreateOrderDao) new ProxyFactory(new CreateOrderDao()).getProxyInstance();
        proxyInstance.createOrder();
    }
}
