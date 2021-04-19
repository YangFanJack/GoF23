package ProxyStatic;

public class UserManagerImplProxy implements UserManager{

    private UserManager userManager;

    public UserManagerImplProxy(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public void addUser() {
        System.out.println("before add user");
        userManager.addUser();
        System.out.println("after add user");
    }

    @Override
    public void delUser() {
        System.out.println("before delete user");
        userManager.delUser();
        System.out.println("after delete user");
    }

    @Override
    public void findUser() {
        System.out.println("before find user");
        userManager.findUser();
        System.out.println("after find user");
    }

    @Override
    public void modifyUser() {
        System.out.println("before modify user");
        userManager.modifyUser();
        System.out.println("after modify user");
    }
}
