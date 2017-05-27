package org.usfirst.frc5124.WestTorranceLearn;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc5124.WestTorranceLearn.commands.*;
import org.usfirst.frc5124.WestTorranceLearn.subsystems.*;

public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    public static Drivetrain drivetrain;
    public static Agitator agitator;
    public static GearMechanism gearMechanism;                            /* All subsystems */
    public static Intake intake;
    public static Shooters shooters;

    public void robotInit() {
    	RobotMap.init();

    	drivetrain = new Drivetrain();
    	agitator =  new Agitator();
    	gearMechanism = new GearMechanism();							   /* initializing all subsystems */
    	intake = new Intake();
    	shooters = new Shooters();
        oi = new OI();
        
    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
