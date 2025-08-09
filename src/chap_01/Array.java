package chap_01;

public class Array {
    public static void main(String[] args) {


        String [] Coffees = {"아메리카노", "카페라떼", "모카", "카푸치노"};

        /*for (int i = 0; i < 4; i++) {
            System.out.println(Coffees[i] + "하나");
        }
        System.out.println("주세요");

        for (int i = 0; i < Coffees.length; i++) {
            System.out.println("주세요");
        }*/

        /*for (String coffee : Coffees) {
            System.out.println(coffee + " 하나" + " 주세요");
        }*/

/*

        for (String coffee :
                   Coffees) {
            System.out.println(coffee + " 하나 주세요");
        }
*/

        String [] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String [] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String [] seatC = {"C1", "C2", "C3", "C4", "C5"};

        String[][] seats = new String[][] {
                    {"A1", "A2", "A3", "A4", "A5"},
                    {"B1", "B2", "B3", "B4", "B5"},
                    {"C1", "C2", "C3", "C4", "C5"}
    };

        System.out.println(seats[2][4]);






        }
}
