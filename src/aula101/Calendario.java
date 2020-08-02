package aula101;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Calendario {

	public static void main(String[] args) throws ParseException {
		
		// Como manipular a data, por exmplo, alterar hora e data
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); // instanciando o calendar
		cal.setTime(d); // setando a data no Calendar
		cal.add(Calendar.HOUR_OF_DAY, 4); // adicionando 4 horas na data
		d = cal.getTime(); // atribuindo a nova data ao d
		
		int minutes = cal.get(Calendar.MINUTE); // obtendo valores referente a data
		System.out.println(minutes);
		
	}

}
