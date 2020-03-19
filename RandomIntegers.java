import java.util.ArrayList;
import java.util.Random;

public class RandomIntegers{
      /*This program will only Generate Random Numbers*/
public void trial(){
     
     int size = 9,z=1,x=1,c=1;

         //to hold all the values of variable z, x and c.
        ArrayList<String> list = new ArrayList<String>(size);
        //to generate a 3 digit number.
        for(z = 1; z <= size; z++) {
            for(x=1; x<=size; x++){
               for(c=1; c<=size ;c++){
               //condition must meet 
               if(z > x && x > c||z < x && x < c){
            //to print the value of 3 digit
            list.add(z+""+x+""+c);

                 }
               }
             }
            }
        Random rand = new Random();

        while(list.size() > 0) {
            int index = rand.nextInt(list.size());
            System.out.println(list.remove(index));
            
        }
  
}

    public static void main(String[] args) {
        //Constructor
        Sort pro = new Sort();  /*<--- TO CONNECT TO ANOTHER CLASS*/
        RandomIntegers weak = new RandomIntegers();
        
        //Method Call
        pro.user1();  /*<--- OBJECT FROM ANOTHER CLASS*/
        weak.trial();
            
      }
}