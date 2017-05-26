package org.usfirst.frc.team5124.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;



public class RobotMap {
	public static VictorSP drivetrainLeftMotor1;
	public static VictorSP drivetrainLeftMotor2;
	public static VictorSP drivetrainRightMotor1;                                         /*hardware for drivetrain Subsystem*/
	public static VictorSP drivetrainRightMotor2;
	public static RobotDrive drivetrainRobotDrive;
	                                                         
	public static VictorSP shootersShooterMotorLeft;                  
	public static VictorSP shootersShooterMotorMiddle;                                    /*hardware for Shooters Subsystem*/
	public static VictorSP shootersShooterMotorRight;                 
	
	public static VictorSP intakeIntakeMotor1;                                            /*hardware for Intake Subsystem*/
	public static VictorSP intakeIntakeMotor2;
	
	public static DoubleSolenoid gearMechanismGrabberSolenoid;                        /*hardware for GearMechanism Subsystem*/
	public static DoubleSolenoid gearMechanismLifterSolenoid;
	
	public static Compressor compressorCompressor;                                       /*need the compressor just in case we need to turn it off also your*/
	
	public static VictorSP agitatorAgitatorMotor;                                         /*hardware for the Agitator subsystem*/

	public void init() {
		
		drivetrainLeftMotor1 = new VictorSP(0);
		LiveWindow.addActuator("VictorSP","Left Motor 1", drivetrainLeftMotor1);          /*IMPORTANT!! ALWAYS IMPORT OR IT WON'T WORK KAPPA*/
		drivetrainLeftMotor2 = new VictorSP(1);                                           /*initializing DriveTrain Subsystem hardware and the port*/
		LiveWindow.addActuator("VictorSP","Left Motor 2", drivetrainLeftMotor2); 
		drivetrainRightMotor1 = new VictorSP(2);
		LiveWindow.addActuator("VictorSP","Right Motor 1", drivetrainRightMotor1);
		drivetrainRightMotor2 = new VictorSP(3);
		LiveWindow.addActuator("VictorSP","Right Motor 2", drivetrainRightMotor2);
		drivetrainRobotDrive = new RobotDrive(0, 2, 1, 3);
		
		shootersShooterMotorLeft = new VictorSP(4);
		LiveWindow.addActuator("VictorSP","Left Shooter Motor", shootersShooterMotorLeft);
		shootersShooterMotorMiddle = new VictorSP(5);                                     /*initializing Shooters Subsystem hardware and the port*/
		LiveWindow.addActuator("VictorSP","Middle Shooter Motor", shootersShooterMotorMiddle);
		shootersShooterMotorRight = new VictorSP(6);
		LiveWindow.addActuator("VictorSP","Right Shooter Motor", shootersShooterMotorRight);
		
		intakeIntakeMotor1 = new VictorSP(7);
		LiveWindow.addActuator("VictorSP", "Intake Motor 1", intakeIntakeMotor1);
		intakeIntakeMotor2 = new VictorSP(8);                                             /*initializing Intake Subsystem hardware and the port*/
		LiveWindow.addActuator("VictorSP", "Intake Motor 2", intakeIntakeMotor2);
		
		gearMechanismGrabberSolenoid = new DoubleSolenoid(1,2);                 /*initializing GearMechanism Subsystem hardware and the port*/
		LiveWindow.addActuator("DoubleSolenoid","Gear Mechanism Solenoid Left", gearMechanismGrabberSolenoid);
		gearMechanismLifterSolenoid = new DoubleSolenoid(3,4);
		LiveWindow.addActuator("DoubleSolenoid","Gear Mechanism Solenoid Right", gearMechanismLifterSolenoid);
		
		compressorCompressor = new Compressor(0);                                        /*saying that the compressor exists and what module they go into Eggs Dee*/
		LiveWindow.addActuator("Compressor","Compressor", compressorCompressor);
		
		agitatorAgitatorMotor = new VictorSP(11);					                      /*initializing Agitator subsystem hardware and the port*/
		LiveWindow.addActuator("VictorSP", "Agitator Motor", agitatorAgitatorMotor);
		
	}
	
	
}
