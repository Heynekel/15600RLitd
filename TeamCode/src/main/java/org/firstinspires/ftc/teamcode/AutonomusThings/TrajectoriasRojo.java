package org.firstinspires.ftc.teamcode.AutonomusThings;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class TrajectoriasRojo {
    public Trajectory rojoder1(SampleMecanumDrive drive){

Pose2d firstpose = new Pose2d(10.94, -65.98, Math.toRadians(90.00));
drive.setPoseEstimate(firstpose);
return drive.trajectoryBuilder(firstpose)
        .lineToLinearHeading(new Pose2d(5.65, -33.39, Math.toRadians(90.00)))
        .build();
    }

    public Trajectory rojoder2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(5.80, -35.45, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-48.37, -38.09, Math.toRadians(90.00)))
                .build();


    }

    public  Trajectory rojoder3(SampleMecanumDrive drive){
       return drive.trajectoryBuilder(new Pose2d(-48.51, -38.53, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-57.91, -56.59, Math.toRadians(50.00)))
                .build();


    }

    public Trajectory rojoder4 (SampleMecanumDrive drive) {
    return  drive.trajectoryBuilder(new Pose2d(-57.91, -56.59, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-59.23, -37.50, Math.toRadians(90.00)))
                .build();


    }

    public  Trajectory rojoder5(SampleMecanumDrive drive){
return drive.trajectoryBuilder(new Pose2d(-59.96, -37.21, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-57.61, -56.59, Math.toRadians(50.00)))
                .build();

    }
    public  Trajectory rojoder6(SampleMecanumDrive drive){
 return drive.trajectoryBuilder(new Pose2d(-57.61, -56.59, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-69.50, -37.65, Math.toRadians(90.00)))
                .build();

    }

    public  Trajectory rojoder7(SampleMecanumDrive drive){

 return   drive.trajectoryBuilder(new Pose2d(-69.50, -38.53, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-55.85, -57.47, Math.toRadians(50.00)))
                .build();

    }
    public  Trajectory rojoder8(SampleMecanumDrive drive){
 return  drive.trajectoryBuilder(new Pose2d(-56.15, -57.61, Math.toRadians(90.00)))
                .splineTo(new Vector2d(-49.69, -23.85), Math.toRadians(53.51))
                .lineToLinearHeading(new Pose2d(-24.88, -12.70, Math.toRadians(0.00)))
                .build();

    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////

    public  Trajectory reojoiz1(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-14.02, -60.11, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-6.09, -32.95, Math.toRadians(90.00)))
                .build();

    }

    public  Trajectory rojoizq2(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-5.94, -34.86, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-49.25, -37.94, Math.toRadians(90.00)))
                .build();

    }

    public  Trajectory rojoizq3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-48.51, -38.53, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-57.91, -56.59, Math.toRadians(50.00)))
                .build();


    }

    public Trajectory rojoizq4 (SampleMecanumDrive drive) {
        return  drive.trajectoryBuilder(new Pose2d(-57.91, -56.59, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-59.23, -37.50, Math.toRadians(90.00)))
                .build();


    }

    public  Trajectory rojoizq5(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-59.96, -37.21, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-57.61, -56.59, Math.toRadians(50.00)))
                .build();

    }
    public  Trajectory rojoizq6(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(-57.61, -56.59, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-69.50, -37.65, Math.toRadians(90.00)))
                .build();

    }

    public  Trajectory rojoizq7(SampleMecanumDrive drive){
        return   drive.trajectoryBuilder(new Pose2d(-69.50, -38.53, Math.toRadians(90.00)))
                .lineToLinearHeading(new Pose2d(-55.85, -57.47, Math.toRadians(50.00)))
                .build();

    }
    public  Trajectory rojoizq8(SampleMecanumDrive drive){
        return  drive.trajectoryBuilder(new Pose2d(-56.15, -57.61, Math.toRadians(90.00)))
                .splineTo(new Vector2d(-49.69, -23.85), Math.toRadians(53.51))
                .lineToLinearHeading(new Pose2d(-24.88, -12.70, Math.toRadians(0.00)))
                .build();

    }

}
