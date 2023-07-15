// 요약 : 자바의 객체지향언어 관점에서 생각하면, 서로 관계가 깊은 데이터(변수)와 기능(함수)을 한 클래스 내에 정의하여 다룰 수 있음.
//       예를 들어, String이 문자의 배열이 아니라, 클래스로 정의되는 이유는 문자열을 다루는데 필요한 함수들도 같이 묶기 위해서임.

package oop;

public class Ex1_1 { // public 클래스가 존재하면 소스파일 이름과 일치해야함.
    public static void main(String[] args) {
        Tv tv = new Tv(); // Tv클래스를 설계도 삼아 제품(객체)을 생성.
        Tv tv2 = new Tv();
        Tv tvAr[] = {tv, tv2}; // 객체의 배열도 생성 가능. 이 때, 타입은 해당 클래스로 지정한다.

        tv.channel = 7;
        tv.channelDown();

        System.out.println("현재 채널은 " + tv.channel + " 입니다");
        System.out.println("현재 채널은 " + tv2.channel + " 입니다"); // 같은 클래스여도 객체 생성시 별도의 필드를 가진다.

        System.out.println("tv = " + tv);
        System.out.println("tv2 = " + tv2); // 참조값이 서로 다름을 확인할 수 있다.
        System.out.println("tvAr[0] = " + tvAr[0]); // tv 객체의 주소와 동일함 확인 가능.
    }
}

class Tv { // public이 아니면 소스파일 이름과 상관 없음.

    // Tv의 속성. (멤버변수, 필드)
    String color;
    boolean power;
    int channel;

    // Tv의 기능. (메서드)
    void power() {
        power = !power;
    }
    void channelUp() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
