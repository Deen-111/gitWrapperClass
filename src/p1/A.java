package p1;

public class A {
	public static void main(String[] args) {
		Integer i = 10;                        //yah humne data ko Wrapper class me store kiya hai
		System.out.println(Integer.SIZE);          // yaha ye SIZE keyword static final hai bcoz upercase and italic hamesa static final hota hai
	                                           //bcoz ye SIZE keyword static hai to class name se acces hoga(Integr.SIZE)
	    System.out.println(i.longValue());
	    System.out.println(i.doubleValue());
	    System.out.println(i.toString());          //esse direct integer se String me convert ho jata hai
	}
}
