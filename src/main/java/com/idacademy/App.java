package com.idacademy;

/**
 * домашка:
 * 1. добавить конструкторы с ключевым словом super в дочерние классы +
 * 2. применить ключевое слово final для переменной, метода и класса +
 * 3. сделайте транспорт абстрактным классом и добавьте в него один абстрактный метод+
 * 4. переопредлите абстрактный метод в дочерних классах+
 * 5. создайте один неабстрактный метод в классе Transport и переопределите его только в классе Сar.+
 * Вызовите этот метод для обьектов классов Сar и Bus в методе main. Обьект класса Car должен вызвать
 * метод из класса Car, а обьект класса Bus из класса Transport
 * 6. примените перегрузку методов. Просто создайте 3 метода с именем printInfo, один метод без параметров,
 * второй принимает String, третий принимает int. Не пишите для этих методов большую логику. Просто выведите на экран
 * для первого метода - "Метод не принимает параметры", второго - "Метод принимает String", третьего - "Метод
 * принимает int". Вызовите эти методе в классе main. Для этих методов можете создать отдельный класс, чтобы они не
 * мазолили глаза в классах Car или Bus+
 * 7. создайте дополнительные классы Engine, Radiator, Battery. Используйте их как переменные в классе Car,
 * создайте конструктор для них. В main методе создайте три обьекта для Engine, Radiator, Battery и используйте
 * эти обьекты для создания обьекта Car
 * 8. создайте любые 3 класса. Первый класс должен наследовать второй, второй наследует третий. В третьем классе
 * создайте одну переменную и конструктор для нее. В первом классе и втором конструкторы со словом super для этой переменной
 * 9. во всех классах сделайте переменные приватными, и создайте геттеры и сеттеры для них. Если в проекте
 * появятся ошибки, то почините их. Например, если в main методе вы использовали car.model, то замените на car.getModel()
 * в тех местах, где вы получаете переменную и на car.setModel() в тех местах, где вы присваете значение model
 *
 */
public class App {
    public static void main(String[] args) {

        Car volvo = new CarBuilder().setModels("volvo_XC90").setHeight(2).setWeigh(2500).setMaxSpeed(220).createCar();
        volvo.setLength(3800);
        System.out.println("количество водителей с резерными на " + volvo.getModels() + " составляет " + volvo.drivers());

        System.out.println(" модель  " + volvo.getModels() + " высота  " + volvo.getHeight() + " Вес  " + volvo.getWeigh()  + " максимальная скорость  " + volvo.getMaxSpeed() +  " длина  " + volvo.getLength());
        Bus man = new Bus("MAN", 4, 5600, 140);
        man.passengers = 25;
        System.out.println(" модель  " + man.getModels() + " высота  " + man.getHeight() + " Вес  " + man.getWeigh()  + " максимальная скорость  " + man.getMaxSpeed() +  " количество пассажиров  " +  man.passengers);
        volvo.print();
        man.print();
        Car volvo1 = new CarBuilder().setModels("volvo_XC60").setHeight(2).setWeigh(2600).createCar();
        System.out.println(" модель  " + volvo1.getModels() + " высота  " + volvo1.getHeight() + " Вес  " + volvo1.getWeigh()  + " максимальная скорость  " + volvo1.getMaxSpeed() +  " длина  " + volvo1.getLength());
        volvo.printinfo();
        volvo.printinfo("это хорошая машина");
        volvo.printinfo(25);

        Engine engine1 = new Engine( 1560);
        Radiator radiator1 = new Radiator(2000);
        Battery battery1 = new Battery(4000);
        Car electromobile = new Car(engine1, battery1,radiator1);

        electromobile.setModels("Prius ");
        System.out.print("наш автомобиль " + electromobile.getModels());
        System.out.print("   имеент двигатель объемом  " + electromobile.engine.getVolumeEngine());
        System.out.print("   радиатор со скоростью вращения   " + electromobile.radiator.getRotationSpeed());
        System.out.print("   батарея емкостью   " + electromobile.battery.getContainer());
        System.out.println( electromobile);
        Scheme sxem = new Scheme("Биполярный", "питающая");
        System.out.println(sxem);
        Integralcheme integrshem = new Integralcheme(" Полевой ","логическая ", "микропроцессорная");
        System.out.println(integrshem);

    }




}
//private доступ только внутри класса
//protected  доступ внутри класса и в дочерних классах
//default доступ  внутри пэкэджа (это папки в проекте)
//public доступ  внутри проекта
