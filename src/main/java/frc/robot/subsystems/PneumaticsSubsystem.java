/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.RobotMap;

/**
 * Motor subsystem.
 * Makes robot go zoom.
 */
public class PneumaticsSubsystem extends Subsystem {
  /** The solenoid. */
  /**
   * Task 3
   * Add another solenoid with ports 1 and 2
   */
  /**
   * Reasoning
   * Since we need another solenoid, and we only have one in this file, we should rename the existing solenoid to differentiate it better from our new one
   * We should also update the old variable names to work with the new variable name
   * Cont. on RobotMap.java line 84
   * 
   */
  public final DoubleSolenoid solenoidOne = new DoubleSolenoid(
    RobotMap.doubleSolenoidOneForwardChannel,
    RobotMap.doubleSolenoidOneReverseChannel
  );
  public final DoubleSolenoid solenoidTwo = new DoubleSolenoid(
    RobotMap.doubleSolenoidTwoForwardChannel, 
    RobotMap.doubleSolenoidTwoReverseChannel
    );
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  // setDefaultCommand(new MySpecialCommand());
  }
}
