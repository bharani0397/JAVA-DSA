public class Squareroot{
    public static void main (String[]args){
        int n = 64;
        double sqrt =Math.sqrt(n);

    if(sqrt ==Math.floor(sqrt)){
        System.out.println(n + "Square root");
    }
    else{
        System.out.println(n + "Not a Squre root");
    }
    }
}