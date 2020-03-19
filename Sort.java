import java.util.ArrayList;
import java.util.Random;

public class Sort{
        int size = 9,i=1,j=1,k=1;
        
   public void user1(){


        for(i = 1; i <= size; i++) {
            for(j = 1; j <= size; j++){
               for(k = 1; k <= size; k++){
               
                  if(i > j && j > k||i < j && j < k){
                             
               
                  while(i==1 && j<=5 && k<=7){
              
                  System.out.print(i);
                  System.out.print(",");
                  System.out.print(j);
                  System.out.print(",");
                  System.out.print(k);
                  System.out.println();
                     break;
            }
         }       
      }
    }
  }
}

   public void user2(){
        

             
        for(i = 1; i <= size; i++) {
            for(j = 1; j <= size; j++){
               for(k = 1; k <= size; k++){
     
               if(i > j && j > k||i < j && j < k){
                             
               
               while(i<=2 && j>=1 && k>=1){
               if(i==1&&j==2&&k==3 || i==1&&j==2&&k==4 || i==1&&j==2&&k==5 || i==1&&j==2&&k==6){
                  break;
               }
               else if(i==1&&j==2&&k==7 || i==1&&j==2&&k==8 || i==1&&j==2&&k==9 || i==1&&j==3&&k==4){
                  break;
               }
               else if(i==1&&j==3&&k==5 || i==1&&j==3&&k==6 || i==1&&j==3&&k==7 || i==1&&j==3&&k==8){
                  break;
               }
               else if(i==1&&j==3&&k==9 || i==1&&j==4&&k==5 || i==1&&j==4&&k==6 || i==1&&j==4&&k==7){
                  break;
               }
               else if(i==1&&j==4&&k==8 || i==1&&j==4&&k==9 || i==1&&j==5&&k==6 || i==1&&j==5&&k==7){
                  break;
               }
               else if(i==2&&j==5&&k==7 || i==2&&j==5&&k==8 || i==2&&j==5&&k==9 || i==2&&j==6&&k==7){
                  break;
               }
               else if(i==2&&j==6&&k==8 || i==2&&j==6&&k==9 || i==2&&j==7&&k==8 || i==2&&j==7&&k==9){
                  break;
               }
               else if(i==2&&j==8&&k==9){
                  break;
               }
                  
                
               System.out.print(i);
               System.out.print(",");
               System.out.print(j);
               System.out.print(",");
               System.out.print(k);
               System.out.println();
                  break;
              }
            }              
         }
      }
   }
}


    public static void main(String[] args) {
    Sort pro = new Sort();
         pro.user1();
         System.out.println();
         pro.user2();
     }   
    }
