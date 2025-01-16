package gr.aueb.cf.ch14.immutable;

public class Point3DImmutable {
    private final int z;
    private final ImmutablePoint immutablePoint;

    public Point3DImmutable() {
        immutablePoint = new ImmutablePoint();
        z = 0;
    }

    public Point3DImmutable(int x, int y, int z, ImmutablePoint immutablePoint) {
        this.z = z;
        this.immutablePoint = immutablePoint;
    }

    public int getZ() {
        return z;
    }

    public ImmutablePoint getImmutablePoint() {
        return immutablePoint;
    }
}
