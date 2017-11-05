import java.util.Random;

public class Truck extends Vehicle{
    private int breakdownTurnsLeft;

    public Truck(){
        setSpeed(100);
        setName();
        this.distanceTravelled = 0;
        this.breakdownTurnsLeft = 0;
    }

    @Override
    public void moveForAnHour(){
        isBreakdown();
        if(breakdownTurnsLeft != 0){ breakdownTurnsLeft--; }
        else { this.distanceTravelled = this.speed + this.distanceTravelled; }
    }

    @Override
    public void moveForAnHour(boolean isRaining) {
        moveForAnHour();
    }

    @Override
    public void setName() {
        Random rand = new Random();
        this.name = Integer.toString(rand.nextInt(1000));
    }

    @Override
    public String getType() {
        return "Truck";
    }

    private void isBreakdown(){
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;
        if(chance <= 5){
            breakdownTurnsLeft = 2;
        }
    }
}
