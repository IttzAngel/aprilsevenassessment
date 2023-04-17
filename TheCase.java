package aprilsevenassessment;

public class TheCase {

    private static String model;
    private static String manufacturer;
    private static String powerSupply;
    private static Dimensions dimensions;

    public TheCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public static void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public static String caseDescription() {
        return "TheCase{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }

//    @Override
//    public String toString() {
//        return "TheCase{" +
//                "model='" + model + '\'' +
//                ", manufacturer='" + manufacturer + '\'' +
//                ", powerSupply='" + powerSupply + '\'' +
//                ", dimensions=" + dimensions +
//                '}';
//    }
}
