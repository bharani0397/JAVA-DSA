public class Strong{
    public static void main(String[]args){
        int num = 10;
        int temp = num;
        int sum = 0;

        while(temp>0){

            int n = temp % 10;
            int fact = 1;

            for( int i =1;i<=n;i++){
                fact*=i;
            }

            sum+=fact;
            temp/=10;
        }

        if(sum ==num){
            System.out.println(num + "Strong Number");
        }
        else{
            System.out.println(num + "Not a Strong Number");
        }
    } 
}