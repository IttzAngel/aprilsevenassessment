package aprilsevenassessment;

public class PC {

    private Monitor monitor;
    private Motherboard motherboard;
    private TheCase thecase;


    public PC() {
//        this.monitor = monitor;
//        this.motherboard = motherboard;
//        this.thecase = thecase;
    }

    public static void drawLogo(){
        Monitor.drawPixel(10, 10, "Purple");
    }

    public void powerUp(){
        TheCase.pressPowerButton();
        PC.drawLogo();
        Motherboard.loadProgram("Photoshop");
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today" + '\n' + Monitor.monitorDescription() + '\n' + Motherboard.motherboardDescription() + '\n' + TheCase.caseDescription());
    }
}
