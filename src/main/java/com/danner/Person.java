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
}