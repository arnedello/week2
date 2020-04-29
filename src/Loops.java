
public class Loops {

	public static void main(String[] args) {
		short O = 0;
		while (O < 101) {
			System.out.println(O);
			O += 2;
		}
		System.out.println("===================================");
       short T = 100;
       while (T > 0) {
    	   System.out.println(T);
    	   T -= 3;
       }
       System.out.println("===================================");
       
       for (short E = 1; E < 100; E++ ) {
    	   if (E % 2 != 0) {
    		   System.out.println(E);
    		  }
       }
       System.out.println("===================================");
       
    	for (short bruh = 0; bruh < 101; bruh++) {
    		if (bruh % 3 <= 0 && bruh % 5 <= 0) {
    			System.out.println("HelloWorld");
    		}
    	    else if (bruh % 3 <= 0) {
    			System.out.println("Hello");
    		  }
    		else if (bruh % 5 <= 0) {
    			System.out.println("World");
    		}
    		else {
    			System.out.println(bruh);
    		}
    		}
    	   }
       }
	


