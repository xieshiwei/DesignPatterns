package proxy.testProxy;

/**
 * @ClassName AccountDaoProxy
 * @Author 萌琪琪爸爸
 * @Description //静态代理
 * @Date 2020/1/21 19:54
 **/
public class AccountDaoProxy {
    private IAccount account;

    public AccountDaoProxy(IAccount account) {
        this.account = account;
    }

    public void add() {
        account.add();
    }
}
