package Subcategory;

import java.util.PrimitiveIterator;

public class Computer extends Subcategory {
    private String CPU;
    private String OS;



    public Computer(double battery, double inch, int ram, String CPU, String OS) {
        super(battery, inch, ram);
        this.CPU = CPU;
        this.OS = OS;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }



    public String gaming() {
        return "";
    }

    public String coding() {
        return "";
    }

    @Override
    public String toString() {
        return "Computer: " + "battery " + getBattery() + "%," + " inch " + getInch() + " in, " + getRam() + " gb, " + " CPU " + CPU + "," + " OS " + OS;
    }
}
