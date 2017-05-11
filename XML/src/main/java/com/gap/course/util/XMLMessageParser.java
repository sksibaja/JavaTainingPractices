package com.gap.course.util;
import com.gap.course.model.Book;
import com.gap.course.model.Message;

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
import java.util.List;

import org.w3c.dom.Node;




/**
 * Created by ssibaja on 5/1/17.
 */
public class XMLMessageParser {

    private Document document;

    public XMLMessageParser (InputStream stream) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dbf.newDocumentBuilder();
        this.document = builder.parse(stream);
    }

    public List<Message> getAllMessages(){
        List<Message> messageList = new ArrayList<Message>();
        NodeList nl = document.getElementsByTagName("note");

        for(int i=0; i<nl.getLength(); i++){
            Message message = getMessage(nl.item(i));
            messageList.add(message);
        }
        return messageList;
    }


    private Message getMessage(Node node){

        String id = node.getAttributes().getNamedItem("id").getTextContent();
        String to = getNodeElement(node, "to");
        String from = getNodeElement(node,"from");
        String heading = getNodeElement(node, "heading");
        String body = getNodeElement(node,"body");

        Message msg = new Message(id, to, from, heading, body);
        return msg;

    }

    private String getNodeElement (Node node, String name){

        Element element = (Element) node;
        NodeList nl = element.getElementsByTagName(name);
        Node tag = nl.item(0);
        return tag.getTextContent();
    }

}
