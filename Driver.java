package CodingEx2_9;

import java.util.Arrays;
import java.util.Scanner;

class Driver {
	Reservation r;
	int[] seats;
	Seats se;
	int num;
	public Driver(Reservation r) {
		this.r=r;
	}
	int[] run() {
		
		//seats = new int[10];
		//int s = 0;
		System.out.println("-------------------------------------------");		
		System.out.println(">>좌석번호 : 1 2 3 4 5 6 7 8 9 10");
		System.out.println("-------------------------------------------");	
		System.out.print("예약가능(0):");		
		//se = new Seats();
		for(int i = 0; i < 10; i++){
			//s = se.seats[i];
			//System.out.print(se.seats[i]);
			
			if(se.seats[num]>0) se.seats[i]=1;
			System.out.printf("%2d",se.seats[i]);
		}
		System.out.println(se.toString());
		System.out.println();
		num = r.run(this);
		
		//System.out.println("num="+num);
	return seats;
	}
}

class Reservation{
	//예약하기
	int num;
	Driver d;
	Seats s;
	public Reservation(Seats s) {
		this.s = s;
	}
	int run(Driver d){
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째 좌석을 예약하시겠습니까? ");
		num = sc.nextInt();sc.nextLine();
		num--;
		System.out.println("s.seats[num]:"+s.seats[num]);
		//System.out.println(d.num);
		if(s.seats[num]==1)System.out.println("이미 예약된 자리입니다.");
		else {
			s.seats[num]=1;
			
			System.out.println("예약되었습니다.");
			System.out.println("s.seats[num]:"+s.seats[num]);
		}
		System.out.println(s.toString());
		System.out.print("좌석을 예약하시겠습니까?(y 또는 n) ");
		String ans = sc.nextLine().trim();
		if(ans.toLowerCase().equals("y")) {
			//예약된 화면 보여주기
			d.run();
			
		}else {
			d.run();
		}
		sc.close();
		return num;
	}
}

class Seats{
	int[] seats;
	public Seats() {
		seats = new int[10];
	}
	public int[] getSeats() {
		return seats;
	}
	public void setSeats(int[] seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Seats [seats=" + Arrays.toString(seats) + "]";
	}
	
}
