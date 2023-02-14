package Subcategory;

public class Phone extends Subcategory {
    private String speaker;
    private double camera;


    public Phone(double battery, double inch, int ram, String speaker, double camera) {
        super(battery, inch, ram);
        this.speaker = speaker;
        this.camera = camera;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public String phoneOn() {
        return "phoneOn";
    }

    public String phoneOff() {
        return "phoneOff";
    }

    @Override
    public String toString() {
        return "Phone: " + "battery " + getBattery() + "%, " + "inch " + getInch() + " in, " + "ram " + getRam() + " gb, " + "speaker " + speaker + ", camera " + camera + " mp";
    }
}
