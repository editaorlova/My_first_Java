package Lesson_10_polymorphism;

public class Car {

    public Car(int mileage) {
        this.mileage = mileage;
    }
    static int numberOfWheels = 4;
    int mileage;

    public static int getMileage(Car car) {
        return car.mileage;
    }

    int getNumberOfWheels() { //инстанс методы знают, из какого чертежа сделаны, они имеют доступ к полям. Наоборот - нет
        return numberOfWheels;
    }

}

