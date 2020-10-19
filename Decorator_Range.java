package Sw_project;

public class Decorator_Range extends Decorator_Upgrade {
    private Decorator_Upgrade Upgrade;
    
    public Decorator_Range(Decorator_Upgrade upgrade) {
    	this.Upgrade = upgrade;
    }
    public String getUpgrade() {
    	return "사거리 증가 " + Upgrade.getUpgrade();	
    }
}
