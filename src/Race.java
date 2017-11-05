import java.util.Random;
import java.util.ArrayList;

public class Race {

    private static ArrayList<ArrayList<Vehicle>> racers = new ArrayList<>();

    private static boolean isRaining;

    private static boolean setIsRaining(){
        Random rand = new Random();

        int rain = rand.nextInt(100) + 1;
        if(rain <= 30){ isRaining=true; }
        else{ isRaining=false; }

        return isRaining;
    }

    private static void createVehicles(){
        ArrayList<Vehicle> cars = new ArrayList<>();
        ArrayList<Vehicle> motors = new ArrayList<>();
        ArrayList<Vehicle> trucks = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            cars.add(new Car());
            motors.add(new Motorcycle());
            trucks.add(new Truck());
        }

        racers.add(cars);
        racers.add(motors);
        racers.add(trucks);

    }

    private static void simulateRace(){
        for(int i = 0; i < 50; i++){
            setIsRaining();
            for(ArrayList<Vehicle> list : racers){
                for(Vehicle vehicle : list){
                    vehicle.moveForAnHour(isRaining);
                }
            }
        }
    }

    private static void printRaceResults(){
        System.out.format("Printing race results:\n\n");
        for(ArrayList<Vehicle> list : racers){
            for(Vehicle vehicle : list){
                System.out.format("Vehicle name: %s, Distance travelled: %d, Vehicle type: %s\n",
                                  vehicle.getName(), vehicle.getDistanceTravelled(), vehicle.getType());
            }
        }
    }

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }
}
