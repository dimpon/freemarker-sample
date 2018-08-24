package com.dimpon.freemarker.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Dmitrii Ponomarev
 */
public class Util {

    Map<Class<?>, Function<?,String>> ma = new HashMap<>();


    public <T> void addIt(Class<T> clazz, Function<T,String> fa){
        ma.put(clazz,fa);
    }

    @SuppressWarnings("unchecked")
    public <T> Function<T,String> getIt(Class<T> clazz){
        return  (Function<T, String>)ma.get(clazz);
    }




    public static void dodo(){



        List<? super A> l = new ArrayList<>();
        l.add(new B());


        List<? extends A> k = new ArrayList<>();
        A a = k.get(1);



    }

}
