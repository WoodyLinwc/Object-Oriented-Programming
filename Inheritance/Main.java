
public class Main {

    public static void main(String[] args) {

        ModArrayList<Integer> listy = new ModArrayList<>();
        listy.add(0);
        listy.add(10);
        listy.add(20);
        listy.add(30);

        System.out.println(listy.getUsingMod(1));
        System.out.println(listy.getUsingMod(-3));
        System.out.println(listy.getUsingMod(1012310));
    }
}
