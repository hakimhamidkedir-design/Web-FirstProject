class Vehicle {
    String brand;
    int speed;
    int year;

    Vehicle(String brand, int speed, int year) {
        this.brand = brand;
        this.speed = speed;
        this.year = year;
    }

    void describe() {
        // Base method (can be empty or print common info)
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int year, int doors) {
        super(brand, speed, year);
        this.doors = doors;
    }

    @Override
    void describe() {
        System.out.println(
                "Car: " + brand +
                " | " + year +
                " | " + speed + " km/h" +
                " | Doors: " + doors);
    }
}

class Truck extends Vehicle {
    double cargoTons;

    Truck(String brand, int speed, int year, double cargoTons) {
        super(brand, speed, year);
        this.cargoTons = cargoTons;
    }

    @Override
    void describe() {
        System.out.println(
                "Truck: " + brand +
                " | " + year +
                " | " + speed + " km/h" +
                " | Cargo Tons: " + cargoTons + " t");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String brand, int speed, int year, boolean hasSidecar) {
        super(brand, speed, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void describe() {
        System.out.println(
                "Motorcycle: " + brand +
                " | " + year +
                " | " + speed + " km/h" +
                " | Sidecar: " + hasSidecar);
    }
}

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", 180, 2022, 4);
        Truck volvo = new Truck("Volvo", 120, 2020, 8.5);

        // Correct order: brand, speed, year, hasSidecar
        Motorcycle honda = new Motorcycle("Honda", 200, 2023, false);

        toyota.describe();
        volvo.describe();
        honda.describe();

        System.out.println("\n-- Loop output --");

        Vehicle[] vehicles = { toyota, volvo, honda };

        for (Vehicle v : vehicles) {
            v.describe();
        }
    }
} {
    
}
