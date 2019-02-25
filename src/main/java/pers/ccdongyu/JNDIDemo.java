package pers.ccdongyu;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.io.File;
import java.util.Hashtable;

public class JNDIDemo {
    public static void main(String args[]) throws Exception {


//        /**
//         * 通过系统变量设置SPI，访问RMI
//         */
//        LocateRegistry.createRegistry(1099);
//        HelloServer  server = new HelloServer();
//        System.setProperty(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
//        System.setProperty(Context.PROVIDER_URL,"rmi://localhost:1099");
//        InitialContext  ctx=new InitialContext();
//        ctx.bind("hello",server);
//        ctx.close();

        /**
         * 通过HashTable设置SPI,访问文件系统
         */
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        env.put(Context.PROVIDER_URL, "file:///Users/tangdongyu/Downloads");
        InitialContext cxt = new InitialContext(env);
        File file = (File)cxt.lookup("hello.dms");
        System.out.println(file);
        cxt.createSubcontext("newFolder");
    }
}
