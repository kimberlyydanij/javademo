package java007_class.part01;

public class Doctor {
	String name; // 의사 명
	String medical; //진료 과목
	int patient; // 대기 환자수
	
	public Doctor() {
		
	}

	public Doctor(String name, String medical, int patient) {

		this.name = name;
		this.medical = medical;
		this.patient = patient;
	}
	
	public String toString() {
		
		return String.format("%s %s %d",name,medical,patient);
	}
}
