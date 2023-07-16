package oop;

public class Ex2_2_constructor {
    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        DefaultConstructor2 defaultConstructor2 = new DefaultConstructor2();
        Constructor_int constructorInt = new Constructor_int(3); // 기본 생성자에 정의된 타입의 매개변수가 없으면 에러
    }
}

class DefaultConstructor { // 생성자를 하나도 정의하지 않으면 아래의 생성자가 자동으로 만들어진다.
    DefaultConstructor() {}

}

class DefaultConstructor2 { // 기본 생성자를 정의하면, 인스턴스가 생성될때 정의된 기능을 수행한다.
    public DefaultConstructor2() {
        System.out.println("defaultContructor with sout message");
    }
}

class Constructor_int {
    int x;

    public Constructor_int(int x) {
        this.x = x;
        System.out.println("field print when call the constructor : " + x);
    }
}
