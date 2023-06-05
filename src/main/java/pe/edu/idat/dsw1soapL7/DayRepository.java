package pe.edu.idat.dsw1soapL7;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DayRepository {
	private static final Map<String, Country> days = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lunes = new Country();
		lunes.setName("Lunes");
		lunes.setNameEnglish("Monday");

		days.put(lunes.getName(), lunes);

		Country martes = new Country();
		martes.setName("Martes");
		martes.setNameEnglish("Tuesday");
		
		days.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("Miercoles");
		miercoles.setNameEnglish("Wednesday");

		days.put(miercoles.getName(), miercoles);

		Country jueves = new Country();
		jueves.setName("Jueves");
		jueves.setNameEnglish("Thursday");

		days.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("Viernes");
		viernes.setNameEnglish("Friday");

		days.put(viernes.getName(), viernes);

		Country sabado = new Country();
		sabado.setName("Sabado");
		sabado.setNameEnglish("Saturday");

		days.put(sabado.getName(), sabado);

		Country domingo = new Country();
		domingo.setName("Domingo");
		domingo.setNameEnglish("Sunday");

		days.put(domingo.getName(), domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return days.get(name);
	}
}