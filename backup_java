//Code is from rover ruckus, not skystone master 
package org.firstinspires.ftc.teamcode;

//import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name= "Wabou mode", group = "Linear Opmode")
//@Disabled
public class backup extends LinearOpMode {
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DcMotor spinDrive;

    @Override
    public void runOpMode() {
        telemetry.addData("Abou: ", "Initialized");

        //boot dee scoopity woop
        leftDrive.setDirection(DcMotor.Direction.FORWARD);
        rightDrive.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();



            if (gamepad1.right_bumper) {
                spinDrive.setDirection(DcMotorSimple.Direction.FORWARD);
                spinDrive.setPower(1);
            }else{
                spinDrive.setPower(0);
            }

            if (gamepad1.left_bumper) {

                spinDrive.setDirection(DcMotorSimple.Direction.REVERSE);
                spinDrive.setPower(1);
            }else{
                spinDrive.setPower(0);
            }

            double leftPower;
            double rightPower;

            //tankdrive
        leftPower = -gamepad1.left_stick_y ;
        rightPower = -gamepad1.right_stick_y ;

        //power things
        leftDrive.setPower(leftPower);
        rightDrive.setPower(rightPower);

        telemetry.addData("Abou: ", "Located");

    }
}
