package frc.robot;

// CTRE Libraries
import com.ctre.phoenix6.hardware.TalonFX;

// REV Libraries
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

public class SwerveModule {
  private final TalonFX m_driveMotor;
  private final CANSparkMax m_turnMotor;

  public SwerveModule(final int drivePort, final int turnPort, String canbus) {
    m_driveMotor = new TalonFX(drivePort, canbus);
    m_turnMotor = new CANSparkMax(turnPort, MotorType.kBrushless);
  }
}
