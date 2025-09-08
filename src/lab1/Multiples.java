package lab1;

public class Multiples {
    public static void main(String[] args){
        int count = multiples(100, 3, 5);
        System.out.println(count);
    }

    protected static int multiples(int n, int a, int b) {
        int count = 0;
        for(int i = 1; i < n; i++){
            boolean multipleOfa = (i % a == 0);
            boolean multipleOfb = (i % b == 0);

            if (multipleOfa || multipleOfb) {
                count++;
            }
        }
        return count;
    }


}
