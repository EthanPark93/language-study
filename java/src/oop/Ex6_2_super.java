//  1. 부모 클래스의 생성자는 상속되지 않고, 자식 클래스로 인스턴스를 생성할 때 자동적으로 부모의 기본 생성자가 호출된다.
//  2. 부모 생성자가 매개변수를 갖고 있다면 자식 클래스를 인스턴스화할 때 자동으로 호출되지 않는다.
//  3. 따라서 자식 생성자에서 명시적으로 부모 생성자를 호출해야 한다. 이때 사용되는 키워드가 super(); 이다. 단, super()를 사용할 때는 자식 생성자의 첫 줄에 위치하여야 한다.

package oop;

public class Ex6_2_super {
    public static void main(String[] args) {
        Ex6_2_super_point3D point3D = new Ex6_2_super_point3D(1, 2, 3);
        System.out.println("x = " + point3D.x + ", " + "y = " + point3D.y +", " + "z = " + point3D.z);
    }
}

class Ex6_2_super_point {
    int x,y;

    Ex6_2_super_point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Ex6_2_super_point3D extends Ex6_2_super_point {
    int z;

    // 가능하긴 하지만, 부모에도 중복되는 생성자가 있으므로 바람직하지 않다.
//    Ex6_2_super_point3D(int x, int y, int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }


    // 아래와 같이 부모의 멤버변수는 부모에서, 자식의 멤버변수는 자식에서 초기화하는 것이 바람직하다.
    Ex6_2_super_point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
