package com.danner;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
    public String first;
    public String last;

    public Person() {} // JAXB needs this

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}