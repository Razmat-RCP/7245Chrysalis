package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name= "한국", group = "Linear Opmode")
//@Disabled
public class 한국 extends LinearOpMode {
    ElapsedTime runtime = new ElapsedTime();
    DcMotor leftBack;
    DcMotor leftFront;
    DcMotor rightBack;
    DcMotor rightFront;

    @Override
    public void runOpMode() {
        leftBack = hardwareMap.get(DcMotor.class, "left_drive");
        leftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBack.setDirection(DcMotor.Direction.FORWARD);

        rightBack = hardwareMap.get(DcMotor.class, "right_drive");
        rightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);

        leftFront = hardwareMap.get(DcMotor.class, "left_drive");
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftFront.setDirection(DcMotor.Direction.FORWARD);

        rightFront = hardwareMap.get(DcMotor.class, "right_drive");
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setDirection(DcMotor.Direction.REVERSE);

        double speedAdjust = 7.0;

        waitForStart();
        telemetry.addLine("Abou is being tracked...");
        telemetry.addLine("...");
        telemetry.addLine("Abou is located...");
        runtime.reset();

        while(opModeIsActive()){
            if(gamepad1.dpad_left) {
                speedAdjust -= 1;
            }
            if(gamepad1.dpad_right) {
                speedAdjust += 1;
            }

            leftBack.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x)*(-speedAdjust/10));
            rightBack.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x)*(-speedAdjust/10));
            leftFront.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x)*(-speedAdjust/10));
            rightFront.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x)*(-speedAdjust/10));
            }
        }
    }
