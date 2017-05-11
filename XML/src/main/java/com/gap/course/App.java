package com.gap.course;

import com.gap.course.util.XMLMessageParser;
import com.gap.course.util.XMLMessageSource;
import com.gap.course.util.XMLParser;
import com.gap.course.util.XMLSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.gap.course.model.Book;
import com.gap.course.model.Message;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SAXException, ParserConfigurationException {

        XMLSource xmlSource = new XMLSource();

        XMLMessageSource xmlMessageSource = new XMLMessageSource();

        try {
            InputStream inputStream = xmlSource.getSource();
            XMLParser parser = new XMLParser(inputStream);

            List<Book> books = parser.getAllBooks();
            System.out.println(books);

        }catch (Exception ex){
            ex.printStackTrace();
        }

        //Get and print Messages
        System.out.println("");
        System.out.println("");
        System.out.println("Messages from Message XML:");
        System.out.println("");

        try{
            InputStream msgStream = xmlMessageSource.getSource();
            XMLMessageParser msgParser = new XMLMessageParser(msgStream);

            List<Message> messages = msgParser.getAllMessages();
            System.out.println(messages);

        }catch (Exception e){

        }
    }
}
