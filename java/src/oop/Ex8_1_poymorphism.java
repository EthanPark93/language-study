package oop;

public class Ex8_1_poymorphism {
    public static void main(String[] args) {
        Ex8_1_poymorphism_car car = null;
        Ex8_1_poymorphism_fire fire = new Ex8_1_poymorphism_fire();
        Ex8_1_poymorphism_fire fire2 = new Ex8_1_poymorphism_fire();

        fire.water();
        car = fire; // 부모 타입으로 형 변환.
//        car.water(); // 부모타입에 없는 메서드 사용 불가.
        fire2 = (Ex8_1_poymorphism_fire)car; // 원래 타입으로 형 변환 시 메서드 사용 가능. 형 변환 생략 불가.
        fire2.water();
    }
}

class Ex8_1_poymorphism_car {
    String Color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class Ex8_1_poymorphism_fire extends Ex8_1_poymorphism_car {
    void water() {
        System.out.println("water, 자식 클래스");
    }
}

