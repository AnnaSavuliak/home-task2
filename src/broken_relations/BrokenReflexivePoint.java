package broken_relations;

public class BrokenReflexivePoint extends Point{

    public BrokenReflexivePoint(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof BrokenReflexivePoint)
            return this.getX() != ((BrokenReflexivePoint) obj).getX() || this.getY() != ((BrokenReflexivePoint) obj).getY();
        return true;
    }
}
