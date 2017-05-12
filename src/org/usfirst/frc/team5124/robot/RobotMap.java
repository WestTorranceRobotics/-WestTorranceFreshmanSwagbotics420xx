package org.usfirst.frc.team5124.robot;

import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static VictorSP leftMotor1;
	public static VictorSP leftMotor2;
	public static VictorSP rightMotor1;
	public static VictorSP rightMotor2;
	
	public void init() {
		leftMotor1 = new VictorSP(0);
		leftMotor2 = new VictorSP(1);
		rightMotor1 = new VictorSP(2);
		rightMotor2 = new VictorSP(3);
		
	}
	
}
