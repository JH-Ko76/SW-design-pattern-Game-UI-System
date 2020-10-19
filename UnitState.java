package Sw_project;

//요청 클래스
public class UnitState {
    private State_control st_control;
    
    //액션 생성
    public void setState_control(State_control st_control) {
    	this.st_control = st_control;
    	
    }
    
    public void KeyPush() {
    	st_control.Unit_control();
    }
     
}
