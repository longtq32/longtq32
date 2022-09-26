package CSD201;

public class BubbleSort {
    public static void main(String[] args) 
    {
        int[] a = { 5, 3, 2, 7, 8, 1, 2 };
        bubbleSort(a);
    }

    public static void bubbleSort(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1])
                {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            printArray(i, a);
        }
    }

    public static void printArray(int no, int[] a)
    {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

   
 
}
