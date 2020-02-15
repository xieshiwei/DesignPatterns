package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName ProxyFactory
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2019/12/28 1:17
 **/
public class ProxyFactory implements MethodInterceptor {

    /**
     * 目标对象
     */
    private Object target;

    /**
     * 构造
     *
     * @param target
     */
    public ProxyFactory(Object target) {
        System.out.println("ProxyFactory");
        this.target = target;
    }

    /**
     * 返回一个代理对象，target的代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        System.out.println("getProxyInstance开始");
        //放大器（工具类）
        Enhancer enhancer = new Enhancer();
        //2 将需要代理的对象类型设置成父类
        enhancer.setSuperclass(target.getClass());
        //3 设置回调函数（自己）
        enhancer.setCallback(this);
        //4 创建子类对象（代理对象）
        Object result = enhancer.create();
        System.out.println("getProxyInstance结束");
        return result;

    }


    /**
     * 拦截器
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("intercept开始");
        Object result = method.invoke(target, objects);
        System.out.println("intercept结束");
        return result;
    }
}
