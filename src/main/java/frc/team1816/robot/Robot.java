package frc.team1816.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import frc.team1816.robot.subsystems.Drivetrain;
import com.edinarobotics.utils.gamepad.Gamepad;

public class Robot extends IterativeRobot {
    private Drivetrain drivetrain;
    private Gamepad gamepad;

    @Override
    public void robotInit(Gamepad gamepad) {
        drivetrain = Components.getInstance().drivetrain;
        gamepad = gamepad;

        System.out.println("Initialized");
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() { }

    @Override
    public void testPeriodic() { }
}