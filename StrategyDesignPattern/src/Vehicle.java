public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle()
    {

    }

    Vehicle(DriveStrategy driveStrategy)
    {
        this.driveStrategy = driveStrategy;
    }

    public void drive()
    {
        driveStrategy.drive();
    }
}
