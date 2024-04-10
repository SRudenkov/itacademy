package homework7;

public enum MonthOfYear {
    JANUARY(1, "Январь"),
    FABRUARY(2,"Февраль"),
    MARCH(3,"Март"),
    APRIL(4,"Апрель"),
    MAY(5,"Май"),
    JUNE(6,"Июнь"),
    JULY( 7,"Июль"),
    AUGUST( 8,"Август"),
    SEPTEMBER( 9,"Сентябрь"),
    OCTOBER( 10,"Октябрь"),
    NOVEMBER( 11,"Ноябрь"),
    DESEMBER( 12,"Декабрь");

    private int number;
    private String name;

    MonthOfYear(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "MonthOfYear{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }


}
