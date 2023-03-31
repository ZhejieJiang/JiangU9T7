public class Point
{
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
