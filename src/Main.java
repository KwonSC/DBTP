import javax.sound.midi.SysexMessage;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws SQLException {
        DBControl dbc = new DBControl();
        Scanner sc = new Scanner(System.in);
        String id = "";
        while (true) { //첫화면
            System.out.println("1. 로그인 2. 회원가입");
            int how = sc.nextInt();
            if (how == 1) {
                System.out.print("ID : ");
                id = sc.next();
                System.out.print("PW : ");
                String pw = sc.next();
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
                String pw = sc.next();
                System.out.println("이름 : ");
                String name = sc.next();
                System.out.println("이메일 : ");
                String email = sc.next();
                System.out.println("전화번호 : ");
                String number = sc.next();
                System.out.println("구분 : 학부 = 1, 대학원 = 2, 교직원 = 3 : ");
                int div = sc.nextInt();
                if (dbc.register(id, pw, name, email, number, div)) {
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
            while(true) {
                System.out.println("관리자모드");
                System.out.println("---------------------------------------------");
                System.out.println("1. 도서 등록");
                System.out.println("2. 도서 정보 수정");
                System.out.println("3. 도서 삭제");
                System.out.println("4. 회원 정보 수정");
                System.out.println("5. 회원 탈퇴");
                System.out.println("6. 회원 대출 목록");
                System.out.println("7. 도서 반납 승인");
                System.out.println("8. 로그아웃");
                System.out.println("번호를 입력하세요 : ");
                int how = sc.nextInt();
                if (how == 1) {
                    
                }
                else  if (how == 2) {

                }
                else  if (how == 3) {

                }
                else  if (how == 4) {

                }
                else  if (how == 5) {

                }
                else  if (how == 6) {

                }
                else  if (how == 7) {

                }
                else  if (how == 8) {

                }
                else {

                }

            }
        }
        else {
            while(true) {
                System.out.println("사용자모드");
                System.out.println("---------------------------------------------");
                System.out.println("1. 회원정보 변경");
                System.out.println("2. 회원탈퇴");
                System.out.println("3. 회원대출 목록");
                System.out.println("4. 도서 예약 하기");
                System.out.println("5. 도서 예약 확인");
                System.out.println("6. 도서 예약 취소");
                System.out.println("7. 도서 반납 요청");
                System.out.println("8. 도서 검색");
                System.out.println("9. 도서 대출 신청");
                System.out.println("10. 로그아웃");
                int how = sc.nextInt();
                if (how == 1) {

                }
                else  if (how == 2) {

                }
                else  if (how == 3) {

                }
                else  if (how == 4) {

                }
                else  if (how == 5) {

                }
                else  if (how == 6) {

                }
                else  if (how == 7) {

                }
                else  if (how == 8) {

                }
                else  if (how == 9) {

                }
                else  if (how == 10) {

                }
                else {

                }

            }
        }



    }
}
