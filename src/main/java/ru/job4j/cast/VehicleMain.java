package ru.job4j.cast;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();
        Train train2 = new Train();
        Bus bus2 = new Bus();
        Airplane airplane2 = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{train, bus, airplane, train2, bus2, airplane2};

        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }
}
