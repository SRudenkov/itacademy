package homework10;


import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@MyAnnotation()
public class Mover {
    @MyAnnotation()
    private String name;
    @MyAnnotation
    private int age;
    @MyAnnotation
    private  int moveWeight;
    @MyAnnotation
    private  boolean endurance;
    @MyAnnotation
    public int  calculateMove(){
        int calcWeight = 10;
        int indexWeight = 1;
        if (age >= 20 && endurance)  indexWeight = 2;
        else  indexWeight = 1;
        return calcWeight = moveWeight * indexWeight;

    }


}
