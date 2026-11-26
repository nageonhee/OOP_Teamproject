public abstract class Account {

    // 1. 필드
    private String accountId;       // 계정 아이디
    private String passwordHash;    // 비밀번호 해시
    private String name;            // 이름
    private String address;         // 주소
    private String phoneNumber;     // 전화번호


    // 2. 생성자
    public Account(String accountId, String passwordHash,
                   String name, String address,
                   String phoneNumber) {

        this.accountId = accountId;
        this.passwordHash = passwordHash;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    // 3. 추상 메서드
    // 계정 유형 확인
    public abstract String checkAccountType();


    // 4. Getter
    public String getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // 5. 회원 정보 수정
    public void updateAddress(String address) {
        this.address = address;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
