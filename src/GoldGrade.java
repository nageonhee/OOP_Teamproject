public class GoldGrade extends MembershipGrade {

    private static final double DISCOUNT_RATE = 0.10;
    private static final long MAX_DISCOUNT = 10000;

    private static final long POINT_STANDARD = 50000;
    private static final double BASIC_POINT_RATE = 0.03;
    private static final double BONUS_POINT_RATE = 0.05;

    public GoldGrade() {
        super("골드");
    }

    // 10% 할인, 최대 1만원
    @Override
    public long calculateDiscount(long totalAmount) {

        long discount = (long)(totalAmount * DISCOUNT_RATE);

        return Math.min(discount, MAX_DISCOUNT);
    }

    // 최종 금액에 따른 포인트 적립
    @Override
    public int calculatePoints(long finalAmount) {

        if (finalAmount >= POINT_STANDARD) {
            return (int)(finalAmount * BONUS_POINT_RATE);
        }

        return (int)(finalAmount * BASIC_POINT_RATE);
    }
}
