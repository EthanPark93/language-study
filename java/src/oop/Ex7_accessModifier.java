package oop;

// 접근 제어자.
// 외부에는 불필요한, 내부적으로만 사용되어야하는 데이터를 감추기 위해서(data hiding)
public class Ex7_accessModifier {

    // 접근 제한이 전혀 없다
    public String publicStringTest = "publicStringTest";

    // 같은 패키지 내부 혹은 다른 패키지 자손 클래스에서 접근 가능하다.
    protected String protectedStringTest = "protectedStringTest";

    // 같은 패키지 내에서 접근 가능하다.
    String defaultStringTest = "defaultStringTest";

    // 같은 클래스 내에서만 접근 가능하다.
    private String privateStringTest = "privateStringTest";
}


