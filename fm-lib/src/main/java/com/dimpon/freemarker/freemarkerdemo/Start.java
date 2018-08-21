package com.dimpon.freemarker.freemarkerdemo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.*;

public class Start {

    public static void main(String[] args) throws Exception {


        Configuration cfg = ConfigurationFactory.createConfiguration();
        Template template = cfg.getTemplate("/templates/helloworld.ftl");

        Map<String, Object> input = DataModelFactory.createDataModel();


        // Write output to the console
        Writer consoleWriter = new OutputStreamWriter(System.out);
        template.process(input, consoleWriter);

        // For the sake of example, also write output into a file
        /*try (Writer fileWriter = new FileWriter(new File("output.html"))) {
            template.process(input, fileWriter);
        }*/


    }
}
