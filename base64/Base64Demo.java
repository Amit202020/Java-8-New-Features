package other;

import java.util.Base64;

public class Base64Demo {  

    public static void main(String[] args) {  

      // Getting encoder  
      Base64.Encoder encoder = Base64.getEncoder();  
      
      
      // Encoding string  
      String str = encoder.encodeToString("Welcome To Atos BTLC".getBytes());  
      System.out.println("Encoded string: "+str);  

      // Getting decoder  
      Base64.Decoder decoder = Base64.getDecoder();  

      // Decoding string  
      String dStr = new String(decoder.decode(str));  
      System.out.println("Decoded string: "+dStr);  
    }
}