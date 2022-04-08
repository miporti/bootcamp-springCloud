package com.everis.bootcamp.app.web;

import com.everis.bootcamp.app.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

import com.everis.bootcamp.app.service.PersonService;

@Controller
public class PersonListController {

	@Autowired
	PersonService personService;

	@GetMapping("/person-list")
	public String personList(final Model model) {

		final Flux<Person> personlist = personService.allPersons();

		model.addAttribute("personlist", personlist);

		return "personlist";
	}
}
