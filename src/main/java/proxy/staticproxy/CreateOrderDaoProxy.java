package proxy.staticproxy;

/**
 * @ClassName TeacherDaoProxy
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2019/12/27 21:18
 **/
public class CreateOrderDaoProxy implements ICreateOrderDao {
    private ICreateOrderDao create;

    public CreateOrderDaoProxy(ICreateOrderDao create) {
        this.create = create;
    }


    /**
     * 调用接口的实现方法，实现功能
     *
     * @return
     */
    public boolean createOrder() {
        System.out.println("创建开始");
        create.createOrder();
        System.out.println("创建结束");
        return true;
    }
}
