package java008_static_access.part05;

/*  접근제어자 (Acess Modifier) 
* : 멤버 또는 클래스에 사용되어, 외부로 부터의 접근을 제한한다.
* 
* 1. private: 정의된 클래스에서만 접근이 가능하다.
* 2. default : 같은 패키지 에서만 접근이 가능하다.
* 3. protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
* 4. public : 접근 제한이 없다.
* 
* 접근제어자 사용
* class : default, public
* variable, method, constructor : private, default, protected, public
* 
* 접근제어자의 범위
* private < default< protected < public
* 
*/

public class Java087_access {

	private int var_private = 1;
		    int var_default = 2;
    protected int var_protected = 3;
    public int var_public = 4;

    public Java087_access() {
    	
	}

}
