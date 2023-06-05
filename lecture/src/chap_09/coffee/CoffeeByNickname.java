package chap_09.coffee;

public class CoffeeByNickname {
    // 닉네임 저장 변수
    public String nickname;

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + nickname);
    }
}
