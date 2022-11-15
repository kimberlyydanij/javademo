package java015_exception;

//사용자가 정의한 Exception
public class UserException extends Exception{
	public UserException(String message) {
		super(message);  // 반드시 부모클래스로 넘겨줘야함
	} 
}
