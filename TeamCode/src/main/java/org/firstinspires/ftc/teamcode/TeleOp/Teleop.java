package org.firstinspires.ftc.teamcode.TeleOp;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Commands.MecanumDriveCommand;
import org.firstinspires.ftc.teamcode.Subsystem.ARMsystem;
import org.firstinspires.ftc.teamcode.Subsystem.ElevatorSystem;
import org.firstinspires.ftc.teamcode.Subsystem.MecanumDriveSubsystem;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

@TeleOp

public class Teleop extends CommandOpMode {
    @Override
    public void initialize() {
        SampleMecanumDrive sampleMecanumDrive = new SampleMecanumDrive(hardwareMap);
        MecanumDriveSubsystem driveSubsystem = new MecanumDriveSubsystem(sampleMecanumDrive, false, false);
        GamepadEx gamepadDriver = new GamepadEx(gamepad1);
        GamepadEx gamepadsecond =  new GamepadEx(gamepad2);
        ElevatorSystem elevatorSystem =  new ElevatorSystem(hardwareMap, telemetry);
        ARMsystem arMsystem = new ARMsystem(hardwareMap, telemetry);

        new GamepadButton(gamepadsecond, GamepadKeys.Button.Y)
                .whileHeld(()-> elevatorSystem.setPoint(500, .7))
                .whenReleased(()-> elevatorSystem.setPoint(0, 0));

        new GamepadButton(gamepadsecond, GamepadKeys.Button.A)
                .whileHeld(()-> elevatorSystem.setPoint(0, .5))
                .whenReleased(()-> elevatorSystem.setPoint(0, 0));
        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        new GamepadButton(gamepadsecond, GamepadKeys.Button.RIGHT_BUMPER)
                .whileHeld(()-> elevatorSystem.setPower(1))
                        .whenReleased(()-> elevatorSystem.setPower(0));

        new GamepadButton(gamepadsecond, GamepadKeys.Button.LEFT_BUMPER)
                .whileHeld(()-> elevatorSystem.setPower(-1))
                .whenReleased(()-> elevatorSystem.setPower(0));
        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        new GamepadButton(gamepadDriver, GamepadKeys.Button.RIGHT_BUMPER)
                .whileHeld(()-> arMsystem.SetPower(.5))
                        .whenReleased(()-> arMsystem.SetPower(0));

        new GamepadButton(gamepadDriver, GamepadKeys.Button.LEFT_BUMPER)
                .whileHeld(()-> arMsystem.SetPower(-.5))
                .whenReleased(()-> arMsystem.SetPower(0));
        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        driveSubsystem.setDefaultCommand(new MecanumDriveCommand(
                driveSubsystem, () -> -gamepadDriver.getLeftY(), gamepadDriver::getLeftX, gamepadDriver::getRightX
        ));

        schedule(new RunCommand(() -> {
            driveSubsystem.update();
            telemetry.addData("Heading", driveSubsystem.getPoseEstimate().getHeading());
            telemetry.update();
        }));

    }
}
