public class fibo{
    public static void main(String []args){
        int num = 15;
        int a = 0;
        int b = 1;
        System.out.print( a + " , " + b + " , ");
    int nextTerm;
    for(int i =2; i< num ; i++){
        nextTerm = a + b;
        a = b;
        b = nextTerm;
        System.out.print(nextTerm + " , ");
    }
    }
}