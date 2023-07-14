import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int PrefixSumArray[]=prefixSum(array,size);
        for(int i : PrefixSumArray) {
            System.out.print(i+" ");
        }
    }

    private static int[] prefixSum(int[] array, int size) {
        int[] prefix=new int[size];
        prefix[0]=array[0];
        for(int i=1;i<size;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        return prefix;
    }
}