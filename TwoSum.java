import java.util.Scanner;
import java.util.*;

class TWOSUM {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        int[] arr;
        int target = 0;
        for(int i = 0;i<=10;i++){
            // user input
            System.out.println("enter numbers: ");
            arr = (nums.nextInt());    
            
            System.out.println("enter target: ");
            Scanner tar = new Scanner(System.in);
            target =  tar.nextInt();
        }
        
        for(int i =0; i<=arr.size;i++){
            int first = arr[i];
            for(int j = i+1; j<=arr.size;j++){
                int second =  arr[j];
                if(first + second == target){
                    System.out.println(first+","+second);
                }
                else{
                    continue;
                }
            }
        }
    }
}       
        