public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 저장 하려고 한다 변수를 만들어 보시오
        String model = "BMW5281";
        System.out.println("model = " + model);
        long distance = 2147483648L; // L을 붙여야하는 이유 : 임시 메모리로 저장시에 int이기 때문
        System.out.println("distance = " + distance + "km");
        int price = 9000000;
        System.out.println("price = " + price);
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type = " + type + "Type");
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gasmi = 12.5f;
        System.out.println("gasmi = " + gasmi + "l");
    }
}
