package com.gap.course.util;

import com.gap.course.model.Book;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.w3c.dom.Node;

/**
 * Created by ssibaja on 4/26/17.
 */
public class XMLParser {

    private Document document;

    public XMLParser(InputStream stream) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        this.document = builder.parse(stream);
    }

    public List<Book> getAllBooks() throws IOException, SAXException, ParserConfigurationException {

        List<Book> bookList = new ArrayList<Book>();
        NodeList nl = document.getElementsByTagName("book");

        for(int i=0; i<nl.getLength(); i++){
            Book book = createBook(nl.item(i));
            bookList.add(book);
        }
        return bookList;

    }

    private Book createBook(Node node){

        String id = node.getAttributes().getNamedItem("id").getTextContent();

        String author = getElementValue(node,"author");
        String title = getElementValue(node,"title");
        String genre = getElementValue(node,"genre");
        String description = getElementValue(node,"description");

        Book book = new Book(id, author, title, genre, 0.0, null,  description);

        return book;
    }

    private String getElementValue(Node node, String name){
        Element elm = (Element) node;
        NodeList nl = elm.getElementsByTagName(name);
        Node tag = nl.item(0);
        return tag.getTextContent();
    }

}
