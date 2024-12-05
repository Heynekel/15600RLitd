package org.firstinspires.ftc.teamcode.Commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.Subsystem.ElevatorSystem;

public class ElevatorGoToPosotion extends CommandBase {
    ElevatorSystem elevatorSystem;
    int setPoint;

    public ElevatorGoToPosotion(ElevatorSystem elevatorSystem, int setPoint){
        this.elevatorSystem =  elevatorSystem; ;
        this.setPoint =  setPoint;

addRequirements(elevatorSystem);
    }
@Override
    public void  execute(){
elevatorSystem.setPoint(1, setPoint);
}

@Override
    public  boolean isFinished(){
return  elevatorSystem.isAtSetPoint();
}
}
