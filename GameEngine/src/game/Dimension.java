package game;

public class Dimension {

    public Dimension(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Dimension(double x, double y, double z, double width, double height, double depth) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    public double x = 0;
    public double y = 0;
    public double z = 0;

    public double width = 0;
    public double height = 0;
    public double depth = 0;







}
