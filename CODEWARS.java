package CODEWARS;
// Count of positives / sum of negatives - 8 kyu
public class CODEWARS {
    public static class array {
        public static void main(String[] args) {
            int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
            int sum = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] < 0)
                        sum += array[j];
                }
                System.out.println("Sum negative = " + sum);
                int count = 1;
                for (int i=1;i < array.length;i++) {
                    if (array[i]>0)
                        count+=1;
                }
                System.out.println("Count positive = " + count);
            }
        }
    }

/*Codewars decision*/
/*
public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) return new int[] {};
        int count = 0,sum = 0;
        for (int i : input) {
            if (i > 0) count ++;
            if (i < 0) sum += i;
        }
        return new int[] {count,sum};
    }
}*/
