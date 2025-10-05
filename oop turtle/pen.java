public class Pen {
    private String color;
    private String type;

    public Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public void write() {
        System.out.println("Writing with a " + color + " " + type + " pen.");
    }
}