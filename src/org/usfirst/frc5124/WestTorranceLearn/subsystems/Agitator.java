package org.usfirst.frc5124.WestTorranceLearn.subsystems;

import org.usfirst.frc.team5124.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Agitator extends Subsystem {
	
	private final VictorSP agitator = new RobotMap().agitatorAgitatorMotor;


    public void initDefaultCommand() {
        
    }
}

