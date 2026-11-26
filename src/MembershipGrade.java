public abstract class MembershipGrade {

    // 등급명
    private String gradeName;

    public MembershipGrade(String gradeName) {
        this.gradeName = gradeName;
    }

    // 등급명 반환
    public String getGradeName() {
        return gradeName;
    }

    // 할인 금액 계산
    public abstract long calculateDiscount(long totalAmount);

    // 적립 금액 계산
    public abstract int calculatePoints(long finalAmount);

    // 최종 결제 금액 계산
    public long calculateFinalAmount(long totalAmount) {
        return totalAmount - calculateDiscount(totalAmount);
    }
}
