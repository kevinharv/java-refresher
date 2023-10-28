public class Car {
    protected String manufacturer;
    protected String model;
    protected String trim;
    protected String color;
    protected int year;

    protected double horsepower;
    protected double torque;

    public Car() {
       this.manufacturer = "Ford";
       this.model = "F-150";
       this.trim = "XLT";
       this.color = "Red";
       this.year = 2013;
       this.horsepower = 500.0;
       this.torque = 250.0;
    }

    public void setColor(String newColor) { this.color = newColor; }
    public void setHP(double newHP) { this.horsepower = newHP; }
    public void setTorque(double newTorque) { this.torque = newTorque; }

    public String getManufacturer() { return this.manufacturer; }
    public String getModel() { return this.model; }
    public String getTrim() { return this.trim; }
    public String getColor() { return this.color; }
    public double getHP() { return this.horsepower; }
    public double getTorque() { return this.torque; }
}