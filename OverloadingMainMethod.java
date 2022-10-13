public class Main {
    public static void main(String[] ar) {
        System.out.println("Hello world!");
        int[] arr=new int[]{1,2,3,4,5};
        main(arr);
    }
    public static void main(int[] args) {
        System.out.println("Hello world! int main");
        main(5,6);
    }
    public static void main(int a,int b) {
        System.out.println(a+b);
    }
}