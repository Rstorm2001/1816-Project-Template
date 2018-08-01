package frc.team1816.robot.commands;

import com.edinarobotics.utils.gamepad.Gamepad;
import edu.wpi.first.wpilibj.command.Command;
import frc.team1816.robot.Components;
import frc.team1816.robot.subsystems.Drivetrain;

public class GamepadDriveCommand extends Command {
    private Drivetrain drivetrain;
    private Gamepad gamepad;


    public GamepadDriveCommand(Drivetrain drivetrain, Gamepad gamepad) {
        super();

        this.drivetrain = Components.getInstance().drivetrain;
        this.gamepad = gamepad;

        requires(drivetrain);
    }

    /**
     * The initialize method is called just before the first time
     * this Command is run after being started.
     */
    @Override
    protected void initialize() {

    }


    /**
     * The execute method is called repeatedly when this Command is
     * scheduled to run until this Command either finishes or is canceled.
     */
    @Override
    protected void execute() {
        
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
