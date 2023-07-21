// 오버라이딩의 조건은 접근 제어자를 부모보다 좁은 범위로 하여선 안되고, 예외를 부모보다 많은 수를 정의할 수 없다.
// 접근제어자를 제외한 메서드 선언부 즉, 매개변수, 반환타입, 메서드 이름이 동일해야 한다.

package oop;

class Ex5_override_point {
    int x;
    int y;

    String getLocation() {
        return "x : " + x + ", " + "y : " + y;
    }
}

// point 클래스를 상속 받은 자식 클래스.
class Ex5_override_circle extends Ex5_override_point {

    // 반지름 z를 추가로 정의해주었다.
    int z;

    // 생성자 추가 정의.
    public Ex5_override_circle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // 접근제어자를 제외한 선언부를 부모의 메서드와 동일하게 정의하고, 기능만을 재정의하는 것을 오버라이딩이라고 한다.
    @Override
    String getLocation() {
        System.out.println("x : " + x + ", " + "y : " + y + ", " + "z : " + z);
        return "x : " + x + ", " + "y : " + y + ", " + "z : " + z;
    }
}

public class Ex5_override {
    public static void main(String[] args) {
        Ex5_override_circle circle = new Ex5_override_circle(1,2,3);
        circle.getLocation();
    }
}
