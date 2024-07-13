public class Start {

  public static void main(String[] args) {

    PassengerAirliner boeing747 = new PassengerAirliner("Boeing", 12000, 900, 250);
    boeing747.showDetails();
    System.out.println("\n");
    CargoAirliner airbus22 = new CargoAirliner("Airbus", 10000, 850, 150);

    airbus22.showDetails();
  }
}




