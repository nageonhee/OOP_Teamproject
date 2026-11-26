import java.util.Scanner;

public class MemberMenu implements Menu {

    private Member member;
    private Scanner sc;

    public UserMenu(Member member, Scanner sc) {
        this.member = member;
        this.sc = sc;
    }

    // 사용자 메뉴 화면 표시
    @Override
    public void displayMenu() {

        System.out.println("\n===== 사용자 메뉴 =====");
        System.out.println("회원: " + member.getName());
        System.out.println("회원 등급: "
                + member.getMembershipGrade().getGradeName());
        System.out.println("보유 포인트: "
                + member.getPoints() + "P");

        System.out.println("1. 상품 조회");
        System.out.println("2. 장바구니 관리");
        System.out.println("3. 주문 취소 내역 조회");
        System.out.println("0. 로그아웃");

        System.out.print("메뉴 선택: ");
    }

    // 사용자 메뉴 입력 처리
    @Override
    public void handleInput(int choice) {

        switch (choice) {

            case 1:
                searchProduct();
                break;

            case 2:
                manageCart();
                break;

            case 3:
                showCancelHistory();
                break;

            case 0:
                System.out.println("로그아웃합니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    // 상품 조회
    private void searchProduct() {
        System.out.println("상품 조회 기능 실행");
    }

    // 장바구니 관리
    private void manageCart() {
        System.out.println("장바구니 관리 기능 실행");
    }

    // 주문 취소 내역 조회
    private void showCancelHistory() {
        System.out.println("주문 취소 내역 조회 기능 실행");
    }
}
