public class Main {
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        int value = anotherClass.printValue();
        String value2 = anotherClass.printName();
        System.out.println("~~~ "+"Student's name is "+ value2 + ", and Student's age is " + value + " ~~~");
    }
}