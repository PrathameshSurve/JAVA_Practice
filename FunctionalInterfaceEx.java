//Commented code can be run also...
public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        example0 obj1 = (int n) -> {        
           return n*n;
        };
         System.out.println(obj1.show1(2));
        // obj.show(2); // canmot run this as of this is a second one. 
    
    example2 obj2 = (int a, int b) -> {
        return a+b;
    };
    System.out.println(obj2.sum1(2,5));
}
}

@FunctionalInterface //This should contains only one method. Not more than one method.
interface example0 {
    public int show1(int n);
  // public void run(int n, int m); // This method can noyt be run as it's second one.
}

interface example2{
    public int sum1(int a, int b);
}
