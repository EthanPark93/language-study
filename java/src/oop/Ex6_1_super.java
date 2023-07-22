// super와 this로 부모와 자신을 구분할 수 있다.

package oop;

public class Ex6_1_super {
    public static void main(String[] args) {
        Ex6_1_super_child child = new Ex6_1_super_child();
        child.method();
    }
}

class Ex6_1_super_parent {
    int x = 10;
}

class Ex6_1_super_child extends Ex6_1_super_parent {
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
