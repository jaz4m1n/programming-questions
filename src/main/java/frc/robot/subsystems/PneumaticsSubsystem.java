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
  public final DoubleSolenoid solenoid = new DoubleSolenoid(
    RobotMap.doubleSolenoidForwardChannel,
    RobotMap.doubleSolenoidReverseChannel
  );
     public final DoubleSolenoid domino = new DoubleSolenoid(
    RobotMap.doubleDominoForwardChannel,
    RobotMap.doubleDominoReverseChannel
 );
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  // setDefaultCommand(new MySpecialCommand());
  }
}
