package Phone;

import Subcategory.Phone;

public class Samsung extends Phone {


    public Samsung(double battery, double inch, int ram, String speaker, double camera) {
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
        return "Samsung: "   + "battery " + getBattery() + "%, " + "inch " + getInch() + " in, " + "ram " + getRam() + " gb, " + "speaker " + getSpeaker() + ", camera " + getCamera() + " mp";
    }
}
