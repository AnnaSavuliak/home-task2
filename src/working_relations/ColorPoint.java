package working_relations;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point && obj != null)
            if (obj instanceof ColorPoint) {
                if (super.equals(obj) && this.getColor().equals(((ColorPoint)obj).getColor()))
                    return true;
            }
                else return obj.equals(this);
            return false;
    }
}
