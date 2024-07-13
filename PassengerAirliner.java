class PassengerAirliner extends AirTransporter {

  private int passengerCapacity;

  public PassengerAirliner(String manufacturer, double maxAltitude, double maxSpeed, int passengerCapacity) {
    super(manufacturer, maxAltitude, maxSpeed);
	
	
    this.passengerCapacity = passengerCapacity;
  }

  
  public void showDetails() {
    super.showDetails();
    System.out.println("Passenger Capacity: " + passengerCapacity);
  }
}
