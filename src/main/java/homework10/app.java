/**
 * 1. Создайте два потока при помощи Thread и Runnable, переопределится метод run и запустите потоки+
 * 2. Создайте свою аннотацию и добавьте в свой класс-модель+
 * 3. Поиграйтесь с рефлексией для любого класса+
 * 4. Просто почитайте статью про солид принципы+
 */


package homework10;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class app {
    public static void main(String[] args){

        Mover mover1 = new Mover("Den",25,40, true);
        Mover mover2 = new Mover("Piter",11,15, false);
        Mover mover3 = Mover.builder().name("Den").age(25).moveWeight(40).endurance(true).build();
        System.out.println("Грузчик - " + mover2.getName() + "   может поднять " + mover2.calculateMove() + "  килограм за раз");
        System.out.println("Грузчик - " + mover1.getName() + "    может поднять " + mover1.calculateMove() + " килограм за раз");
        System.out.println("Грузчик - " + mover3.getName() + "    может поднять " + mover3.calculateMove() + " килограм за раз");
        System.out.println(mover1.equals(mover2));
        System.out.println(mover1.equals((mover3)));

        MyThread myThread = new MyThread();
        myThread.start();

        Runnable runnable = () -> {
            for(int i = 0; i<10; i++)
                System.out.println(Thread.currentThread().getName() + " runnable  " + i);
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //executorService.execute(runnable);





    }
}
