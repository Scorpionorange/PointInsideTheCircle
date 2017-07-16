/**
 * Created by ScorpionOrange on 2017/07/16.
 */
public class PointInsideTheCircle {
    public static void main(String[] args){
        System.out.println("Points inside the Circle is: " +  + CountingPointInsideTheCircle(2));
    }

    public static int CountingPointInsideTheCircle(int Radius){
        int point = 0;
        int x, y;
        for(x = -Radius; x <= Radius; x++){
            for(y = -Radius; y <= Radius; y++){
                if(Math.sqrt(x*x + y*y) <= Radius){
                    point++;
                }
            }
        }
        return point;
    }
}
