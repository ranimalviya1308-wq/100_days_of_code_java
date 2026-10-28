import java.util.*;
public class Arrays {
//     public static void main(String[] args){
//         // int marks[] = new int[50];
//         // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the marks of student 1 :");
        // marks[0] = sc.nextInt();
        // System.out.println("enter the marks of student 2 :");
        // marks[1] = sc.nextInt();    
        // System.out.println("marks of student 1 is: "+marks[0]);
        // System.out.println("marks of student 1 is: "+marks[1]);
        // //updation
        // marks[0] = 100*3;
        // System.out.println("marks of student 1 is: "+marks[0]);
        // System.out.println("marks of student 2 is: "+marks[1]);

        // int percentage = marks[0]+marks[1]/2;
        // System.out.println("percentage is: "+percentage +"%");

        // System.out.println("length of array is: "+marks.length);



    //     public static void update(int marks[],int nonchangeable){
    //         for(int i = 0;i<marks.length;i++){
    //             marks[i] = marks[i]+10;
    //          nonchangeable = 10; // This line will cause a compilation error because 'nonchangeable' is already defined as a parameter. You cannot redefine it within the same scope.
    //         }
    //     }
    //     public static void main(String[] args){
    //         int marks[] = {10,20,30,40,50};
    //         int nonchangeable = 5;
    //         update(marks,nonchangeable);
    //         for(int i = 0;i<marks.length;i++){  
                
    //             System.out.println(marks[i]);
    //           // This will print the original value of 'nonchangeable' since it is passed by value and not modified in the main method.
    //         }      System.out.println(nonchangeable);     
    //     }
    // }
    

//linear search
// public static int linearSearch(int numbers[],int key){
//         for(int i = 0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return i;
//             }
               
            
//         } return -1;
//     } 
//     public static void main(String[] args) {
//         int numbers[] ={10,20,30,40};
//         int key = 30;
//         int index = linearSearch(numbers,key);
        
//         if(index==-1){
//             System.out.println("not found");
//         }else{
//              System.out.println("key is at index "+index);
//         }
//     }
// }

//largest number in a array
public static int largest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for(int i =0;i<numbers.length;i++){
    if(largest<numbers[i]){
        largest = numbers[i];
    }
}
return largest;
}
public static void main(String[]args){
    int numbers[] = {1,2,3,45,5};
    System.out.println("largest number is: "+largest(numbers));
}

///smallest number in a array
  public static int smallest(int numbers[]){
        int smallest= Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }return smallest;
    }
    public static void main(String[]args){
        int numbers[] ={1,23,45,66,3};
        System.out.println("Smallest no is: "+smallest(numbers));
    }

}