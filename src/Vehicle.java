abstract public class Vehicle {
    protected int speed;
    protected String name;
    protected int distanceTravelled;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistanceTravelled(){ return this.distanceTravelled; }
    public String getName(){return this.name; }

    abstract public void setName();
    abstract public void moveForAnHour();
    abstract public void moveForAnHour(boolean isRaining);
    abstract public String getType();

}
