
public class TightCoupling {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
    }

}

class Parent {
    void fun() {

    }

    public Parent(/* int a */) { // we cannot pass a parameters to a default constructor

    }
}

class Child extends Parent {

    void fun() {

    }
}