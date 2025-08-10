package pradeep;

public class Primenumber {
    public static void main(String[] args) {
        int a=6;
        System.out.println(a+" is "+checkprime(a));

    }
    static String checkprime(int a){
        int i=2;
        String status="Prime number";
        while(i<a){
            if(a%i==0){
                status= "Not a prime number";
                break;
            }else{
                i++;
            }
        }
        return status;
    }
}
