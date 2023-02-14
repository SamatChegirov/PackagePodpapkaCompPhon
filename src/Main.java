import Subcategory.*;
import Computer.*;
import Phone.*;
import SmartWatch.*;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(98, 17.3, 512, "CoreI7", "Windows");
        Mac mac = new Mac(100, 13.3, 512, "M1", "IOs");
        Lenovo lenovo = new Lenovo(99, 15.6, 512, "CoreI5", "Windows");

        Phone phone = new Phone(99, 6.1, 128, "stereo", 18);
        Samsung samsung = new Samsung(95, 6.7, 128, "stereo", 21);
        IPhone iPhone = new IPhone(99,6.1, 256, "stereo", 16);

        SmartWatch smartWatch = new SmartWatch(97, 2.7, 16, "WearOS", 1.2);
        AppleWatch appleWatch = new AppleWatch(99, 1.7, 32, "watchOS7", 1.7);
        MiBand miBand = new MiBand(98, 1.2, 16, "MiOS", 1.2);

        Subcategory[] subcat1 = new Subcategory[] {computer, mac, lenovo};
        for (Subcategory s : subcat1) {
            System.out.println(s);
        }
        System.out.println(" ");
        Subcategory[] subcat2 = new Subcategory[] {phone, samsung, iPhone};
        for (Subcategory c : subcat2) {
            System.out.println(c + ", " + phone.phoneOn() + ", " + phone.phoneOff());
        }
        System.out.println(" ");
        Subcategory[] subcat3 = new Subcategory[] {smartWatch, appleWatch, miBand};
        for (Subcategory t : subcat3) {
            System.out.println(t + ", " + smartWatch.sms() + " and" + smartWatch.call());
        }
        
    }
}