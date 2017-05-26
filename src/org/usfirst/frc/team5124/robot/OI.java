package org.usfirst.frc.team5124.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

import org.usfirst.frc.team5124.robot.commands.ExampleCommand;


public class OI {
	
	public static Joystick leftJoystick;
	public static Joystick rightJoystick;
	
	public OI() {
		
		leftJoystick = new Joystick(0);       			//left Joystick for tank drive
		rightJoystick = new Joystick(1);				//right Joystick for tank drive
		
		
	}
	
	public Joystick getLeftJoystick() {
		return leftJoystick; 
	}
	
	public Joystick getRightJoystick() {
		return rightJoystick;
	}
}
