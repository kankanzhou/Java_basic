/**
 * @Author: KanZhou
 * @Date: 2023-01-03 9:11 p.m.
 */

public class Vector3D {
    private int x;
    private int y;
    private int z;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ() {
        return z;
    }
    public String toString() {
        return '(' + String.valueOf(x) + ',' + String.valueOf(y) + ',' + String.valueOf(z) + ')';
    }
    public double getMagnitude() {
        return Math.pow(x * x + y * y + z * z, 0.5);
    }
}
