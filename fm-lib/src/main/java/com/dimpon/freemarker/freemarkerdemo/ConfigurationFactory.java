package com.dimpon.freemarker.freemarkerdemo;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.io.File;
import java.nio.file.Files;
import java.util.*;

public class ConfigurationFactory {

    public static Configuration createConfiguration() throws Exception {
        // 1. Configure FreeMarker
        //
        // You should do this ONLY ONCE, when your application starts,
        // then reuse the same Config object elsewhere.

        Configuration configuration = new freemarker.template.Configuration(
                freemarker.template.Configuration.VERSION_2_3_25);

        configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        configuration.setLogTemplateExceptions(false);

        configuration.setDefaultEncoding("UTF-8");


        FileTemplateLoader templateLoader = new FileTemplateLoader(new File("fm-sample/conf/templates"));
        ClassTemplateLoader classTemplateLoader = new ClassTemplateLoader(ConfigurationFactory.class, "/");

        MultiTemplateLoader mtl = new MultiTemplateLoader(new TemplateLoader[]{templateLoader, classTemplateLoader});

        configuration.setTemplateLoader(mtl);
        //configuration.setDirectoryForTemplateLoading(new File("fm-sample/conf/templates"));


        // Where do we load the templates from:
        //configuration.setClassForTemplateLoading(Start.class, "/templates");

        // Some other recommended settings:


        return configuration;
    }

}
