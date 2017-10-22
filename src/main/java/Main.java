package main.java;

import main.java.common.htmlreader.HtmlReader;
import main.java.common.propertiesreader.data.DataProperties;

import java.io.IOException;

public class Main {
    private static DataProperties dataProperties;

    public static void main(String[] args) throws IOException {
        HtmlReader htmlReader = new HtmlReader(dataProperties);
        htmlReader.creatingAndReadingHtml();
    }
}
