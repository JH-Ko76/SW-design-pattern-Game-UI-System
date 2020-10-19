package Sw_project;

public class Bridge_Code extends Bridge_Function{
	
//각각의 기능을 상속받아 구현한 메서드를 호출
	public Bridge_Code(Bridge_Btn Btn) {
		super(Btn);
	} 

	public Bridge_Code StimpackBtn() {
			Stimpack();
	      return this;
	}
	public Bridge_Code Ghost_LockDownBtn() {
		Ghost_LockDown();
		  return this;
	}
	
	public Bridge_Code Nuclear_StrikeBtn() {
		Nuclear_StrikeBtn();
	      return this;
	}
	public Bridge_Code CloakingBtn() {
	      CloakingBtn();
		  return this;
	
	}
}

    
    

