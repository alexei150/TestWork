public class Recursion {
//    public static int pow (int a, int b){
//        if (b==1)
//            return a;
//        else
//            return a* pow(a,b-1);
//    }
        public static int pow (int a, int b){
            if (b==0)
                return 1;
            else
                return a* pow(a,b-1);
        }
    public static int factorial (int a){
        if (a <=1 )
            return 1;
        else
            return  a*factorial(a-1);
    }
    public static void main(String[] args) {


  int result =  pow(2,0);
        System.out.println("Итог:"+result);

    int factorial = factorial(3);
        System.out.println("факториал:"+ factorial);
  }
}
