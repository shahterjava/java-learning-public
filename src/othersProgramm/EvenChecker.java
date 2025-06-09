package OthersProgramm;

public class EvenChecker {
    public static void main(String[] args) {
        System.out.println(isEven(2));
    }
    public static boolean isEven(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
