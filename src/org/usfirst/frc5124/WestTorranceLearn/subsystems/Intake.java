package org.usfirst.frc5124.WestTorranceLearn.subsystems;

import org.usfirst.frc.team5124.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

   private final VictorSP intakeMotor1 = new RobotMap().intakeIntakeMotor1;
   private final VictorSP intakeMotor2 = new RobotMap().intakeIntakeMotor2;

    public void initDefaultCommand() {
        
    }
}

