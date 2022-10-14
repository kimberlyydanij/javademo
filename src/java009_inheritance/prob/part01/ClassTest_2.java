package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1 {
	
	String department;
	
	public ClassTest_2() {
	}
	
	ClassTest_2(String n, int s, String d) {
		super(n,s);
		this.department = d;
	}
	
	
	public void prn() {
		System.out.println("서브클래스");
	}

    public void callSuperThis() {
    	super.prn();
    	prn();
    	
    }
    
    public void getInformation() {
  
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서:" + department);
	}

}
