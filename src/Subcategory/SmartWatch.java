package Subcategory;

public class SmartWatch extends Subcategory {
    private String OS;
    private double inch;


    public SmartWatch(double battery, double inch, int ram, String OS, double inch1) {
        super(battery, inch, ram);
        this.OS = OS;
        this.inch = inch1;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public String sms() {
        return "read sms";
    }

    public String call() {
        return " answer the call";
    }

    @Override
    public String toString() {
        return "SmartWatch: " + "battery " + getBattery() + "%" + ", ram " + getRam() + " gb" + ", OS " + OS + ", inch " + inch;
    }
}
