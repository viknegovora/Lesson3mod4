package com.example.lesson3mod4;

public class Car {

    // поля сущности

    private String name;// поле названия марки автомобиля
    private String nameDescription;// поле модельного ряда автомобилей
    private int carResource;// поле ресурса автомобиля
    private String carPrice; // поле цены на автомобиль

    // конструктор
    public Car(String name,String nameDescription,int carResource, String carPrice) {
        this.name = name;
        this.nameDescription = nameDescription;
        this.carResource = carResource;
        this.carPrice = carPrice;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameDescription() {
        return nameDescription;
    }

    public void setNameDescription(String nameDescription) {
        this.nameDescription = nameDescription;
    }

    public int getCarResource() {
        return carResource;
    }

    public void setCarResource(int carResource) {
        this.carResource = carResource;
    }

    public String getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(String carPrice) {
        this.carPrice = carPrice;
    }
}
