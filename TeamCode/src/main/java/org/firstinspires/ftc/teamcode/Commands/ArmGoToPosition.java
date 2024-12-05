package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.command.SubsystemBase;

import org.firstinspires.ftc.teamcode.Subsystem.ARMsystem;

public class ArmGoToPosition extends CommandBase {
ARMsystem arMsystem;
int position;

public  ArmGoToPosition ( ARMsystem arMsystem, int position){
    this.arMsystem = arMsystem;
    this.position = position;

    addRequirements(arMsystem);
}

@Override
    public  void execute(){
    arMsystem.setPoint(1, position);
}

    @Override
    public  boolean isFinished(){
        return  arMsystem.isAtSetPoint();
    }

}
