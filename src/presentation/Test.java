package presentation;

import util.Validator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên: ");
        String intInput = scanner.nextLine();
        System.out.println("Số nguyên hợp lệ khi true và sai khi false: " + Validator.isValidInteger(intInput));

        System.out.print("Nhập một số thực float: ");
        String floatInput = scanner.nextLine();
        System.out.println("Số nguyên float hợp lệ khi true và sai khi false: " + Validator.isValidFloat(floatInput));

        System.out.print("Nhập một số thực double: ");
        String doubleInput = scanner.nextLine();
        System.out.println("Số nguyên double hợp lệ khi true và sai khi false: " + Validator.isValidDouble(doubleInput));

        System.out.print("Nhập một giá trị boolean (true/false): ");
        String boolInput = scanner.nextLine();
        System.out.println("boolean hợp lệ khi true và sai khi false: " + Validator.isValidBoolean(boolInput));

        System.out.print("Nhập một chuỗi (3-10 ký tự): ");
        String stringInput = scanner.nextLine();
        System.out.println("Chuỗi hợp lệ khi true và sai khi false: " + Validator.isValidString(stringInput, 3, 10));

        System.out.print("Nhập một email: ");
        String emailInput = scanner.nextLine();
        System.out.println("Email hợp lệ khi true và sai khi false: " + Validator.isValidEmail(emailInput));

        System.out.print("Nhập một số điện thoại Việt Nam: ");
        String phoneInput = scanner.nextLine();
        System.out.println("Số điện thoai hợp lệ khi true và sai khi false: " + Validator.isValidPhone(phoneInput));
    }
}