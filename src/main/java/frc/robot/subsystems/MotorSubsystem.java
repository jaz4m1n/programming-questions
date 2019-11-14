/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.RobotMap;
import frc.robot.util.ShuffleboardUtil;

/**
 * Motor subsystem.
 * Makes robot go zoom.
 */
public class MotorSubsystem extends Subsystem {

  /**
   * Task 2
   * Flip the back and the front motor controllers (Make the back the front, and vice versa)
   * (look at RobotMap.java line 24 for the answers)
   */

  /** The Spark motor controller for the front left side of the robot. */
  private final Spark frontLeft = new Spark(RobotMap.frontLeftSparkPort);

  /** The Spark motor controller for the front right side of the robot. */
  private final Spark frontRight = new Spark(RobotMap.frontRightSparkPort);

  /** The Spark motor controller for the back left side of the robot. */
  private final Spark backLeft = new Spark(RobotMap.backLeftSparkPort);

  /** The Spark motor controller for the back right side of the robot. */
  private final Spark backRight = new Spark(RobotMap.backRightSparkPort);

  /**
   * The differential mecanum for the motors.
   * This is where most of the driving action is performed.
   */
  /**
   * Task 4
   * Change the differential drivetrain to a mecanum drivetrain
   */
  /**
   * Reasoning
   * First, we have to import MecanumDrive from WPILib
   * Then we can remove the motor controller groups
   * Next, we replace the DifferentialDrive with MecanumDrive
   *    We have to make sure that we put the motor controllers in the right spots (frontLeft, backLeft, frontRight, backRight)
   * Cont on Robot.java line 116
   */
  public final MecanumDrive drive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);

  public MotorSubsystem() {
    ShuffleboardUtil
      .tab
        .add("Differential Drive Train", drive)
        .withSize(4, 2)
        .withPosition(0, 0)
        .withWidget(BuiltInWidgets.kMecanumDrive);
  }

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  // setDefaultCommand(new MySpecialCommand());
  }
}
