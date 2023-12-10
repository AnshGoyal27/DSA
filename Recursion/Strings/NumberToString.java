public class NumberToString {
    static String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    static void printNumbertoString(int num){
        if(num == 0){
            return;
        }
        int digit = num%10;
        printNumbertoString(num/10);
        System.out.println(numbers[digit]+" ");
    }
    public static void main(String[] args) {
        printNumbertoString(2024);
        System.out.println();
    }
}
