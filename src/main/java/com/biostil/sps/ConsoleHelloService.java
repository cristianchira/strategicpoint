package com.biostil.sps;

public class ConsoleHelloService implements HelloService {

    private final String prefix;
    private final String suffix;

    public ConsoleHelloService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public void sayHello(String name) {

    }
}
