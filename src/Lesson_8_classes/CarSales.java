package Lesson_8_classes;

public class CarSales {
    public static void main(String[] args) {

        Car car1 = new Car(); //создаем экземпляр
        car1.year = 2015;
        car1.make = "Honda";
        car1.model = "Accord";
        car1.mileage = 75000;

        SaleAd ad1 = new SaleAd();
        ad1.car = car1;
        ad1.price = 15999.99;
        ad1.target = "Examiner";

        SaleAd ad2 = new SaleAd();
        ad2.car = car1;
        ad2.price = 17999.99;
        ad2.target = "Post";

        Car car2 = new Car();
        car2.year = 2020;
        car2.make = "Mazda";
        car2.model = "3";
        car2.mileage = 25000;

//        System.out.println(makeAd(car1));
//        System.out.println();
//        System.out.println(makeAd(car2));

        System.out.println(makeAd(ad1));
        System.out.println();
        System.out.println(makeAd(ad2));

    }

//    static String makeAd(Car car) { //1.Создается метод. Переменная car и ее тип Car, переменная типа Car действует только внутри этого метода
//        return "================\n" +
//                "  For Sale!\n" +
//                "================\n"+
//                car.year + " " + car.make + " " + car.model + "\n" +
//                "Excellent condition! Only " + car.mileage + " miles!\n" +
//                "================\n";
//    }
    static String makeAd(SaleAd ad) { //1.Создается метод. Переменная car и ее тип Car, переменная типа Car действует только внутри этого метода, ad - данные объявления
    return "================\n" +
            "  For Sale! Only for" + ad.target + " readers\n" +
            "================\n"+
            ad.car.year + " " + ad.car.make + " " + ad.car.model + "\n" +
            "Excellent condition! Only " + ad.car.mileage + " miles!\n" +
            "Get it today for only " + ad.price + "\n" +
            "================\n";
}

}
