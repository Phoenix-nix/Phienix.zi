import java.util.*;

public class TestDemo {
    public int addAB(int A, int B) {
        if(B!=0){
            int a=A^B;
            int b=(A&B)<<1;
            return addAB(a,b);
        }else{
            return A;
        }
    }
}