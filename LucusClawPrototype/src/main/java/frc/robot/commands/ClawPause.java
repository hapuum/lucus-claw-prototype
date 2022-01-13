// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Claw;

public class ClawPause extends CommandBase {
  /** Creates a new ClawPause. */
  private Claw c;
  public ClawPause(Claw claw) {
    c = claw;
    addRequirements(c);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (!c.getLimitSwitchControl()) {
      if (c.getLimitSwitchInClaw()) {
        c.motorRaw(0);
      } else {
        c.motorRaw(-1.0);
      }
    } else if (!c.getLimitSwitchOut()){
      c.motorRaw(1.0);
    } else {
      c.motorRaw(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
