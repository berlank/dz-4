public class Student {
    private int age = 35;
    private String name = "John Doe";

    public int printValue() {
        System.out.println("----" + age + "----");
        return age;
    }

    public String printName() {
        System.out.println("----" + name + "----");
        return name;
    }
}
