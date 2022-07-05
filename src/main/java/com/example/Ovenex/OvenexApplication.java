package com.example.Ovenex;

import com.example.Ovenex.Entities.Oven;
import com.example.Ovenex.Repository.OvenRepository;
import com.example.Ovenex.Repository.UserDataRepository;
import com.example.Ovenex.Services.Core;
import com.example.Ovenex.Services.Food;
import com.example.Ovenex.Services.Puerta;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.ui.context.Theme;

import javax.swing.*;

@SpringBootApplication
public class OvenexApplication {

	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OvenexApplication.class, args);

		OvenRepository ovenRepository = context.getBean(OvenRepository.class);
		UserDataRepository userDataRepository = context.getBean(UserDataRepository.class);

		Food food = new Food();
		Core core = new Core();
		Oven oven = new Oven();
		Puerta puerta = new Puerta();

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
