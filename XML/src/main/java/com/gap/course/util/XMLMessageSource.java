package com.gap.course.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by ssibaja on 5/1/17.
 */
public class XMLMessageSource {

    private String XMLSource = "<messages>\n" +
            "  <note id=\"501\">\n" +
            "    <to>Tove</to>\n" +
            "    <from>Jani</from>\n" +
            "    <heading>Reminder</heading>\n" +
            "    <body>Don't forget me this weekend!</body>\n" +
            "  </note>\n" +
            "  <note id=\"502\">\n" +
            "    <to>Jani</to>\n" +
            "    <from>Tove</from>\n" +
            "    <heading>Re: Reminder</heading>\n" +
            "    <body>I will not</body>\n" +
            "  </note>\n" +
            "</messages>";

    public InputStream getSource(){
        byte[] bytes = XMLSource.getBytes();
        InputStream source = new ByteArrayInputStream(bytes);
        return source;
    }
}
