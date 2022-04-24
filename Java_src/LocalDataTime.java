package WhiteBoard;
//KOPO_15
import java.time.Month;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class LocalDataTime {

	public static void main(String[] args) {
		//Time_difference is not taken into account.
		LocalDateTime localdateTime = LocalDateTime.now();
		System.out.println(localdateTime);
		
		//Time_difference is taken into account.
		OffsetDateTime offsetdatetime = OffsetDateTime.of(2022, Month.APRIL.getValue(), 8, 10, 20, 30, 0,
				ZoneOffset.of("+09:00"));
		System.out.println(offsetdatetime);
		
		//
		ZonedDateTime zoneddatetime = ZonedDateTime.parse("2022-04-24T14:50+09:00[Asia/Seoul]");
	}

}
