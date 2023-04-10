package aprilsevenassessment;

public class PC {

    private Monitor monitor;
    private Motherboard motherboard;
    private TheCase thecase;

    public PC() {
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.thecase = thecase;
    }

    private void drawLogo(){
        monitor.drawPixel(10, 10, "Purple");
    }

    public void powerUp(){
        thecase.pressPowerButton();
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today" + this.monitor + this.thecase + this.motherboard);
    }
}
