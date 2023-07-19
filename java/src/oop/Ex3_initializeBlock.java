package oop;

public class Ex3_initializeBlock {

    // static 초기화 블럭. 인스턴스를 생성하지 않아도 메모리에 로드될 때 한번만 수행
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블럭. 인스턴스를 생성할 때 마다 실행.
    {
        System.out.println("{ }");
    }

    public static void main(String[] args) {
        Ex3_initializeBlock ib1 = new Ex3_initializeBlock();
        Ex3_initializeBlock ib2 = new Ex3_initializeBlock();
    }
}
