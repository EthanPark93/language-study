package oop;

public class Ex2_1_overloading {
    public static void main(String[] args) {
        Ex2_1_math math = new Ex2_1_math();

        System.out.println("math.add(3,3) 결과 = " + math.add(3,3));
        System.out.println("math.add(3L,3L) 결과 = " + math.add(3L,3L));
        System.out.println("math.add(3L,3) 결과 = " + math.add(3L,3));
        System.out.println("math.add(3,3L) 결과 = " + math.add(3,3L));
    }
}

class Ex2_1_math {

    // 메서드명이 같더라도 매개변수의 개수나 타입, 순서가 다르면 별개의 메서드로 취급한다.
    int add(int a, int b) {
        System.out.print("int add(int a, int b) : ");
        return a+b;
    }

    // 반환 타입은 오버로딩이 성립하지 않는다.
//    float add(int a, int b) {
//        System.out.print("int add(int a, int b) : ");
//        return a+b;
//    }

    Long add(Long a, Long b) {
        System.out.print("Long add(Long a, Long b) : ");
        return a+b;
    }

    Long add(Long a, int b) {
        System.out.print("Long add(Long a, int b) : ");
        return a+b;
    }

    Long add(int a, Long b) {
        System.out.print("Long add(int a, Long b) : ");
        return a+b;
    }
}


