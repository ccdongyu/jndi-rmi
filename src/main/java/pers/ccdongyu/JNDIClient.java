package pers.ccdongyu;

import javax.naming.Context;
import javax.naming.InitialContext;

public class JNDIClient {
    public static void main(String[] args) throws Exception
    {
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.rmi.registry.RegistryContextFactory");
        System.setProperty(Context.PROVIDER_URL,"rmi://localhost:1099");
        InitialContext ctx=new InitialContext();
        String url =  "hello";
        Hello RmiObject  = (Hello) ctx.lookup(url);
        System.out.println(RmiObject.say());
    }
}
