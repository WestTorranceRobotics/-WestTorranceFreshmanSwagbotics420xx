package org.usfirst.frc5124.WestTorranceLearn.subsystems;

import org.usfirst.frc.team5124.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearMechanism extends Subsystem {
	
	private final DoubleSolenoid GrabberSolenoid = new RobotMap().gearMechanismGrabberSolenoid;
	private final DoubleSolenoid LifterSolenoid = new RobotMap().gearMechanismLifterSolenoid;

  
    public void initDefaultCommand() {
        
    }
}

