public class SilverGrade extends MembershipGrade {

    private static final long DISCOUNT_STANDARD = 30000;
    private static final double DISCOUNT_RATE = 0.05;
    private static final double POINT_RATE = 0.02;

    public SilverGrade() {
        super("실버");
    }

    // 3만원 이상 구매 시 5% 할인
    @Override
    public long calculateDiscount(long totalAmount) {

        if (totalAmount >= DISCOUNT_STANDARD) {
            return (long)(totalAmount * DISCOUNT_RATE);
        }

        return 0;
    }

    // 최종 금액의 2% 적립
    @Override
    public int calculatePoints(long finalAmount) {
        return (int)(finalAmount * POINT_RATE);
    }
}
