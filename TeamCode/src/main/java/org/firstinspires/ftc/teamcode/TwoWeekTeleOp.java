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
        double left_y, left_x;

        //Right Stick
        double right_y, right_x;

        //Triggers
        double left_t, right_t;

        while (opModeIsActive()) {
            left_y = -gamepad1.left_stick_y;

        }
    }
}
