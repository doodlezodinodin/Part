package object.part02;

/**
 * Created by alex on 07.04.2017.
 */
public class Part02 {
    private int a = 47856;
    private int sum;

    public int method(){
        while(a>0){
            sum += a % 10;
            a/=10;
        }

        return sum;
    }
}
