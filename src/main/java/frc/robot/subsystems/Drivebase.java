// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

// WPILib
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;

// import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.DriveConstants.*;

public class Drivebase extends SubsystemBase {
  private final SwerveDriveKinematics m_swerveKinematics;
  /** Creates a new Drivebase. */
  public Drivebase() {
    m_swerveKinematics = new SwerveDriveKinematics(
      new Translation2d(kWheelbase / 2, kTracklength / 2),  // top-left
      new Translation2d(kWheelbase / 2, -kTracklength / 2), // top-right
      new Translation2d(-kWheelbase / 2, kTracklength / 2), // bot-left
      new Translation2d(-kWheelbase / 2, -kTracklength / 2) // bot-right
    );
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
