public class InterfaceEx{
    public static void main(String[] args) {
        // any object =new any();
        // object.fun2();
        example1.fun2();
          
    }
}
interface example1{
     void fun();
     static void fun2(){
System.out.println("Hello");
     }


}
class any implements example1{

    @Override
    public void fun() {
        throw new UnsupportedOperationException("Unimplemented method 'fun'");
    }

 

}