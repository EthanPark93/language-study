// 요약 : 사용자 정의타입에 관한 내용. 클래스를 사용하여 다양한 타입의 변수와 기능을 통해 간결한 코드와, 유지보수성을 확보.

package oop;

public class Ex1_2 {

    // 비 객체 지향적 코드
    int hour1, hour2, hour3;
    int minute1, minute2, minute3;
    int second1, second2, second3;

    //객체 지양적 코드 : 항상 사용되는 필드를 클래스에 정의하고, 이를 바탕으로 객체로 생성하여 관리.
    Time time1 = new Time();
    Time time2 = new Time();
    Time time3 = new Time();

}

class Time {

    // 필드의 제약 조건 설정을 통해 유효성이 검증 된 값을 지정할 수 있도록 private 접근제어자와 set 메서드로 관리 가능.
    private int hour;
    private int minute;
    private float second;

    public void setHout(int h) {
        if(h < 0 || h > 23) return;
        hour = h;
    }
}


