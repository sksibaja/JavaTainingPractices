package com.gap.course.model;

/**
 * Created by ssibaja on 5/1/17.
 */
public class Message {

    private String id;
    private String to;
    private String from;
    private String heading;
    private String body;

    public Message(String id, String to, String from, String heading, String body){
        this.id = id;
        this.to = to;
        this.from = from;
        this.heading = heading;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", heading='" + heading + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;

        Message message = (Message) o;

        if (getId() != null ? !getId().equals(message.getId()) : message.getId() != null) return false;
        if (getTo() != null ? !getTo().equals(message.getTo()) : message.getTo() != null) return false;
        if (getFrom() != null ? !getFrom().equals(message.getFrom()) : message.getFrom() != null) return false;
        if (getHeading() != null ? !getHeading().equals(message.getHeading()) : message.getHeading() != null)
            return false;
        return getBody() != null ? getBody().equals(message.getBody()) : message.getBody() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTo() != null ? getTo().hashCode() : 0);
        result = 31 * result + (getFrom() != null ? getFrom().hashCode() : 0);
        result = 31 * result + (getHeading() != null ? getHeading().hashCode() : 0);
        result = 31 * result + (getBody() != null ? getBody().hashCode() : 0);
        return result;
    }
}
