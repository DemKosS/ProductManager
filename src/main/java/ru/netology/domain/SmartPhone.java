package ru.netology.domain;

public class SmartPhone extends Product {
    protected String producer;

    public SmartPhone() {

    }

    public SmartPhone(String producer) {
        this.producer = producer;
    }

    public SmartPhone(int id, String title, int price, String producer) {
        super(id, title, price);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
