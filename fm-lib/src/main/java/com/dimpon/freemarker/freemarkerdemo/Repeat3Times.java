package com.dimpon.freemarker.freemarkerdemo;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Repeat3Times implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
         return IntStream.range(0, 3)
                 .mapToObj(value -> arguments.get(0).toString())
                 .collect(Collectors.joining());
    }
}
