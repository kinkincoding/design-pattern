package proxy.remote;

import java.rmi.Naming;


public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            // 客户到RMI registry中寻找，registry返回Stub对象，对其进行反序列化
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// javac -d . src/proxy/remote/*.java
// 终端1：rmiregistry
// 终端2：java proxy.remote.MyRemoteImpl
// 终端3：java proxy.remote.MyRemoteClient
