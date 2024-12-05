package org.firstinspires.ftc.teamcode.Subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Pinza extends SubsystemBase {
    HardwareMap hardwareMap;
    Telemetry telemetry;
    ServoEx pinza1, pinza2;

    public  Pinza(HardwareMap hardwareMap, Telemetry telemetry){
        this.hardwareMap = hardwareMap;
        this.telemetry =  telemetry;
        pinza1 = new SimpleServo(hardwareMap, "pinza1", 0, 180, AngleUnit.DEGREES);
        pinza2 = new SimpleServo(hardwareMap, "pinza2", 0, 180, AngleUnit.DEGREES);
    }

    public  void abrir(){
        pinza2.turnToAngle(180);
        pinza1.turnToAngle(180);
    }
    public void cerrar(){
        pinza1.turnToAngle(0);
        pinza1.turnToAngle(0);
    }

    @Override
    public  void periodic (){
        telemetry.addData("pinza1", pinza1.getAngle());
        telemetry.addData("pinza2", pinza2.getAngle());
    }

}
