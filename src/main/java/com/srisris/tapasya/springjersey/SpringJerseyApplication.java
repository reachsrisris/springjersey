package com.srisris.tapasya.springjersey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.srisris.tapasya.springjersey.repository.ToDoRepository;

@SpringBootApplication(scanBasePackages = { "com.srisris.tapasya.springjersey" })
public class SpringJerseyApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private ToDoRepository todoRepository;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringJerseyApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJerseyApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		todoRepository.deleteAll();
		
		bootStrapToDo();

	}
	

	
	private void bootStrapToDo(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		ToDo td1 = new ToDo("Work on Java", "Learn Lambdas, Modules & clojures", dateFormat.format(date));
		todoRepository.save(td1);

		ToDo td2 = new ToDo("Work on Swift", "Learn Optionals", dateFormat.format(date));
		todoRepository.save(td2);
		
	}
}
