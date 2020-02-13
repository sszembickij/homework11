package brickwall;

public class Brick {
    int[] dimensions = new int[3];

    public Brick(int a, int b, int c) {
        this.dimensions[0] = a;
        this.dimensions[1] = b;
        this.dimensions[2] = c;
    }


    public int[] getDimensions() {
        return dimensions;
    }
}
