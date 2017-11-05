import java.util.Random;

public class Motorcycle extends Vehicle{
    private static int nameNumber = 0;

    public Motorcycle(){
        setSpeed(100);
        setName();
        this.distanceTravelled = 0;
    }

    @Override
    public void setName() {
        nameNumber++;
        this.name = "Motorcycle " + Integer.toString(nameNumber);
    }

    @Override
    public void moveForAnHour() {
        this.distanceTravelled = speed + distanceTravelled;
    }

    @Override
    public void moveForAnHour(boolean isRaining){
        if(isRaining){
            speedInRain();
            moveForAnHour();
        }
        else{
            setSpeed(100);
            moveForAnHour();
        }
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

    private void speedInRain(){
        Random rand = new Random();
        int newSpeed = rand.nextInt(50) + 5;
        setSpeed(newSpeed);
    }
}
