import java.util.ArrayList;
import java.util.Random;

public class RandomIntegers{
public void trial(){
     int size = 9,z=1,x=1,c=1;

        ArrayList<String> list = new ArrayList<String>(size);
        for(z = 1; z <= size; z++) {
            for(x=1; x<=size; x++){
               for(c=1; c<=size ;c++){
               if(z > x && x > c||z < x && x < c){
            list.add(z+""+x+""+c);

                 }
               }
             }
            }
        Random rand = new Random();
        //if(z > x && x > c||z < x && x < c){
        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.println(list.remove(index));
            
        }
   //}
}

    public static void main(String[] args) {
        //Constructor
        Sort pro = new Sort();
        RandomIntegers weak = new RandomIntegers();
        
        //Method Call
        //pro.user1();
        weak.trial();
            
      }
}