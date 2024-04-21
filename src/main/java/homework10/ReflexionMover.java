package homework10;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * * `getName()` — возвращает имя и пакет класса;
 * * `getSimpleName()` — возвращает имя класса без пакета;
 * * `getModifiers()` — возвращает модификаторы класса;
 * * `getSuperclass()` — возвращает родительский класс;
 * * `getInterfaces()` — возвращает список интерфейсов, которые наследует класс;
 * * `getConstructors()` — возвращает список конструкторов класса;
 * * `getFields()` — возвращает список публичных полей класса;
 * * `getDeclaredFields()` — возвращает список всех полей класса, в том числе приватных;
 * * `getMethods()` — возвращает массив публичных методов класса;
 * * `getDeclaredMethods()` — возвращает массив всех методов класса, в том числе приватных;
 * * `getPackage()` — возвращает имя пакета класса.
 */

public class ReflexionMover {
    public static void main(String[] args) throws ClassNotFoundException {


        Class moverClass = Mover.class;

        System.out.println(moverClass.getMethods());
        Method[] methods = moverClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);

        Class moverClass1 = new Mover().getClass();
        Class moverClass2 = Class.forName("homework10.Mover");

    }
}
