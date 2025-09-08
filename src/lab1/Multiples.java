package lab1;

public class Multiples {
    public static void main(String[] args){
        int count = 0;

        for(int i = 0; i < 1000; i++){
            boolean multipleOf5 = (i % 5 == 0);
            boolean multipleOf3 = (i % 3 == 0);

            if (multipleOf5 || multipleOf3) {
                count++;
            }
        }
        System.out.println(count);
    }


}
