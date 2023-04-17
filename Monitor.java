package aprilsevenassessment;

public class Monitor {

    private static int modelNumber;
    private static String manufacturerName;
    private static Resolution resolution;

    public Monitor(int modelNumber, String manufacturerName, Resolution resolution) {
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
        this.resolution = resolution;
    }

    public static void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);
    }

    public static String monitorDescription() {
        return "Monitor{" +
                "modelNumber=" + modelNumber +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", resolution=" + resolution +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Monitor{" +
//                "modelNumber=" + modelNumber +
//                ", manufacturerName='" + manufacturerName + '\'' +
//                ", resolution=" + resolution +
//                '}';
//    }
}
