package org.firstinspires.ftc.teamcode.Subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorImplEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.HashMap;

public class ARMsystem extends SubsystemBase {
    HardwareMap hardwareMap;
    Telemetry telemetry;
    DcMotorEx arm, arm2;

    public  ARMsystem(HardwareMap hardwareMap, Telemetry telemetry){
        this.telemetry = telemetry;
        this.hardwareMap = hardwareMap;
        arm = hardwareMap.get(DcMotorImplEx.class, "arm");
        arm2 = hardwareMap.get(DcMotorImplEx.class, "arm2");
        arm.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        arm2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        arm2.setDirection(DcMotorSimple.Direction.FORWARD);
       // arm.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);*/
    }

    public  void  SetPower(double power){
        arm.setPower(power);
        arm2.setPower(power);
    }
    public void setPoint(int position, double power) {
        arm.setTargetPosition(position);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        arm.setPower(power);
        arm2.setTargetPosition(position);
        arm2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        arm2.setPower(power);

}

    public boolean isAtSetPoint() {
        boolean isAtSetPoint = arm2.getCurrentPosition() - arm2.getTargetPosition() < arm2.getTargetPositionTolerance();
        return isAtSetPoint;
    }
    @Override
    public  void periodic(){
        telemetry.addData("arm", arm.getCurrentPosition());
        telemetry.addData("arm2", arm2.getCurrentPosition());
    }
    }
