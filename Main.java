package CodingEx2_9;

public class Main {

	public static void main(String[] args) {
/*
2. 9단계 - 공개 

배열을 이용하여 간단한 극장 예약 시스템을 작성한다.
좌석은 10개이다.
먼저 좌석 배치표를 보여준다.

예약이 끝난 좌석은 1로, 예약이 안된 좌석은 0으로 나타낸다.
*/

		new Driver(new Reservation(new Seats())).run();
		
	}

}
