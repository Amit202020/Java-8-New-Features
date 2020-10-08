package annodemo;

import java.util.function.*;


class   Calculation{
    public static void main(String args[]){
    	
    	
                     Function<Integer,Integer>   f =   a -> a*a;
                     System.out.println(f.apply(9));
                     
     }
}
