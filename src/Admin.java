public class Admin extends Account {

    // 생성자
    public Admin(String accountId, String passwordHash,
                 String name, String address,
                 String phoneNumber) {

        super(accountId, passwordHash, name,
              address, phoneNumber);
    }


    // 계정 유형 확인
    @Override
    public String checkAccountType() {
        return "관리자";
    }
}
