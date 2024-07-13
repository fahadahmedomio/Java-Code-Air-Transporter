public class AirTransporter{
	private	String manufacturer;
	private	double maxAltitude;
	private	double maxSpeed;
	
	public AirTransporter(){
		
	}
	public AirTransporter(String manufacturer,double maxAltitude,double maxSpeed){
		setManufacturer(manufacturer) ;
		setMaxAltitude(maxAltitude);
		setMaxSpeed(maxSpeed);
	}
	
	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public String getManufacturer(){
		return this.manufacturer;
	}
	
	public void setMaxAltitude(double maxAltitude){
		this.maxAltitude=maxAltitude;
	}
	public double getMaxAltitude(){
		return this.maxAltitude;
	}
	
	public void setMaxSpeed(double maxSpeed){
		if(maxSpeed>=0)		{this.maxSpeed=maxSpeed;}
	}
		
	public double getMaxSpeed(){
		return this.maxSpeed;
	}
	
	public void showDetails(){
		System.out.println("Manufacturer :"+manufacturer);
		System.out.println("MaxAltitude :"+maxAltitude);
		System.out.println("MaxSpeed :"+maxSpeed);
	}
	
}