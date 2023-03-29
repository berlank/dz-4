public class Main {
    public static void main(String[] args) {
        Student anotherStudent = new Student();
        int value = Student.printValue();
        String value2 = Student.printName();
        System.out.println("~~~ "+"Student's name is "+ value2 + ", and Student's age is " + value + " ~~~");
    }
}
