package Subcategory;

public class Subcategory {
    private double battery;
    private double inch;
    private int ram;

    public Subcategory() {
    }

    public Subcategory(double battery, double inch, int ram) {
        this.battery = battery;
        this.inch = inch;
        this.ram = ram;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Subcategory " + "battery " + battery + "%" + ", inch " + inch + "in" + ", ram " + ram + "gb";
    }
}
