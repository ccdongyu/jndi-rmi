package pers.ccdongyu;

import java.rmi.Naming;

public class HelloClient {
    public static void main(String args[]) throws Exception{
        Hello hello = (Hello)Naming.lookup("rmi://localhost:1099/hello");
        System.out.println(hello.say());
    }
}
