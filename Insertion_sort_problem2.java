package insertion_sort_problem2;
import java.util.Scanner;
public class Insertion_sort_problem2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);    //sc object create for input
        System.out.print("Enter the size of array");
        int n=sc.nextInt();       //taking array size
        int [] array=new int[n+1];  /*array object create  and extra size 1.which help
                                       reduced array index out of bound exception .array start
                                          with 1 no index and 0 no index is empty*/
        
        for(int i=1;i<array.length;i++){  //for input array using loop
            System.out.print("\n Enter the "+i+" no value=");
            array[i]=sc.nextInt();    //taking input here
        }
        for(int i=2;i<array.length;i++){  //insertion sort start here
            int key=array[i];   //store i no index value inside key variable
            
            int j=i-1;          //using this for indecate i-1 no index value
            while (j>0 && array[j]<key){  /*compare key with i-1 or j no variable.
                                        if its true swapping if its false not need to swapping.
                                           array[j]<key) "<" for descending order //
                                                          ">" for ascending order*/
                array[j+1]=array[j]; 
                j=j-1;
            }
            array[j+1]=key;  //reset the key value
        }
        System.out.print("sorted value={");
       for(int i=1;i<array.length;i++){  //printing sorted array
            System.out.print(" "+array[i]+",");
        }
       System.out.print("}\n");
    }}
