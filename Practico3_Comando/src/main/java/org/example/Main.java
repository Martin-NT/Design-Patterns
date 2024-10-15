package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArgentinaServer arg = new ArgentinaServer();
        PrenderServer pr = new PrenderServer(arg);
        ApagarServer ap = new ApagarServer(arg);
        Invoker in = new Invoker(ap);
        System.out.println("--------------------------------------------------------------------------------");
        in.run();

        BrasilServer br = new BrasilServer();
        PrenderServer pr2 = new PrenderServer(br);
        ApagarServer ap2 = new ApagarServer(br);
        Invoker in2 = new Invoker(ap2);
        System.out.println("--------------------------------------------------------------------------------");
        in2.run();

        USAServer usa = new USAServer();
        PrenderServer pr3 = new PrenderServer(usa);
        ApagarServer ap3 = new ApagarServer(usa);
        Invoker in3 = new Invoker(ap3);
        System.out.println("--------------------------------------------------------------------------------");
        in3.run();

    }
}