package ru.netology.domain;

public class SmartPhone extends Product {
    private  String producer;


    public SmartPhone() {

    }

    public SmartPhone(int id, String title, int price, String producer) {
        super(id, title, price);
        this.producer = producer;
    }


    public SmartPhone(String producer) {
        this.producer = producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public String getProducer() {
        return producer;
    }
}
