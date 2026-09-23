public class SortingAlgos {

static void bubbleSort(int arr[]){
    int n = arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j] > arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
static void main(){
int arr[] = {6,5,1,3};
bubbleSort(arr);
    System.out.println("Printing the array:");
for(int value:arr){
    System.out.println(value+ " ");}
}
}