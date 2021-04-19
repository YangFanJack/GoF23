package ProxyDanamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        UserManager userManager = new UserManagerImpl();
        UserManager proxy = (UserManager) Proxy.newProxyInstance(
                userManager.getClass().getClassLoader(),
                userManager.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object invoke = method.invoke(userManager, args);
                        System.out.println("fuck java");
                        return invoke;
                    }
                });
        proxy.addUser();
        proxy.delUser();
        proxy.findUser();
        proxy.modifyUser();
    }
}
