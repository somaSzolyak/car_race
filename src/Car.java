import java.util.Random;
import java.util.ArrayList;

public class Car extends Vehicle{
    private static int speedLimit;
    private ArrayList<String> nameList = new ArrayList<>(10);

    public Car(){
        nameList.add("Nimbus");
        nameList.add("Moonlight");
        nameList.add("Paragon");
        nameList.add("Oracle");
        nameList.add("Fire");
        nameList.add("Fragment");
        nameList.add("Lightning");
        nameList.add("Magic");
        nameList.add("Striker");
        nameList.add("Phenomenom");
        normalSPeed();
        setName();
        this.distanceTravelled = 0;
        speedLimit = 0;
    }

    @Override
    public void setName(){
        Random rand = new Random();
        int firstNameIndex = rand.nextInt(9);
        int lastNameIndex = rand.nextInt(9);
        this.name = nameList.get(firstNameIndex) + " " + nameList.get(lastNameIndex);

    }

    @Override
    public void moveForAnHour(){
        if(speedLimit == 70){
            setSpeed(70);
            this.distanceTravelled = this.speed + this.distanceTravelled;
            normalSPeed();
        }
        else {
            this.distanceTravelled = this.speed + this.distanceTravelled;
        }
    }

    @Override
    public void moveForAnHour(boolean isRaining) {
        moveForAnHour();
    }

    @Override
    public String getType() {
        return "Car";
    }

    public static void setSpeedLimit(int limit){
        Random rand = new Random();
        int regulation = rand.nextInt(100) + 1;
        if(regulation <= 35){
            speedLimit = limit;
        }
        else{
            speedLimit = 0;
        }
    }

    private void normalSPeed(){
        Random rand = new Random();
        int newSpeed = rand.nextInt(110) + 80;
        setSpeed(newSpeed);
    }
}
