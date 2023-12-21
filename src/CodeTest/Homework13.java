package CodeTest;

public class Homework13 {

	public static void main(String[] args) {
		/*
		 * 예약시스템
		 */
		Reserve reserve1 = Reserve.getInstance();
		Reserve reserve2 = Reserve.getInstance();
		reserve1.getReserve("정찬우");
		reserve2.getReserve("김민재");
		reserve2.complete("정찬우");
		

	}
}
class Reserve{
	private String name;
	private boolean reserve;
	
	/*
	 * 싱글톤 만들기
	 */
	private static Reserve instance = null;
	private Reserve() {
	}
	public static Reserve getInstance() {
		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
	
	/*
	 * 예약 메소드 만들기
	 * 이미 예약되어 있으면 "예약 되어 있습니다" 출력
	 * 아니면 예약에 name="예약 할 사람 이름", reserve = true;
	 */
	
	public void getReserve(String n) {
		if(reserve) {
			System.out.println(name+"님이 이미 예약되어 있습니다.");
		}else {
			System.out.println(n+"님 예약이 완료 되었습니다.");
			name = n;
			reserve = true;
		}
	}
	
	
	
	/*
	 * 예약 처리하는 메소드 만들기.
	 * name = null
	 * reserve = false
	 * 
	 * "예약된 사람 이름"님 주문이 완료되었습니다.
	 */
	public void complete(String n) {
		if(n==name) {
			System.out.println(name+"님 주문 완료 되었습니다.");
			name=null;
			reserve=false;
		}else System.out.println("예약된 사람이 아닙니다.");
	}
	
	
	
	
	
}
