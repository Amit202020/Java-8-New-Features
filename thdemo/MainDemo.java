package thdemo1;

class   MainDemo{
    public static void main(String args[]){
    	
      Runnable r= ()->{
                    for(int i=0;i<30;i++){
                            System.out.println("Bike is Running");
                     }
            };
            
           Thread   t1 = new Thread(r);
           t1.start();
           
  }
}
