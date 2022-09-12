package working_relations;

public class Point {
    private int x;
    private int y;
    public Point (){}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point)
            if (this.getX() == ((Point)obj).getX() && this.getY() == ((Point)obj).getY())
                return true;
        return false;
    }
}
