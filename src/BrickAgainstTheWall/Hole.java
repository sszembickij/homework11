package BrickAgainstTheWall;

import java.util.Arrays;

public class Hole {
    int[] dimensions = new int[2];

    public int[] getDimensions() {
        return dimensions;
    }

    public Hole(int x, int y) {
        this.dimensions[0] = x;
        this.dimensions[1] = y;
    }

    public boolean goeThroughHole(int[] brick) {
        Arrays.sort(brick);
        Arrays.sort(dimensions);
        if (brick[0] <= dimensions[0] && brick[1] <= dimensions[1]) {
            return true;
        } else {
            return false;
        }
    }
}
