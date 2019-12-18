import javax.sound.midi.SysexMessage;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws SQLException {
        DBControl dbc = new DBControl();
        Scanner sc = new Scanner(System.in);
        int how = sc.nextInt();
        String id = "";
        String pw = "";
        while (true) { //첫화면
            System.out.println("1. 로그인 2. 회원가입");
            if (how == 1) {
                System.out.println("ID : ");
                id = sc.next();
                System.out.println("PW : ");
                pw = sc.next();
                if (dbc.login(id, pw)) {
                    break;
                }
                else {
                    System.out.println("오류 처음으로 돌아갑니다.");
                }
            }
            else if (how == 2) {
                System.out.println("만들 ID : ");
                id = sc.next();
                System.out.println("만들 PW : ");
                pw = sc.next();
                if (dbc.register(id, pw)) {
                    break;
                }
                else {
                    System.out.println("오류 처음으로 돌아갑니다.");
                }
            }
            else {
                System.out.println("오류 처음으로 돌아갑니다.");
            }
        }
        if (dbc.isAdmin(id)) {

        }
        else {

        }



    }
}
