package Computer;

import Subcategory.Computer;

public class Lenovo extends Computer {


    public Lenovo(double battery, double inch, int ram, String CPU, String OS) {
        super(battery, inch, ram, CPU, OS);
    }

    @Override
    public String gaming() {
        return super.gaming();
    }

    @Override
    public String coding() {
        return super.coding();
    }

    @Override
    public String toString() {
        return "Lenovo: "  + "battery " + getBattery() + "%, " + "inch " + getInch() + " in, " + "ram " + getRam() + " gb, " + "CPU " + getCPU() + ", " + "OS " + getOS();
    }
}
