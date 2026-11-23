public class NormalGrade extends MembershipGrade {

    public NormalGrade() {
        super("일반");
    }

    // 할인 없음
    @Override
    public long calculateDiscount(long totalAmount) {
        return 0;
    }

    // 최종 금액의 1% 적립
    @Override
    public int calculatePoints(long finalAmount) {
        return (int)(finalAmount * 0.01);
    }
}
