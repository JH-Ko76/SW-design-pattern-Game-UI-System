package Sw_project;

public class Decorator_Armor extends Decorator_Upgrade {
    private Decorator_Upgrade Upgrade;
    
    public Decorator_Armor(Decorator_Upgrade upgrade) {
    	this.Upgrade = upgrade;
    }
    public String getUpgrade() {
    	return "���� ����" + Upgrade.getUpgrade();
    	
    }
	
}