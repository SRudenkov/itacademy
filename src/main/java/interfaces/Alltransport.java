package interfaces;

public interface Alltransport {

   public void CargoShipping();

   default  void  preMovable() {
      System.out.println("Не забудьте проверить техническое состояние транспорта");
   }
}
