class CargoAirliner extends AirTransporter {

  private double maxCargoWeight;

  public CargoAirliner(String manufacturer, double maxAltitude, double maxSpeed, double maxCargoWeight) {
    super(manufacturer, maxAltitude, maxSpeed);
    this.maxCargoWeight = maxCargoWeight;
  }

  public void showDetails() {
    super.showDetails();
    System.out.println("Cargo Weight: " + maxCargoWeight);
  }
}

