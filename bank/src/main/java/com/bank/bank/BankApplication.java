package com.bank.bank;

import com.bank.bank.users.infrastructure.controllers.model.dtos.UserDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import java.util.ArrayList;

@SpringBootApplication
public class BankApplication implements CommandLineRunner{

	//private final static Logger log = (Logger) LoggerFactory.getLogger(BankApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	public Flux<UserDto> getUsers(){
		UserDto userDto1 = new UserDto(12L,"Felipe","Quiceno","23423nkm23-32");
		UserDto userDto2 = new UserDto(13L,"Andres","Romero","2342323-32");
		UserDto userDto3 = new UserDto(14L,"Carlos","Quintero","23456nkm23-32");

		ArrayList<UserDto> users = new ArrayList<>();
		users.add(userDto1);
		users.add(userDto2);
		users.add(userDto3);

		return Flux.fromIterable(users);
	}

	@Override
	public void run(String... args) throws Exception {

		getUsers().subscribe(u -> System.out.println(u));
	}
}
