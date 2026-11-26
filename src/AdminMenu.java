import java.util.Scanner;

public class AdminMenu implements Menu {

    private Admin admin;
    private Scanner sc;

    public AdminMenu(Admin admin, Scanner sc) {
        this.admin = admin;
        this.sc = sc;
    }

    // 관리자 메뉴 화면 표시
    @Override
    public void displayMenu() {

        System.out.println("\n===== 관리자 메뉴 =====");
        System.out.println("관리자: " + admin.getName());

        System.out.println("1. 상품 등록");
        System.out.println("2. 상품 조회");
        System.out.println("3. 상품 수정");
        System.out.println("4. 상품 판매 중지");
        System.out.println("5. 상품 재고 관리");
        System.out.println("0. 로그아웃");

        System.out.print("메뉴 선택: ");
    }

    // 관리자 메뉴 입력 처리
    @Override
    public void handleInput(int choice) {

        switch (choice) {

            case 1:
                registerProduct();
                break;

            case 2:
                searchProduct();
                break;

            case 3:
                updateProduct();
                break;

            case 4:
                stopProduct();
                break;

            case 5:
                manageStock();
                break;

            case 0:
                System.out.println("로그아웃합니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    // 상품 등록
    private void registerProduct() {
        System.out.println("상품 등록 기능 실행");
    }

    // 상품 조회
    private void searchProduct() {
        System.out.println("상품 조회 기능 실행");
    }

    // 상품 수정
    private void updateProduct() {
        System.out.println("상품 수정 기능 실행");
    }

    // 상품 판매 중지
    private void stopProduct() {
        System.out.println("상품 판매 중지 기능 실행");
    }

    // 상품 재고 관리
    private void manageStock() {
        System.out.println("상품 재고 관리 기능 실행");
    }
}
