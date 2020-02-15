package proxy.testProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName CglibProxyFactory
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2020/1/21 19:57
 **/
public class CglibProxyFactory implements MethodInterceptor {

    private Object taget;

    public CglibProxyFactory(Object taget) {
        this.taget = taget;
    }

    public Object getProxyInstance() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(taget.getClass());
        enhancer.setCallback(this);
        Object result = enhancer.create();
        return result;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return method.invoke(taget, objects);
    }
}
