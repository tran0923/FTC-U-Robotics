package org.firstinspires.ftc.teamcode;

//Imports for various required classes
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.Telemetry;

public class HardwareTwoWeek {
    private HardwareMap hwMap = null;
    public ElapsedTime timer = new ElapsedTime();

    //Drive train motors
    public DcMotor frontLeftMotor;
    public DcMotor frontRightMotor;
    public DcMotor backLeftMotor;
    public DcMotor backRightMotor;

    //Lift
    public DcMotor liftMotor;

    //Claw Servo
    public Servo clawServoA;
    public Servo clawServoB;

    //Robot Classes
    public Telemetry localTelemetry;

    public LinearOpMode linearOpMode;

    public HardwareTwoWeek() {
    }
    //Current initialization of the hardware class
    //This can be easily improved to handle new devices and motors
    public void init(LinearOpMode linearOpMode, HardwareMap ahwMap, Telemetry telemetry) {
        this.linearOpMode = linearOpMode;
        hwMap = ahwMap;
        localTelemetry = telemetry;

        //Hardware definitions
        //Drive Train Motors
        frontLeftMotor = hwMap.get(DcMotor.class, "frontLeftMotor");
        frontRightMotor = hwMap.get(DcMotor.class, "frontRightMotor");
        backLeftMotor = hwMap.get(DcMotor.class, "backLeftMotor");
        backRightMotor = hwMap.get(DcMotor.class, "backRightMotor");

        //Lift Motor
        liftMotor = hwMap.get(DcMotor.class, "liftMotor");

        //Claw Servos
        clawServoA = hwMap.get(Servo.class, "clawServoA");
        clawServoB = hwMap.get(Servo.class, "clawServoB");
    }

    //Here's where new robot control commands would go
}
