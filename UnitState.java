package Sw_project;

//��û Ŭ����
public class UnitState {
    private State_control st_control;
    
    //�׼� ����
    public void setState_control(State_control st_control) {
    	this.st_control = st_control;
    	
    }
    
    public void KeyPush() {
    	st_control.Unit_control();
    }
     
}
