import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        Input input = new Input(a,b);
        Output output = new Output(input.a,input.b);
        output.Print();

    }
}
