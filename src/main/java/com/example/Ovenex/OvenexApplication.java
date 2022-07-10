package com.example.Ovenex;

import com.example.Ovenex.Entities.Oven;
import com.example.Ovenex.Repository.OvenRepository;
import com.example.Ovenex.Services.Core;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class OvenexApplication {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OvenexApplication.class, args);

		OvenRepository ovenRepository = context.getBean(OvenRepository.class);

		Core core = new Core();

		Oven ovenexU = new Oven(null,
				"OvenexU",
				0,
				500,
				0,
				false,
				false,
				false,
				"blue",
				35.0,
				30.0);

		ovenRepository.save(ovenexU);

		core.welcome();
		core.mainMenu();


	}

	public static void restart(){
		ApplicationArguments args = context.getBean(ApplicationArguments.class);
		Thread thread = new Thread(() -> {
			context.close();
			context = SpringApplication.run(OvenexApplication.class, args.getSourceArgs());
		});

		thread.setDaemon(false);
		thread.start();
	}
}
