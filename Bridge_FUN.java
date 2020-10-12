package Sw_project;

public  class Bridge_FUN implements Bridge_Btn {

	@Override
	public void Stimpack() {
		System.out.println("스팀팩");
		System.out.println("사용시 유닛의 공격속도, 이동속도가 빨라집니다.");

	}


	@Override
	public void Ghost_LockDown() {
		// TODO Auto-generated method stub
		System.out.println("락 다운 사용");
		System.out.println("기계유닛을 10초동안 어떠한 동작도 못하게 합니다.");
	}
	
	@Override
	public void Nuclear_Strike() {
		// TODO Auto-generated method stub
		System.out.println("핵 미사일 사용");
		System.out.println("핵 미사일을 발사하여 일정범위 안에 피해를 줍니다. ");
	}
	@Override
	public void Cloaking() {
		// TODO Auto-generated method stub
		System.out.println("은신 사용");
		System.out.println("마나를 소모하여 적대 유닛에게는 보이지 않는 은신상태가 됩니다.");
    
	}
    

	}





