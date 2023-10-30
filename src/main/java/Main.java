public class Main {
    public static void main(String[] args) {
        Variable num = new Variable(6);
        System.out.println(num.getNewInt());
        num.setNewInt(10);
        System.out.println(num.getNewInt());
    }
}
