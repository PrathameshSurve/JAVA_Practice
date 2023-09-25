//Commented code can run also run
public class InterfaceEx{
    public static void main(String[] args) {
        example1 obj = new example1(){
            public void show(){
                System.out.println("Hello output");
            }
            public void run(int n, int m){
                int s = n+m;
                System.out.println(s);
            }
          
        };
        obj.show();
        obj.run(1, 2);
        // any object =new any();
        // object.fun2();
        //example1.fun2();         
    }
}
interface example1{
    public void show();
    public void run(int n, int m);
    //  void fun();
//      static void fun2(){
// System.out.println("Hello");
//      }


}
// class any implements example1{

//     @Override
//     public void fun() {
//         throw new UnsupportedOperationException("Unimplemented method 'fun'");
//     }
// }