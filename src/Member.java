public class Member extends Account {

    // 일반 회원 전용 필드
    private int points;
    private long totalPurchaseAmount;

    private MembershipGrade membershipGrade;
    private Cart cart;


    // 생성자
    public Member(String accountId, String passwordHash,
                         String name, String address,
                         String phoneNumber,
                         MembershipGrade membershipGrade) {

        super(accountId, passwordHash, name,
              address, phoneNumber);

        this.points = 0;
        this.totalPurchaseAmount = 0;
        this.membershipGrade = membershipGrade;
        this.cart = new Cart();
    }


    // 계정 유형 확인
    @Override
    public String checkAccountType() {
        return "일반 회원";
    }


    // 회원 등급 변경
    public void changeGrade(MembershipGrade newGrade) {
        this.membershipGrade = newGrade;
    }


    // 포인트 적립
    public void earnPoints(int amount) {
        if (amount > 0) {
            this.points += amount;
        }
    }


    // 포인트 사용
    public boolean usePoints(int amount) {
        if (amount > 0 && this.points >= amount) {
            this.points -= amount;
            return true;
        }
        return false;
    }


    // 누적 구매 금액 변경
    public void changeTotalPurchaseAmount(long amount) {
        if (amount > 0) {
            this.totalPurchaseAmount += amount;
        }
    }


    // Getter
    public int getPoints() {
        return points;
    }

    public long getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }

    public MembershipGrade getMembershipGrade() {
        return membershipGrade;
    }

    public Cart getCart() {
        return cart;
    }
}
