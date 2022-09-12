package broken_relations;


public class BrokenSymmetricPoint extends Point {
    private String color;

    public BrokenSymmetricPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BrokenSymmetricPoint)
            return super.equals(obj) && this.getColor().equals(((BrokenSymmetricPoint) obj).getColor());
        return false;
    }
}