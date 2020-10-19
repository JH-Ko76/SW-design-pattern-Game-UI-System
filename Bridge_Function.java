package Sw_project;

//스킬 클래스 정의
public class Bridge_Function {
      private Bridge_Btn Btn;
      
      public Bridge_Function(Bridge_Btn Btn) {
	    this.Btn =  Btn;
}
      public void setFunction(Bridge_Btn Btn) {
    	  this.Btn = Btn;
      }
     
      public void Stimpack() {
    	  Btn.Stimpack();
      }
      public void Ghost_LockDown() {
    	  Btn.Ghost_LockDown();
      }
      
      public void Nuclear_Strike() {
    	  Btn.Nuclear_Strike();
      }
      public void Cloaking() {
    	  Btn.Cloaking();
      }
      

   }

