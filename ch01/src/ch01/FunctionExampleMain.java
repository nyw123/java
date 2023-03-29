package ch01;

public class FunctionExampleMain {
    public static void main(String[] args) {
        FunctionExample fe = new FunctionExample();
        fe.func1(10, 20);
        int result = fe.func2(10, 20);
        System.out.println(result);
        fe.func3();
        String res = fe.func4();
        System.out.println(res);

    }
}
