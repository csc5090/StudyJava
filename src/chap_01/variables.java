package chap_01;

public class variables {
    public static void main(String[] args) {
        String name;
        name = "최상철";
                int hour = 15;

                System.out.println(name + " 님 " + hour + " 시에 방문 예정입니다");
                System.out.println(name + " 님" + " 배송 완료 되었습니다.");

                double score = 90.5;
                char grade = 'A';
                name = "최상철";
        System.out.println(name = "평균 점수는 " + score +"점입니다");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요?" +  pass);

        double d = 3.141231232;
        float f = 3.141231232F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        System.out.println(l);
        l = 1_000_000_000_000l;
        System.out.println(l);


    }
}
