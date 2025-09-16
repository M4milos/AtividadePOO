package Atividade160925;
import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		/*
		Calendar calendario = Calendar.getInstance();
		calendario.set(calendario.DAY_OF_MONTH, 24);
		calendario.set(Calendar.MONTH, 3);
		calendario.set(Calendar.YEAR, 1978);
		calendario.set(Calendar.HOUR_OF_DAY, 13);
		calendario.set(Calendar.MINUTE, 30);
		calendario.set(Calendar.SECOND, 55);
		Date dt = calendario.getTime();
		System.out.println("Rodriguinho nasceu em: " + dt);
		
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		Instant inst = Instant.now();
		System.out.println(inst);
		
		LocalDate ldanv = LocalDate.parse("1978-04-24");
		System.out.println(ldanv);
		
		LocalDateTime lcdtanv = LocalDateTime.parse("1978-04-24T15:27:21");
		System.out.println(lcdtanv);
		
		
		
		DateTimeFormatter dtDataBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dtbr = LocalDate.parse("24/04/1978", dtDataBrasil);
		System.out.println(dtbr);
		
		DateTimeFormatter dtDataHoraBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime dtbrhr = LocalDateTime.parse("24/04/1978 15:01:27", dtDataHoraBrasil);
		System.out.println(dtbrhr);
		
		LocalDate dtof = LocalDate.of(1978, 4, 24);
		System.out.println(dtof);
		
		LocalDateTime ldtof = LocalDateTime.of(1978, 4, 24, 15, 45, 58);
		System.out.println(ldtof);
		*/
		
		Instant instanv = Instant.parse("1978-04-24T15:27:21-03:00");
		System.out.println(instanv);
	}
}
