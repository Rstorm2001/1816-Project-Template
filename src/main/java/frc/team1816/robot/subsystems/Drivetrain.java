package frc.team1816.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class Drivetrain extends Subsystem {

    private TalonSRX leftMaster;
    private TalonSRX leftSlave;
    private TalonSRX rightMaster;
    private TalonSRX rightSlave;

    public Drivetrain(int leftMaster, int leftSlave, int rightMaster, int rightSlave) {
        super();

        this.leftMaster = new TalonSRX(leftMaster);
        this.leftSlave = new TalonSRX(leftSlave);
        this.rightMaster = new TalonSRX(rightMaster);
        this.rightSlave = new TalonSRX(rightSlave);
    }

    public void setDrivetrainSpeed(double leftSpeed, double rightSpeed) {
        leftMaster.set(ControlMode.Velocity, leftSpeed);
        rightMaster.set(ControlMode.Velocity, rightSpeed);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
