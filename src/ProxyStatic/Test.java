package ProxyStatic;

public class Test {
    public static void main(String[] args) {
        UserManagerImplProxy userManagerImplProxy = new UserManagerImplProxy(new UserManagerImpl());
        userManagerImplProxy.addUser();
        userManagerImplProxy.delUser();
        userManagerImplProxy.findUser();
        userManagerImplProxy.modifyUser();
    }
}
