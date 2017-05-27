package org.usfirst.frc5124.WestTorranceLearn.subsystems;

import org.usfirst.frc5124.WestTorranceLearn.commands.DrivetrainJoystickPuppetry;
import org.usfirst.frc5124.WestTorranceLearn.Robot;
import org.usfirst.frc5124.WestTorranceLearn.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    private final RobotDrive robotDrive = RobotMap.drivetrainRobotDrive;
    private final Compressor compressor = RobotMap.compressorCompressor;
    
    public void initDefaultCommand() {
       setDefaultCommand(new DrivetrainJoystickPuppetry());
    }
    
    public void tankDrive() {
    	robotDrive.tankDrive(Robot.oi.getLeftJoystick(), Robot.oi.getRightJoystick());
    }
}

