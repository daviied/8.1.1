package org.firstinspires.ftc.teamcode.Betas;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw extends LinearOpMode {

    Servo x;
    Servo y;

    public boolean define(Servo a, Servo b) {

        x = b;
        y = a;



        return true;
    }

    public void close() {

       x.setPosition(0);
        y.setPosition(1);


    }

    public void open() {
        y.setPosition(0);
        x.setPosition(1);



    }


    @Override
    public void runOpMode() throws InterruptedException {

    }
}
