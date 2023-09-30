package com.test.unmarshal.Entity;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;


@Embeddable
public class Salary {
    private String currency;
    private int value;


    @XmlAttribute(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @XmlValue
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}