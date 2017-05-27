package org.usfirst.frc5124.WestTorranceLearn.commands;

import org.usfirst.frc5124.WestTorranceLearn.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DrivetrainJoystickPuppetry extends Command {

    public DrivetrainJoystickPuppetry() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.tankDrive();
    }

  
    protected boolean isFinished() {
        return false;
    }

   
    protected void end() {
    }

   
    protected void interrupted() {
    }
}
