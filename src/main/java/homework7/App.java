package homework7;

/**
 * Домашнее задание 7
 * 1. Переопределите toString, equals, hashcode и вызовите их в main методе +
 * 2. Добавьте статическую переменную и статический метод, вызовите метод в main методе+
 * 3. Создайте любой енам, в енаме должны быть переменные, конструктор, геттеры. В main методе распечатайте енам+
 * 4. Напишите свой hashcode and equals
 */


public class App {
    public static void main(String[] args){
        Person.Size();
     Person person1 = new Person("Ilia", 125, 175, 60);
        Person.Size();
     Person person2 = new Person("Ilia", 125, 175, 60);
        Person.Size();
     Person person3 = new Person("Andrew", 140, 177, 62);
        Person.Size();
     Person person4 = new Person("Helen", 100, 125, 28);
        Person.Size();
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
        System.out.println(person4.hashCode());
        System.out.println( person1.equals(person2));
        System.out.println( person3.equals(person4));
        System.out.println(person1.hashCode()==person2.hashCode());
        System.out.println(person2.hashCode()==person3.hashCode());
        System.out.println(person3.hashCode()==person4.hashCode());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println("Население нашего задания составляет  " + Person.population + " человек(а)");

/**
 * ENAM
 */
       for(MonthOfYear monthOfYear: MonthOfYear.values()) {
           System.out.println(monthOfYear);
       }

    }
}
