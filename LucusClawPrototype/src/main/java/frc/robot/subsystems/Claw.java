// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Claw extends SubsystemBase {
  DigitalInput limitSwitchInClaw;
  DigitalInput limitSwitchControl;
  DigitalInput limitSwitchOut;
  PWMVictorSPX motor;
  /** Creates a new Claw. */
  public Claw() {
    limitSwitchInClaw = new DigitalInput(0); // change based on input ports
    limitSwitchControl = new DigitalInput(1);
    limitSwitchOut = new DigitalInput(2);
    motor = new PWMVictorSPX(0); // change based on motor ports
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public boolean getLimitSwitchInClaw() {
    return limitSwitchInClaw.get();
  }
  
  public boolean getLimitSwitchControl() {
    return limitSwitchControl.get();
  }

  public boolean getLimitSwitchOut() {
    return limitSwitchOut.get();
  }

  public void motorRaw(double power){
    motor.set(power);
  }
}
