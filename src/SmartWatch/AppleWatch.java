package SmartWatch;

import Subcategory.SmartWatch;

public class AppleWatch extends SmartWatch {


    public AppleWatch(double battery, double inch, int ram, String OS, double inch1) {
        super(battery, inch, ram, OS, inch1);
    }

    @Override
    public String sms() {
        return "sms";
    }

    @Override
    public String call() {
        return "call";
    }

    @Override
    public String toString() {
        return "AppleWatch: "  + "battery " + getBattery() + "%" + ", ram " + getRam() + " gb" + ", OS " + getOS() + ", inch " + getInch();
    }
}
