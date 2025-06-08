public class MethodExamples {
    public static void main(String[] args) {
        sayHello();
        greetByName("Dmitriy");
        sum(3,  7);
    }
    private static void sayHello(){
        System.out.println("Привет, пользователь.");
    }
    public static void greetByName(String name){
        System.out.println("Привет, " + name +"!");
    }
    public static int sum(int a, int b){
        System.out.println("Сумма: "+ (a+b));
        return a+b;
    }
}
