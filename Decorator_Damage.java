package Sw_project;

public class Decorator_Damage extends Decorator_Upgrade {
    private Decorator_Upgrade Upgrade;
    
    public Decorator_Damage(Decorator_Upgrade upgrade) {
    	this.Upgrade = upgrade;
    }
    public String getUpgrade() {
    	return "���ݷ� ����" + Upgrade.getUpgrade();
    	
    }
	
}