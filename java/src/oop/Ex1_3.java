package oop;

public class Ex1_3 {
    public static void main(String[] args) {
        // static 변수 출력 : 개체 생성 없이 접근 가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        // 인스턴스 생성 및 인스턴스 변수 초기화
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        // 인스턴스 변수와, static 변수 확인
        System.out.println("c1은 " + c1.kind + c1.number + "이며, 크기는" + c1.width + ", " + c1.height);
        System.out.println("c2은 " + c2.kind + c2.number + "이며, 크기는" + c2.width + ", " + c2.height);

        // c1에서 static 변수 초기화해도, 클래스 변수 자체가 바뀌기에 모든 인스턴스들이 같은 값 공유, c2도 영향 받음
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + c1.number + "이며, 크기는" + c1.width + ", " + c1.height);
        System.out.println("c2은 " + c2.kind + c2.number + "이며, 크기는" + c2.width + ", " + c2.height);
    }

}

class Card {
    // 인스턴스 변수 : 인스턴스를 생성할때 인스턴스 영역에 저장되어 각 인스턴스마다 독립적인 값을 가진다.
    String kind;
    int number;

    // static(클래스) 변수 : 클래스 변수는 클래스가 메모리에 등록될 때 만들어지며, 인스턴스에 저장되는 것이 아닌
    //                    클래스에 저장되기에 모든 인스턴스가 같은 값을 공유한다.
    static int width = 100;
    static int height = 250;
}
