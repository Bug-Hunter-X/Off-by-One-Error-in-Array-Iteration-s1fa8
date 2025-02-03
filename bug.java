public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i <= arr.length; i++) { //Error prone code. The loop should run until i < arr.length 
            arr[i] = i * 2;
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}