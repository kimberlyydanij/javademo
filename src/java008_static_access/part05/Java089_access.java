package java008_static_access.part05;

public class Java089_access {

	public static void main(String[] args) {
		//Java087_access p = new Java087_access();
		Java089_access p = new Java089_access();
		//System.out.printf("var_private:%d\n", p.var_private);
		//System.out.printf("var_default:%d\n", p.var_default);
		System.out.printf("var_protected:%d\n", p.var_protected);
		System.out.printf("var_public:%d\n", p.var_public);

	}

}
