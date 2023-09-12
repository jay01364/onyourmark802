/* 간단한 자바 프로젝트
 * 은행 관리 시스템
 * 기능: 계좌를 생성하고 계좌 목록을 조회 해보고 그 계좌번호로 예금과 출금을 할 수 있다. 
 * 주요 함수: while, switch 반복문 






*/
package jcy.project;

	import java.text.DecimalFormat;
	import java.util.Scanner;

	/* (Banking)
	 */
	public class bank_managing_system {
	    private static Scanner scan = new Scanner(System.in); //입력받기
	    private static final String BankNo = "계좌";
	    private static int seq=0;//계좌번호 자동발번 
	    
		public static void main (String[] args) {
		        boolean run =true;
		        while(run) { //run이 true일 동안 반복
			      System.out.println("-------------------------------------");
			      System.out.println(" 1.계좌생성\n 2.계좌목록조회\n 3.예금\n 4.출금\n 5.종료");
			      System.out.println("-------------------------------------");
		          System.out.println("선택(숫자만 입력하세요.)>");
		          int caseNo = scan.nextInt(); //case 번호를 입력하세요.
		          switch(caseNo) {
//			          case 1: create_account(); break; //계좌생성 메소드
//			          case 2: account_list(); break; //계좌 목록 조회 메소드(생성예정)
//			          case 3: deposit(); break; // 예금 메소드(생성예정)
//			          case 4: withdraw(); break; // 출금 메소드(생성예정)
			          case 5: run=false; break; //종료된 경우, run이 false로 변하면서 반복문 종료
		          }
		        }
	      System.out.println("프로그램이 종료되었습니다.");
	  }
	
}
