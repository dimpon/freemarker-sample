package com.dimpon.freemarker.freemarkerdemo;

import freemarker.ext.beans.StringModel;
import freemarker.template.*;

import java.util.List;
import java.util.Locale;


public class IndexOfMethod implements TemplateMethodModel {

    public TemplateModel exec(List args) throws TemplateModelException {
        if (args.size() != 2) {
            throw new TemplateModelException("Wrong arguments");
        }
        return new SimpleNumber(
                ((String) args.get(1)).indexOf((String) args.get(0)));
    }
}