package SmartWatch;

import Subcategory.SmartWatch;

public class MiBand  extends SmartWatch {


    public MiBand(double battery, double inch, int ram, String OS, double inch1) {
        super(battery, inch, ram, OS, inch1);
    }

    @Override
    public String sms() {
        return super.sms();
    }

    @Override
    public String call() {
        return super.call();
    }

    @Override
    public String toString() {
        return "MiBand: " + "battery " + getBattery() + "%" + ", ram " + getRam() + " gb" + ", OS " + getOS() + ", inch " + getInch();
    }
}
