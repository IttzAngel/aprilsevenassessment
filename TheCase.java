package aprilsevenassessment;

public class TheCase {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public TheCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }


}
