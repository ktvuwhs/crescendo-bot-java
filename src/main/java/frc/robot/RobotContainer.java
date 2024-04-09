// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

import static frc.robot.Constants.*;
import frc.robot.subsystems.Drivebase;

public class RobotContainer {
  private final Drivebase m_drivebase = new Drivebase();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    final CommandXboxController m_controller = new CommandXboxController(kControllerPort);
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
