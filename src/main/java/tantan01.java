import javax.swing.*;

public class tantan01 {
    private String name;
    private Integer age;
    private static String school = "falali";

    public tantan01(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printinfo() {
        System.out.println(this.name + "  " + this.age + "  " + this.school);
    }

    public static void main(String[] args) {
        tantan01 linli = new tantan01("linli", 12);
        tantan01 apple = new tantan01("apple", 15);
        linli.printinfo();
        apple.printinfo();

    }
}
