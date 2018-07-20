
public class Car extends Object{

private int wheels;
private int chairs;
private boolean headlights;
private CarEngine engine;
private String body;
private boolean gas;
private boolean brake;
private String gear;
private GasTank gastank;
private boolean leftblinker;
private boolean rightblinker;
public int getWheels() {
	return wheels;
}
public void setWheels(int wheels) {
	this.wheels = wheels;
}
public int getChairs() {
	return chairs;
}
public void setChairs(int chairs) {
	this.chairs = chairs;
}
public boolean isHeadlights() {
	return headlights;
}
public void setHeadlights(boolean headlights) {
	this.headlights = headlights;
}
public CarEngine getEngine() {
	return engine;
}
public void setEngine(CarEngine engine) {
	this.engine = engine;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public boolean isGas() {
	return gas;
}
public void setGas(boolean gas) {
	this.gas = gas;
}
public boolean isBrake() {
	return brake;
}
public void setBrake(boolean brake) {
	this.brake = brake;
}
public String getGear() {
	return gear;
}
public void setGear(String gear) {
	this.gear = gear;
}
public GasTank getGastank() {
	return gastank;
}
public void setGastank(GasTank gastank) {
	this.gastank = gastank;
}
public boolean isLeftblinker() {
	return leftblinker;
}
public void setLeftblinker(boolean leftblinker) {
	this.leftblinker = leftblinker;
}
public boolean isRightblinker() {
	return rightblinker;
}
public void setRightblinker(boolean rightblinker) {
	this.rightblinker = rightblinker;
}
public void Use() {
	System.out.println("sub says hi");
}

public void Talk() {
super.Use();
Use();
System.out.println(69 % 9);

}
}
