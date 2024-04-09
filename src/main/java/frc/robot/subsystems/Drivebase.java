// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

// CTRE Libraries
import com.ctre.phoenix6.hardware.TalonFX;

// REV Libraries
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

// WPILib
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.DriveConstants.*;

public class Drivebase extends SubsystemBase {
  private final TalonFX m_driveMotor;
  private final CANSparkMax m_turnMotor;

  /** Creates a new Drivebase. */
  public Drivebase() {
    m_driveMotor = new TalonFX(kDrivePort, "rio");
    m_turnMotor = new CANSparkMax(kTurnPort, MotorType.kBrushless);
  }

  private void setDriveSpeed(final double speed) {
    m_driveMotor.set(speed);
  }

  private void setTurnSpeed(final double speed) {
    m_turnMotor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public Command driveSpeedCommand(final double speed) {
    return this.run(() -> setDriveSpeed(speed));
  }
  
  public Command turnSpeedCommand(final double speed) {
    return this.run(() -> setTurnSpeed(speed));
  }

  public Command offCommand() {
    return this.runOnce(() -> {
      setDriveSpeed(0);
      setTurnSpeed(0);
    });
  }
}
