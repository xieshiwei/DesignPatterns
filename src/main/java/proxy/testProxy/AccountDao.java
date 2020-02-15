package proxy.testProxy;

/**
 * @ClassName AccountDao
 * @Author 萌琪琪爸爸
 * @Description //TODO
 * @Date 2020/1/21 19:40
 **/
public class AccountDao implements IAccount {
    @Override
    public void add() {
        System.out.println("add");
    }
}
