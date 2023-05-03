package Day_13_assignment;

public class Print_Array_uc_2 {
    public static<E> void toPrint(E[] integer){
        for (E e:integer
        ) {
            System.out.println(e);

        }

    }
    public static void  toPrint(Double[] duble) {
        for (double e : duble
        ) {
            System.out.println(e);

        }

    }
    public static void toprint(Character[] character){
        for (char e:character
        ) {
            System.out.println(e);

        }

    }

    public static class Print_The_Array {
        public Print_The_Array() {
        }

        public static void main(String[] args) {

            Integer[] Int = {1,2,3,4,5};
            Double[] Dble ={2.3,1.3,4.3};
            Character[] Chc ={'s','d','g'};
            Print_Array_uc_2.toPrint(Int);
            Print_Array_uc_2.toPrint(Dble);
            Print_Array_uc_2.toprint(Chc);

        }
    }
}
