package ch01;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {
    }

    public Car(String company, String model, String color, int maxSpeed) {
        super();
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void speedUp() {
        speed++;
    }

    void speedDown() {
        speed--;
    }
}
