/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Relay.Value;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Compressor;
/**
 * Add your docs here.
 */
public class ScoringMech extends Subsystem {
  DoubleSolenoid backBall;
  Talon frontML, frontMR;
  public DoubleSolenoid frontP1, frontP2;
  //DoubleSolenoid frontHatch;
  public ScoringMech(){
    // right
    // new DoubleSolenoid( 42, 2, 3 );
    backBall = new DoubleSolenoid( 10, 0, 1 );
    frontP1 = new DoubleSolenoid( 10, 2, 3 );
    frontP2= new DoubleSolenoid( 42, 4, 5 );
    //frontML = new Talon( 0 );
    //frontMR = new Talon( 1 );
    //frontHatch = new DoubleSolenoid( Constants.scoringPCM, 2, 3);
  }
  public void moveBackBall( DoubleSolenoid.Value v ){
    backBall.set( v );
  }
  /*public void moveFrontHatch( DoubleSolenoid.Value v ){
    frontHatch.set ( v );
  }*/
  //public void moveFrontMotor( double v ){
  //  frontML.set( v );
  //  frontMR.set( v );
  //}
  //public void moveFrontPiston( DoubleSolenoid.Value v ){
  //  frontP.set( v );
  //}
  /*public void dropAllPistons(){
    boolean done = false;
    for( int i = 0; i <= 20; i++ ){
      moveBackBall( DoubleSolenoid.Value.kReverse );
      //moveFrontHatch( DoubleSolenoid.Value.kReverse );
      if( i == 20 ){
        done = true;
      }
    }
    if( done ){
      moveBackBall( DoubleSolenoid.Value.kOff );
      //moveFrontHatch( DoubleSolenoid.Value.kOff );
    
  }*/
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
