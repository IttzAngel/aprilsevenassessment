package aprilsevenassessment;

public class Motherboard {

    private static String model;
    private static String manufacturer;
    private static int ramSlots;
    private static int cardSlots;
    private static String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public static void loadProgram(String programName){
        System.out.println(programName + " is now running...");
    }

    public static String motherboardDescription() {
        return "Motherboard{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ramSlots=" + ramSlots +
                ", cardSlots=" + cardSlots +
                ", bios='" + bios + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Motherboard{" +
//                "model='" + model + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", ramSlots=" + ramSlots +
//                ", cardSlots=" + cardSlots +
//                ", bios='" + bios + '\'' +
//                '}';
//    }
}
