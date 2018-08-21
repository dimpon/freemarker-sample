package com.dimpon.freemarker;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

public class CustomTemplateLoader implements TemplateLoader {

    private TemplateLoader dirLoder;
    private TemplateLoader classpathLoder;

    public CustomTemplateLoader() throws IOException {
        this.dirLoder = new FileTemplateLoader(new File("fm-sample/conf/templates"));
        this.classpathLoder = new ClassTemplateLoader(Start.class, "/");
    }

    @Override
    public Object findTemplateSource(String name) throws IOException {

        if (name.contains("header.ftl")) {
            return classpathLoder.findTemplateSource(name);
        }

        return dirLoder.findTemplateSource(name);
    }

    @Override
    public long getLastModified(Object templateSource) {

        if (templateSource.getClass().getName().equals("freemarker.cache.URLTemplateSource")) {
            return classpathLoder.getLastModified(templateSource);
        }


        return dirLoder.getLastModified(templateSource);
    }

    @Override
    public Reader getReader(Object templateSource, String encoding) throws IOException {

        if (templateSource.getClass().getName().equals("freemarker.cache.URLTemplateSource")) {
            return classpathLoder.getReader(templateSource, encoding);
        }

        return dirLoder.getReader(templateSource, encoding);
    }

    @Override
    public void closeTemplateSource(Object templateSource) throws IOException {
        if (templateSource.getClass().getName().equals("freemarker.cache.URLTemplateSource")) {
            classpathLoder.closeTemplateSource(templateSource);
        }
        dirLoder.closeTemplateSource(templateSource);
    }
}
