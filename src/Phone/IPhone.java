package Phone;

import Subcategory.Phone;

public class IPhone extends Phone {


    public IPhone(double battery, double inch, int ram, String speaker, double camera) {
        super(battery, inch, ram, speaker, camera);
    }

    @Override
    public String phoneOn() {
        return super.phoneOn();
    }

    @Override
    public String phoneOff() {
        return super.phoneOff();
    }

    @Override
    public String toString() {
        return "IPhone: "  + "battery " + getBattery() + "%, " + "inch " + getInch() + " in, " + "ram " + getRam() + " gb, " + "speaker " + getSpeaker() + ", camera " + getCamera() + " mp";
    }
}
