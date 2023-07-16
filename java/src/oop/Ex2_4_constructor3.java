package oop;

public class Ex2_4_constructor3 {
    public static void main(String[] args) {
        Ex2_4_car car1 = new Ex2_4_car();
        Ex2_4_car car2 = new Ex2_4_car("blue");
        Ex2_4_car car3 = new Ex2_4_car("blue", "manual", 2);

        System.out.println("car1 = " + car1.color + ", " + car1.gearType + ", " + car1.door);
        System.out.println("car2 = " + car2.color + ", " + car2.gearType + ", " + car2.door);
        System.out.println("car3 = " + car3.color + ", " + car3.gearType + ", " + car3.door);
    }
}

class Ex2_4_car {

    String color;
    String gearType;
    int door;

    // 기본 생성자를 통한 생성시에 필드를 디폴트 값으로 초기화.
    public Ex2_4_car() {
//        Ex2_4_car("white", "auto", 4); 생성자 내에서 다른 생성자 호출시에 클래스명이 아닌 this를 사용
        this("white", "auto", 4);
    }

    // 생성자 오버로딩을 통한 생성시에 지정하는 필드 외에 디폴트 값으로 초기화. 생성자에서 다른 생성자를 호출.
    public Ex2_4_car(String color) {
        // 전체 필드플 초기화하는 생성자를 임의 디폴트값으로 호출하되, 매개변수를 통한 초기화도 포함.
        this(color, "auto", 4);
    }

    public Ex2_4_car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
