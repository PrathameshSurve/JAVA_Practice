
public class Student {

    public static void main(String[] args) throws Exception {
        Student1 s1 = new Student1();
        System.out.println();
        s1.printName();
        s1.getName();

    }

}

class Student1 {

    public void printName() throws Exception {
        String name = "IName";
        System.out.println(name);
        int a = 10, b = 0, c = 0;
        c = a / b;
        System.out.println(c);
    }

    public void getName() throws Exception {

        System.out.println();
    }
}