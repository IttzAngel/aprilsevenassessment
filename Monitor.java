package aprilsevenassessment;

public class Monitor {

    private int modelNumber;
    private String manufacturerName;
    private Resolution resolution;

    public Monitor(int modelNumber, String manufacturerName, Resolution resolution) {
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + " in color " + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "modelNumber=" + modelNumber +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", resolution=" + resolution +
                '}';
    }
}
