package org.firstinspires.ftc.teamcode.AutonomusThings;


import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
public class TrajectoriasAzul {

    public  Trajectory azulder1(SampleMecanumDrive drive){

        Pose2d firstPose = new Pose2d(-8.00, 63.34, Math.toRadians(-90.00));
        drive.setPoseEstimate(firstPose);
        return drive.trajectoryBuilder(new Pose2d(-11.67, 60.55, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(-5.50, 33.69, Math.toRadians(-90.00)))
                .build();
    }

    public Trajectory azulder2(SampleMecanumDrive drive){

         return drive.trajectoryBuilder(new Pose2d(7.41, 35.60, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(49.83, 36.92, Math.toRadians(-90.00)))
                .build();
    }
    public  Trajectory azulder3(SampleMecanumDrive drive){
 return drive.trajectoryBuilder(new Pose2d(47.49, 38.39, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(59.52, 55.56, Math.toRadians(225.00)))
                .build();
    }
    public Trajectory azulder4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(56.59, 56.44, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(59.08, 38.24, Math.toRadians(-90.00)))
                .build();


    }
    public Trajectory azulder5(SampleMecanumDrive drive){
        return  drive.trajectoryBuilder(new Pose2d(60.11, 37.80, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(58.50, 57.17, Math.toRadians(225.00)))
                .build();


    }
    public Trajectory azulder6(SampleMecanumDrive drive){
      return drive.trajectoryBuilder(new Pose2d(57.03, 57.47, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(69.06, 37.80, Math.toRadians(-90.00)))
                .build();


    }
    public Trajectory azulder7(SampleMecanumDrive drive){
       return drive.trajectoryBuilder(new Pose2d(68.77, 38.09, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(57.17, 57.61, Math.toRadians(225.00)))
                .build();


    }
    public Trajectory azulder8(SampleMecanumDrive drive){
         return drive.trajectoryBuilder(new Pose2d(57.03, 57.47, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(69.06, 37.80, Math.toRadians(-90.00)))
                .build();


    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public Trajectory azulizq1(SampleMecanumDrive drive){
        Pose2d firstpose = new Pose2d(15.93, 63.05, Math.toRadians(-90.00));
        drive.setPoseEstimate(firstpose);
        return drive.trajectoryBuilder(new Pose2d(15.93, 63.05, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(6.24, 32.95, Math.toRadians(-90.00)))
                .build();
    }

    public Trajectory azulizq2(SampleMecanumDrive drive){
       return drive.trajectoryBuilder(new Pose2d(7.41, 35.60, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(49.83, 36.92, Math.toRadians(-90.00)))
                .build();



    }
    public Trajectory azulizq3(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(47.49, 38.39, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(59.52, 55.56, Math.toRadians(225.00)))
                .build();

    }
    public Trajectory azulizq4(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(56.59, 56.44, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(59.08, 38.24, Math.toRadians(-90.00)))
                .build();

    }
    public Trajectory azulizq5(SampleMecanumDrive drive){
        return  drive.trajectoryBuilder(new Pose2d(60.11, 37.80, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(58.50, 57.17, Math.toRadians(225.00)))
                .build();


    }
    public Trajectory azulizq6(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(57.03, 57.47, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(69.06, 37.80, Math.toRadians(-90.00)))
                .build();

    }
    public Trajectory azulizq7(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(68.77, 38.09, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(57.17, 57.61, Math.toRadians(225.00)))
                .build();

    }
    public Trajectory azulizq8(SampleMecanumDrive drive){
        return drive.trajectoryBuilder(new Pose2d(57.03, 57.47, Math.toRadians(-90.00)))
                .lineToLinearHeading(new Pose2d(69.06, 37.80, Math.toRadians(-90.00)))
                .build();

    }
}
