import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ban muon xem ngay cua thang may? ");
        int month = scanner.nextInt();
        String songay;

        switch (month) {
            case 2:
                songay = "28 hoac 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                songay = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                songay = "30";
                break;
            default:
                songay = "";
        }

        if (songay != "") System.out.print("Thang " + month + " co " + songay + " ngay!");
        else System.out.println("Nhap sai");

    }
}
