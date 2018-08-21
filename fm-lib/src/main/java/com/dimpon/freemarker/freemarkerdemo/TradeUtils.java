package com.dimpon.freemarker.freemarkerdemo;

import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModelException;

import java.util.List;


public class TradeUtils implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments) throws TemplateModelException {
        return arguments.get(0).toString()+arguments.get(1).toString();
    }
}
