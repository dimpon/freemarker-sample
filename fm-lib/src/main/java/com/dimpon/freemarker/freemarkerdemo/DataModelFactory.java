package com.dimpon.freemarker.freemarkerdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataModelFactory {

    public static Map<String, Object> createDataModel(){
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("title", "Vogella example");
        input.put("exampleObject", new ValueExampleObject("Java object", "me"));

        List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
        systems.add(new ValueExampleObject("Android", "Google"));
        systems.add(new ValueExampleObject("iOS States", "Apple"));
        systems.add(new ValueExampleObject("Ubuntu", "Canonical"));
        systems.add(new ValueExampleObject("Windows7", "Microsoft"));
        input.put("systems", systems);
        input.put("indexOf", new IndexOfMethod());
        input.put("repeat3", new Repeat3Times());
        input.put("tradeUtils", new TradeUtils());

        return input;
    }

}
