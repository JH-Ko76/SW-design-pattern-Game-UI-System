package Sw_project;

public class Prototype_BarracksUnit implements Cloneable {
	
	//���ֵ��� �̸� 
	private String name;
	//���ֵ��� ����
	private String Weapon;
	
	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
		
	}
	
	public void setWeapon(String Weapon) {
		this.Weapon = Weapon;
		
	}

	public String getWeapon() {
		return Weapon;
		
	}
	
}
