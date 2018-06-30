package frc.team1816.robot;

import frc.team1816.robot.subsystems.ExampleSubsystem;

public class Components {
    private static Components instance;
    private ExampleSubsystem drivetrain;

    //Drivetrain motor id numbers
    private static final int LEFT_MASTER = 0;
    private static final int LEFT_SLAVE = 1;
    private static final int RIGHT_MASTER = 2;
    private static final int RIGHT_SLAVE = 3;

    public Components(){
        this.drivetrain = new ExampleSubsystem(LEFT_MASTER, LEFT_SLAVE, RIGHT_MASTER, RIGHT_SLAVE);
    }

    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }


}
