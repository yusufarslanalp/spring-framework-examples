package org.example;

public class XmlConfigBean {
    String name;
    int number;

    public XmlConfigBean(String name, int number) {
        this.name = name;
        this.number = number;
    }
    public XmlConfigBean() {
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Number: %d", name, number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
