/*Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y.
Определить пройдет ли кирпич в отверстие.
Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.*/

package BrickAgainstTheWall;

public class Main {
    public static void main(String[] args) {
        Brick brick = new Brick(4, 4, 4);
        Hole hole = new Hole(4, 5);
        System.out.println(hole.goeThroughHole(brick.getDimensions()));
    }
}
