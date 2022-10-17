package buoi5;

import java.util.Scanner;

public class Rectangle {

    double dai, rong;

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Rectangle() {
    }

    public double getRong() {
        return rong;
    }

    public double getDai() {
        return dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    double doArea() {
        return dai * rong;
    }

    double doPerimeter() {
        return (dai + rong) * 2;
    }
}
