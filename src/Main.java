//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int empid = 116;
    int age = 28;
    static int departID = 400;

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            System.out.println("This is new feature feature 1 added");
            System.out.println("This is new feature feature 2");
            System.out.println("Emp id is=" + new Main().empid);
            System.out.println("Depart id=" + departID);
            System.out.println("age=" + new Main().age);
        }
    }
}