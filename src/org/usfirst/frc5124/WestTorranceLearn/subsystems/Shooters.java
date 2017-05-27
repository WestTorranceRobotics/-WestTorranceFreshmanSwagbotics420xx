package org.usfirst.frc5124.WestTorranceLearn.subsystems;

import org.usfirst.frc.team5124.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class Shooters extends Subsystem {
	
	private final VictorSP leftShooter = new RobotMap().shootersShooterMotorLeft;
	private final VictorSP middleShooter = new RobotMap().shootersShooterMotorMiddle;
	private final VictorSP rightShooter = new RobotMap().shootersShooterMotorRight;


    public void initDefaultCommand() {
        
    }
}

