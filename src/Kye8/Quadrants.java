//https://www.codewars.com/kata/643af0fa9fa6c406b47c5399/train/java
// 8 kye
package Kye8;

public class Quadrants {
    public static int quadrant(int x, int y) {
        if(x > 0 & y > 0){
            return 1;
        }else if (x < 0 & y > 0){
            return 2;
        }else if (x < 0 & y < 0){
            return 3;
        }
        return 4;
    }
}
