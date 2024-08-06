class Car {
    String model;
    int year;
    String color;

    Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println();
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2020, "Red");
        Car car2 = new Car("Honda Civic", 2018, "Blue");

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
