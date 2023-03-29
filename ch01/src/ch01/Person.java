package ch01;


public class Person {

	String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Person(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	String name;
    int age;
    Calculator cal;

    void smile() {
    }

    void eat() {
    }

    void getPlus() {
        System.out.print(cal.plus(1, 2));
    }

    void getMinus() {
        System.out.print(cal.minus(1, 2));
    }
}