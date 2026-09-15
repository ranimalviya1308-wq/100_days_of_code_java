import java.util.Arrays;
public class homework_of_array {
    static void main() {
    //swap alternate elements in an array
    int arr[]={1,2,3,45,6,66};
    for(int i =0; i < arr.length-1; i++){
       int temp = arr[i];
       arr[i] = arr[i+1];
       arr[i+1] = temp;
    }
    System.out.println(Arrays.toString(arr));
}
}