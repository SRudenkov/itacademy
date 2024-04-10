package com.idacademy;

/**
 * домашняя работа к уроку 6 от 03.04.2024
 * д1. Используйте полиморфизм, можете просто напечатать код из занятия или из видео из ютуба
 * 2. Создайте три интерфеса с абстрактными и дефолтными методами
 * 3. Добавьте интерфейсы в классы
 * 4. Переопределите методы в классах из интерфейсов
 *
 */
public class App {
    public static void main(String[] args) {

//        Car volvo = new CarBuilder().setModels("volvo_XC90").setHeight(2).setWeigh(2500).setMaxSpeed(220).createCar();
//        volvo.setLength(3800);
//        System.out.println("количество водителей с резерными на " + volvo.getModels() + " составляет " + volvo.drivers());
//
//        System.out.println(" модель  " + volvo.getModels() + " высота  " + volvo.getHeight() + " Вес  " + volvo.getWeigh()  + " максимальная скорость  " + volvo.getMaxSpeed() +  " длина  " + volvo.getLength());
//        Bus man = new Bus("MAN", 4, 5600, 140);
//        man.passengers = 25;
//        System.out.println(" модель  " + man.getModels() + " высота  " + man.getHeight() + " Вес  " + man.getWeigh()  + " максимальная скорость  " + man.getMaxSpeed() +  " количество пассажиров  " +  man.passengers);
//        volvo.print();
//        man.print();
//        Car volvo1 = new CarBuilder().setModels("volvo_XC60").setHeight(2).setWeigh(2600).createCar();
//        System.out.println(" модель  " + volvo1.getModels() + " высота  " + volvo1.getHeight() + " Вес  " + volvo1.getWeigh()  + " максимальная скорость  " + volvo1.getMaxSpeed() +  " длина  " + volvo1.getLength());
//        volvo.printinfo();
//        volvo.printinfo("это хорошая машина");
//        volvo.printinfo(25);
//
//        Engine engine1 = new Engine( 1560);
//        Radiator radiator1 = new Radiator(2000);
//        Battery battery1 = new Battery(4000);
//        Car electromobile = new Car(engine1, battery1,radiator1);
//
//        electromobile.setModels("Prius ");
//        System.out.print("наш автомобиль " + electromobile.getModels());
//        System.out.print("   имеент двигатель объемом  " + electromobile.engine.getVolumeEngine());
//        System.out.print("   радиатор со скоростью вращения   " + electromobile.radiator.getRotationSpeed());
//        System.out.print("   батарея емкостью   " + electromobile.battery.getContainer());
//        System.out.println( electromobile);
//        Scheme sxem = new Scheme("Биполярный", "питающая");
//        System.out.println(sxem);
//        Integralcheme integrshem = new Integralcheme(" Полевой ","логическая ", "микропроцессорная");
//        System.out.println(integrshem);

        Car mersedes = new Car();
        mersedes.CargoShipping();
        Bus bus = new Bus(45);
        bus.CargoShipping();
        HorseCarriege povozka = new HorseCarriege(4);
        povozka.CargoShipping();

        Transport mersedsVito = new Car();
        System.out.println(mersedsVito.drivers());
        mersedsVito = new Bus(5);
        System.out.println(mersedsVito.drivers());
        mersedes.preMovable();
    }

}
//private доступ только внутри класса
//protected  доступ внутри класса и в дочерних классах
//default доступ  внутри пэкэджа (это папки в проекте)
//public доступ  внутри проекта
