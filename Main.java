package aprilsevenassessment;

public class Main {

    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard("23", "Sony", 2, 4, "Sony-BIOS");
        Monitor monitor = new Monitor(24, "HP", new Resolution(50, 50));
        TheCase thecase = new TheCase("Windows XP", "Microsoft", "220 Volts", new Dimensions(200, 200, 100));
        PC pc = new PC();

        thecase.pressPowerButton();
        monitor.drawPixel(10, 10, "Purple");
        motherboard.loadProgram("Photoshop");







    }
}
