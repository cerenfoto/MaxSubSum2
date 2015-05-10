package maxsubsum;

public final class MaxSumTest {

    public static int maxSubSum(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;

                for (int k = i; k <= j; k++) {
                    thisSum += a[k];
                    System.out.println("Alt Kümenin indisleri:" + k + " İndisin belirttiği eleman:" + a[k]);
                }

                System.out.println("toplam:" + thisSum);
                if (thisSum > maxSum) {
                    maxSum = thisSum;

                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum(a);
        System.out.println("Alt kümelerin en büyük toplamı:" + maxSum);

    }
}
