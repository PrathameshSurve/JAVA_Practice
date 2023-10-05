public class LooseCoupling {

    public static void main(String[] args) {
        Child obj = new Child();
    }

}

interface Parent1 {
    abstract void fun();
}

class Parent implements Parent1 {

    public void fun() {

    }

    public Parent(int a) {

    }

}

class Child implements Parent1 {

    public void fun() {

    }
}