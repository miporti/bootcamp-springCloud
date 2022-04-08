package com.everis.bootcamp.server.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import com.everis.bootcamp.server.domain.Person;
import java.time.Duration;

@RestController
public class PersonListController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		System.out.println("entro");
		Flux<Person> lista = Flux.just(new Person("Michael", "Jordan", 58), new Person("Lebron", "James", 36))
				.delaySequence(Duration.ofSeconds(3));

		return lista;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		System.out.println("entro");
		Flux<Person> lista = Flux.just(new Person("Serena", "Williams", 39), new Person("Simone", "Biles", 24))
				.delaySequence(Duration.ofSeconds(3));

		return lista;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		System.out.println("entro");
		Flux<Person> lista = Flux.just(new Person("Tom", "Cruise", 59), new Person("Denzel", "Washington", 66))
				.delaySequence(Duration.ofSeconds(3));

		return lista;
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		System.out.println("entro");
		Flux<Person> lista = Flux.just(new Person("Scarlett", "Johansson", 36), new Person("Jennifer", "Aniston", 52))
				.delaySequence(Duration.ofSeconds(3));

		return lista;
	}
}
