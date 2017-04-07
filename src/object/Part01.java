package object;


public class Part01 {
    private int a = 12;
    private int b = 38;
    private int max = 0;

    public int maxMethod(int a, int b){
        int max;

        if(a>b) max = a;
        else max = b;

        return max;
    }

    public int method(){
        for(int i = 1; i<maxMethod(a, b); i++){

            if(a % i == 0 && b % i == 0)
                if (max < i) max = i;

        }

        return max;
    }
}
