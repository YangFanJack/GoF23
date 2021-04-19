package ProxyStatic;

public class UserManagerImpl implements UserManager{
    @Override
    public void addUser() {
        System.out.println("addUser");
    }

    @Override
    public void delUser() {
        System.out.println("delUser");
    }

    @Override
    public void findUser() {
        System.out.println("findUser");
    }

    @Override
    public void modifyUser() {
        System.out.println("modifyUser");
    }
}
