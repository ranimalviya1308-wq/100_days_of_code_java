import org.w3c.dom.ls.LSOutput;

public class factorial {

//        public long factorial(int num){
//            //find factorial of a number
//
//            if (num == 0) {
//                return 1;
//            }
//            long ans = num * factorial(num - 1);
//            return ans;
//        }

    //power of 2
//    static int powerOfTwo(int n){
//        //base case
//        if(n == 0){
//            return 1;
//        }
//        //recursive relation
//        int ans = 2 * powerOfTwo(n-1);
//        return ans;
//    }
//    public static void main(String[]args){
//        System.out.println(powerOfTwo(5));
//    }

    //by using recursion printing my name
    static void printMyName(int n){
        //base case
        if(n == 0){
            return;
        }//processing
        System.out.println("Rani");
        //recursive call
        printMyName(n-1);
    }

    static void main() {
        printMyName(10);
    }



}
