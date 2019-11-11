//rleyvacortes22 is big brain 这是大脑时间
//rmehta22

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name= "Teleop", group = "Linear Opmode")
//@Disabled
public class Teleop extends LinearOpMode {
    ElapsedTime runtime = new ElapsedTime();
    DcMotor leftBack;
    DcMotor leftFront;
    DcMotor rightBack;
    DcMotor rightFront;
    Servo gripper;
    DcMotor vertTrans;
    DcMotor horizTrans;

    @Override
    public void runOpMode() {
        leftBack = hardwareMap.get(DcMotor.class, "leftback");
        leftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBack.setDirection(DcMotor.Direction.FORWARD);

        rightBack = hardwareMap.get(DcMotor.class, "rightback");
        rightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);

        leftFront = hardwareMap.get(DcMotor.class, "leftfront");
        leftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftFront.setDirection(DcMotor.Direction.FORWARD);

        rightFront = hardwareMap.get(DcMotor.class, "rightfront");
        rightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        gripper = hardwareMap.get(Servo.class, "gripper");
        vertTrans = hardwareMap.get(DcMotor.class, "vertTrans");
        horizTrans = hardwareMap.get(DcMotor.class, "horizTrans");

        double speedAdjust = 7.0;

        telemetry.addLine("Abou is being tracked...");
        telemetry.addLine("...");
        telemetry.addLine("Abou is located...");
        runtime.reset();

        waitForStart();

        while(opModeIsActive()){
            if(gamepad1.dpad_left) {
                speedAdjust -= 1;
            }
            if(gamepad1.dpad_right) {
                speedAdjust += 1;
            }

            if (gamepad2.right_bumper) {
                gripper.setPosition(100);
            }

            if  (gamepad2.left_bumper) {
                gripper.setPosition(-100);
            }

            if (gamepad2.x) {
                horizTrans.setPower(-1.0);
            }
            if (gamepad2.b) {
                horizTrans.setPower(1.0);
            }

            vertTrans.setPower((gamepad2.right_trigger));
            vertTrans.setPower(-(gamepad2.left_trigger));
            leftBack.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x)*(-speedAdjust/10));
            rightBack.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x)*(-speedAdjust/10));
            leftFront.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x)*(-speedAdjust/10));
            rightFront.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x)*(-speedAdjust/10));
        }
    }
}
