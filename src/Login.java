import java.util.Scanner;

public class Login {

    private Scanner sc;
    private AccountDB accountDB;

    public Login(AccountDB accountDB) {
        this.sc = new Scanner(System.in);
        this.accountDB = accountDB;
    }

    // 로그인 실행
    public void login() {

        System.out.println("\n===== 로그인 =====");

        System.out.print("아이디: ");
        String accountId = sc.nextLine();

        System.out.print("비밀번호: ");
        String password = sc.nextLine();

        // 계정 DB에서 계정 검색
        Account account = accountDB.findAccount(accountId);

        // 계정 존재 여부 및 비밀번호 확인
        if (account == null || !account.login(accountId, password)) {
            System.out.println("로그인에 실패했습니다.");
            return;
        }

        System.out.println("로그인 성공!");

        // 계정 유형에 따른 메뉴 실행
        Menu menu;

        if (account instanceof Admin) {

            menu = new AdminMenu((Admin) account, sc);

        } else if (account instanceof Member) {

            menu = new UserMenu((Member) account, sc);

        } else {

            System.out.println("확인할 수 없는 계정입니다.");
            return;
        }

        // 메뉴 실행
        while (true) {

            menu.displayMenu();

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해 주세요.");
                continue;
            }

            menu.handleInput(choice);

            if (choice == 0) {
                break;
            }
        }
    }
}
