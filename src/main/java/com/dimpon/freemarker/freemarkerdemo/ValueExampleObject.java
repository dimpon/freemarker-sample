package com.dimpon.freemarker.freemarkerdemo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValueExampleObject {

    private String name;
    private String developer;

    public ValueExampleObject(String name, String developer) {
        this.name = name;
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public String repeat(String s, int num) {
        return IntStream.range(0, num).mapToObj(value -> s).collect(Collectors.joining());
    }
}
