public class App {
    public static void main(String[] args) throws Exception {
        int x = 10, y = 20;
        x += y += 10;
        System.out.println(x+" "+y);
    }
}
