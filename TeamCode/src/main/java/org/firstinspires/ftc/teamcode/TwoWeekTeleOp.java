package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="TwoWeekTeleOp", group="Tele-Op")


public class TwoWeekTeleOp extends LinearOpMode {
    //Initializes the robot hardware variable
    HardwareTwoWeek robot = new HardwareTwoWeek();
    public void runOpMode() {
        robot.init(this, hardwareMap, telemetry);

        //Left Stick
        double leftY, leftX;

        //Right Stick
        double rightY, rightX;

        //Triggers
        double leftTrigger, rightTrigger;

        //Claw Control
        boolean claw;

        waitForStart();

        while (opModeIsActive()) {
            telemetry.addLine()
                    .addData("Robot Online","");
            //Game pad input
            leftY = -gamepad1.left_stick_y;

            leftX = gamepad1.left_stick_x;

            rightY = -gamepad1.right_stick_y;

            leftTrigger = gamepad1.left_trigger;

            rightTrigger = gamepad1.right_trigger;

            claw = gamepad1.a;

            //Drive Train Control
            robot.frontLeftMotor.setPower(leftY + leftX + (rightTrigger - leftTrigger));
            robot.frontRightMotor.setPower(leftY - leftX - (rightTrigger - leftTrigger));
            robot.backLeftMotor.setPower(leftY - leftX - (rightTrigger - leftTrigger));
            robot.backRightMotor.setPower(leftY + leftX - (rightTrigger - leftTrigger));

            //Lift Control
            robot.liftMotor.setPower(rightY);

            //Claw Control
            if (claw) {
                robot.clawServoA.setPosition(0);
                robot.clawServoB.setPosition(0);
            } else {
                robot.clawServoA.setPosition(90);
                robot.clawServoB.setPosition(90);
            }
        }
    }
}
