package oop;

public class Ex2_3_constructor2 {
    public static void main(String[] args) {

        // 기본 생성자 사용 후 초기화.
        Ex2_3_car car1 = new Ex2_3_car();
        car1.color = "red";
        car1.gearType = "manual";
        car1.door = 2;

        // 매개변수 생성자를 통한 초기화. 훨씬 간결하게 사용 가능함.
        Ex2_3_car car2 = new Ex2_3_car("white", "auto", 4);

        // 기본 생성자를 통한 인스턴스 생성, 초기화 하지 않은 상태
        Ex2_3_car car3 = new Ex2_3_car();

        System.out.println("car1 = " + car1.color + ", " + car1.gearType + ", " + car1.door);
        System.out.println("car2 = " + car2.color + ", " + car2.gearType + ", " + car2.door);
        System.out.println("car3 = " + car3.color + ", " + car3.gearType + ", " + car3.door);


    }

}

class Ex2_3_car {
    String color;
    String gearType;
    int door;

    // 기본 생성자, 매개변수를 가진 생성자가 정의되기에, 자동생성되지 않는다.
    // 따라서 초기화 하지 않는 인스턴스 생성도 허용하려면 기본 생성자를 직접 만들어줘야 한다.
    Ex2_3_car() {}

    Ex2_3_car(String color, String gearType, int door) { // 매개변수를 가진 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
