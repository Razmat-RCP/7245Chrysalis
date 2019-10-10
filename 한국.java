package org.firstinspires.ftc.teamcode;

//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name= "한국", group = "Linear Opmode")
//@Disabled
public class 한국 extends LinearOpMode {
    private DcMotor Thing1;
    private DcMotor Thing2;

    @Override
    public void runOpMode() {
        //telemetry.addData("Abou: ", "Initialized"); //Abou tracker

        //boot dee scoopity woop
        Thing1.setDirection(DcMotor.Direction.FORWARD);
        Thing2.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();


        double leftPower;
        double rightPower;

        //tankdrive
        leftPower = -gamepad1.left_stick_y ;
        rightPower = -gamepad1.right_stick_y ;

        //power things
        Thing1.setPower(leftPower);
        Thing2.setPower(rightPower);

        //telemetry.addData("Abou: ", "Located"); //prints abous location to the phone

    }
}
