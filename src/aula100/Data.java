package aula100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //formato so com data

		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Formato com data e horas
	
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); // fazendo isso o horario vai para o fuso-horario brasileiro
		
		Date x1 = new Date(); // cria o horario atual
		
		Date y1 = sdf1.parse("25/06/2018"); // Cria esta data no formato padrão do java
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); // Cria esta data e horas no formato padrão do java
		
		
		sdf1.format(y1); // imprime a data no formato convencional
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Modo mais rapido de formatar a data
		System.out.println(sdf2.format(d)); 
	}

}
