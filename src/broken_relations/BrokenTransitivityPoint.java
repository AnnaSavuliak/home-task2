package broken_relations;


public class BrokenTransitivityPoint extends Point {
    private String color;

    public BrokenTransitivityPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point)
            if (obj instanceof BrokenTransitivityPoint) {
                return super.equals(obj) && this.getColor().equals(((BrokenTransitivityPoint) obj).getColor());
            }
            else return obj.equals(this);
        return false;
    }
}

