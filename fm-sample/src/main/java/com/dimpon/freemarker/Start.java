package com.dimpon.freemarker;

import com.dimpon.freemarker.freemarkerdemo.ConfigurationFactory;
import com.dimpon.freemarker.freemarkerdemo.DataModelFactory;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.*;


public class Start {

    public static void main(String[] args) throws Exception {




        /*Configuration cfg = ConfigurationFactory.createConfiguration();

        cfg.setTemplateLoader(new CustomTemplateLoader());
*/

        Configuration configuration = ConfigurationFactory.createConfiguration();

        Map<String, Object> input = DataModelFactory.createDataModel();




        Template template = configuration.getTemplate("index.ftl");



        // Write output to the console
        Writer consoleWriter = new OutputStreamWriter(System.out);
        template.process(input, consoleWriter);

        // For the sake of example, also write output into a file
        try (
                Writer fileWriter = new FileWriter(new File("output.html"))) {
            template.process(input, fileWriter);
        }

    }

}
