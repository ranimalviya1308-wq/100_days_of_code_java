import java.util.Scanner;
public class methods {
    // public static void printHello() {
    //     System.out.println("Hello, World!");
    // }
    // public static void main(String[] args) {
    //     printHello();
    // }

    // public static int add(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter two numbers to add: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int result = add(a, b);
    //     System.out.println("The sum is: " + result);

    // public static void main(String[] args) {
    // int  a = 5;
    // int b = 10;

    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("value of a is " +a);
    // System.out.println("value of b is  " +b);


    // public static void swap(int a , int b){
    //     int temp = a;
    //     a =b;
    //     b = temp;
    //     System.out.println("value of a is "+a);
    //     System.out.println("value of b is "+b);
    //     }
    // public static void main(String[]args){
    //     int a = 8;
    //     int b =4;
    //      swap(a,b);
    //    system.out.println("value of a is " +a);
    //     System.out.println("value of b is " +b);

    //product of two numbers
//     public static float product(float a,float b){
//         float product = a*b;
//         return product;
//     }
//     public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter two numbers to multiply: ");
//    float a = sc.nextFloat();
//     float b = sc.nextFloat();
//     float result = product(a,b);
//     System.out.println("The product is: " + result);
//     float c = 2.5f;
//     float d = 4.0f;
//     float result2 = product(c,d);
//     System.out.println("The product of " + c + " and " + d + " is: " + result2);
//     }

// public static int factorial(int n){
//     int f = 1;
//     for(int i = 1;i<=n;i++){
//         f = f * i;
//     }
//     return f;
// }

// public static int binomaialCoefficient(int num ,int r){
//     int n_factorial = factorial(num);
//     int r_factorial = factorial(r);
//     int n_r_factorial = factorial(num-r);
//     int binomial_coefficient = n_factorial/(r_factorial*n_r_factorial);
//     return binomial_coefficient;


// }
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int r = sc.nextInt();

//     int bimomial_coefficient = binomaialCoefficient(n,r);
//     System.out.println("The binomial coefficient of " + n + " and " + r + " is: " + bimomial_coefficient);

//     // System.out.println("The factorial of " + a + " is: " + factorial);
// }}

//khud ka
//    public static int factorial(int n){
//         int f = 1;
//         for(int i =1;i<=n;i++){
//             f = f*i;
//         }
//         return f;
//     }
//     public static int binomialCoefficient(int num, int r){
//         int n_fac = factorial(num);
//         int r_fac = factorial(r);
//         int n_r_fac = factorial(num-r);
//         int binomialFactorial = n_fac/r_fac*(n_r_fac);
//         return binomialFactorial;
        
//     }
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int r = sc.nextInt();
//         int binomialFact = binomialCoefficient(num,r);
//         System.out.println("Factorial is " + binomialFact);
     

// public static int sum(int a , int b){
//     return a+b;
//     }

//   public static int sum(int a , int b, int c){
//     return a+b+c;
//   }  
//   public static void main(String[]args){
//     int result1 = sum(5,10);
//     int result2 = sum(5,10,15);
//     System.out.println("The sum of two numbers is: " + result1);        
//     System.out.println("The sum of three numbers is: " + result2);
//   }
// }


//function to calculate int sum
public static int sum(int a, int b){
    return a+b;
}
public static float sum(float a , float b){
    return a+b;
}
public static void main(String[]args){
    System.out.println("The sum of two integers is: " + sum(5,10));
    System.out.println("The sum of two floats is: " + sum(5.5f, 10.5f));
}}