package org.firstinspires.ftc.teamcode.TeleOp;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.RunCommand;
import com.arcrobotics.ftclib.command.button.GamepadButton;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.gamepad.GamepadKeys;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Commands.MecanumDriveCommand;
import org.firstinspires.ftc.teamcode.Subsystem.ARMsystem;
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
        ARMsystem m_arMsystem = new ARMsystem(hardwareMap, telemetry);


        ////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////
        new GamepadButton(gamepadDriver, GamepadKeys.Button.Y)
                .whileHeld(()-> m_arMsystem.SetPower(.5))
                        .whenReleased(()-> m_arMsystem.SetPower(0));

        new GamepadButton(gamepadDriver, GamepadKeys.Button.A)
                .whileHeld(()-> m_arMsystem.SetPower(-.5))
                .whenReleased(()-> m_arMsystem.SetPower(0));
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
