package oop;

// 부모 클래스
// Object 클래스는 모든 클래스의 조상이다.
// 아무 클래스도 상속받지 않는 클래스는 컴파일 시, extends Object가 포함된다.
class Ex4_1_extends_Tv extends Object{
    boolean power;
    int channel;

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

class Ex4_1_extends_smartTv extends Ex4_1_extends_Tv { // Ex4_1_extends_Tv를 부모로 상속받는 자식 클래스
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class Ex4_1_extends {
    public static void main(String[] args) {
        Ex4_1_extends_smartTv stv = new Ex4_1_extends_smartTv();

        stv.channel = 5; // Ex4_1_extends_smartTv에서 정의하지 않은 필드도 상속을 통해 내부적으로 포함.
        stv.channelUp();
        System.out.println(stv.channel);
    }
}
