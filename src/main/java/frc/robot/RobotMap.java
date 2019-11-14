/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  /**
   * Reasoning as to why this works
   * When we look at the front of the robot, we look at it like this.
   * Normal Ports
   * -----------------
   *      Front 
   *  ______________
   * |   |      |   | 
   * | 1 |      | 2 |
   * |___|      |___|
   * |              |
   * |              |
   * |              | 
   * |____       ___|
   * |   |      |   |
   * | 3 |      | 4 |
   * |___|______|___|
   *       Back
   * 
   * When we rotate the robot 180 degrees, as you can see, port 4 becomes the front left port, and port 3 becomes the front right port
   * Therefore, the ports go as such
   * 
   * Inverted Ports
   * -----------------
   *      Front       
   *  ______________
   * |   |      |   | 
   * | 4 |      | 3 |
   * |___|      |___|
   * |              |
   * |              |
   * |              | 
   * |____       ___|
   * |   |      |   |
   * | 2 |      | 1 |
   * |___|______|___|
   *       Back      
   */


  /** The port for the Spark motor controller on the front left. */
  public final static int frontLeftSparkPort = 4;

  /** The port for the Spark motor controller on the front right. */
  public final static int frontRightSparkPort = 3;

  /** The port for the Spark motor controller on the back left. */
  public final static int backLeftSparkPort = 2;

  /** The port for the Spark motor controller on the back right. */
  public final static int backRightSparkPort = 1;

  /** Controller port. */
  public final static int controllerPort = 0;

  /** The PCM channel to move the first double solenoid in the forward direction. */
  public final static int doubleSolenoidOneForwardChannel = 8;

  /** The PCM channel to move the first double solenoid in the reverse direction. */
  public final static int doubleSolenoidOneReverseChannel = 9;
 /** 
  * Reasoning cont.
  * We also want to make new RobotMap entries for easily changing the ports in the future
  * Therefore, we make new variables, and rename the old variables to conform with the changes
  */
  /** The PCM channel to move the first double solenoid in the reverse direction. */
  public final static int doubleSolenoidTwoForwardChannel = 1;
  
  /** The PCM channel to move the first double solenoid in the reverse direction. */
  public final static int doubleSolenoidTwoReverseChannel = 2;
}
