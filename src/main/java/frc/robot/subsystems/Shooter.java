/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  private final CANSparkMax motor_uno = new CANSparkMax(Constants.ArmConstants.ARM_MOTOR_ONE, MotorType.kBrushless);
  private final CANSparkMax motor_dos = new CANSparkMax(Constants.ArmConstants.ARM_MOTOR_TWO, MotorType.kBrushless);
  /**
   * Creates a new ExampleSubsystem.
   */
  public Shooter() {

  }

  public void setSpeed(double speed) {
    motor_uno.set(-speed);
    motor_dos.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
