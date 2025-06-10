package exceptions;

import java.util.Scanner;

public class PasswordValidatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль.");
        String password = scanner.nextLine();

        try{
            validatePassword(password);
            System.out.println("Пароль принят!");
        }catch (InvalidPasswordException e){
            System.out.println("Ошибка: " + e.getMessage());
        }finally {
            System.out.println("Проверка завершена!");
        }
    }
    public static  void validatePassword(String password) throws InvalidPasswordException{
        if(password.length()<8){
            throw new InvalidPasswordException("Пароль должен содержать не менее 8 символов.");
        }
        if(password.contains(" ")){
            throw new InvalidPasswordException("Пароль не должен содержать пробелы.");
        }
        if(!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Пароль должен содержать хотя бы одну цифру!");
        }
    }
}
