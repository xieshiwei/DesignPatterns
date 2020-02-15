package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2019/12/28 0:50
 **/
public class ProxyFactory {

    /**
     * 需要代理的对象（参数）
     */
    private Object target;


    /**
     * 构造
     * @param target
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 动态代理
     * @return
     */
    public Object getProxyInstance() {

        /**
         * newProxyInstance参数：
         * 1 ClassLoader loader：对象的类加载器
         * 2 Class<?>[] interfaces：目标对象实现的接口类型
         * 3 InvocationHandler h：实现接口，调用方法的时候触发
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("进入反射方法");
                        //反射目标对象方法
                        return method.invoke(target, args);
                    }
                });
    }
}
