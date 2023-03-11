package saturday.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        InvocationHandler invocationHandler = new ReaderInvocationHandler();
        Object proxyInstance =
                Proxy.newProxyInstance(Main.class.getClassLoader(),
                        new Class[]{Reader.class},
                        invocationHandler);
        ((Reader) proxyInstance).read("Hello");
    }
}