
class bai1 {
    public static void main(String args[]) {
        int[] array = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
        int sum = 0;
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("tong day so la:" + sum);
    }
}