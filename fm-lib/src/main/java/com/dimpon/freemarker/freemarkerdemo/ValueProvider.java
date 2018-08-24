package com.dimpon.freemarker.freemarkerdemo;

public interface ValueProvider {



    enum MyProperties{

        P1("p1",String.class),
        P2("p2",Long.class);

        private String name;
        private Class<?> clazz;


        MyProperties(String name, Class<?> clazz) {
            this.name = name;
            this.clazz = clazz;
        }




    }


    <T> T getValue(MyProperties name, T defaultValue, Class<T> clazz);




}
