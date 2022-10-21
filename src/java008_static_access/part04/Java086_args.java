package java008_static_access.part04;

//javac -d . Java086_args.java
//javajava008_static_access.part04.Javap86_args hello

public class Java086_args {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		for(String data : args)
			System.out.println(data);
	} // end main

} //end class
