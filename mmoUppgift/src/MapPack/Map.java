package MapPack;

public class Map {

    private int xCordinateBase;
    private int yCordinateBase;

    public Map(int xCordinateBase, int yCordinateBase) {
        this.xCordinateBase = xCordinateBase;
        this.yCordinateBase = yCordinateBase;

    }

    public int getxCordinateBase() {
        return xCordinateBase;
    }

    public void setxCordinateBase(int xCordinateBase) {
        this.xCordinateBase = xCordinateBase;
    }

    public int getyCordinateBase() {
        return yCordinateBase;
    }

    public void setyCordinateBase(int yCordinateBase) {
        this.yCordinateBase = yCordinateBase;
    }
}
