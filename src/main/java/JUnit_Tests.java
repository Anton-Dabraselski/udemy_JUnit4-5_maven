public class JUnit_Tests {
    public static void main(String[] args) {
        int a = 10;
        //assert a == 10;

        Class clazz = JUnit_Tests.class;
        System.out.println(clazz.getModifiers());
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
