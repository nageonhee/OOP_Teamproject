import java.time.LocalDate;

public class Member {
	private String memberID; // id
	private String name; 
	private String passwordHash; // 비밀번호 해시인데, 이건 한번 더 찾아보겠습니다.
	private String address; // 주소
	private String phoneNumber; //연락처
	private LocalDate joinDate; // 가입알
	private int point; // 포인트
	private long totalPurchaseAmount; // 누적금액
	private MembershipGrade;
	private cart;

	public Member(String memberID, String name, String passwordHash, String address, String phoneNumber, LocalDate joindate, MembershipGrade)
	{
		this.memberID = memberID;
		this.name = name;
		this.passwordHash = passwordHash;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.joinDate = joinDate;

		this.point = 0;
		this.totalPurchaseAmount = 0;
		this.membershipGrade = membershipGrade;
		this.cart = new Cart();
	}
	//회원등급 변경
	public void changeGrade(MembershipGrade newGrade)
	{
		this.MembershipGrade = newGrade;
	}

	//포인트 적립
	public void earnPoints(int amount)
	{
		if (amount > 0) {
			this.point+= amount;
		}
	}

	//포인트 사용
	public boolean usePoints(int amount)
	{
	if (amount > 0 && this.points >= amount)
		{
			this.points -= amount;
			return true;
		}
		return false;
	}

	//누적구매금액 변경
	public void changeTotalPurchaseAmount(long amount)
	{
		if (amount>0){
			this.totalPurchaseAmount += amount;
		}
	}
	
	public String getMemberID() {
		return memberID;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public LocalDate getJoinDate(){
		return joinDate;
	}

	public int getPoint() {
		return point;
	}

	public long getTotalPurchaseAmount() {
		return totalPurchaseAmount;
	}

	public MembershipGrade(){
		return MembershipGrade;
	}

	public Cart getCart(){
		return cart;
	}

}
