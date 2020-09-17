package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Glasac;

@RestController
@RequestMapping(value = "glasac")
public class GlasacController {

	@PostMapping(value="/dodajGlasaca",consumes = "application/json")
	public ResponseEntity<Boolean> dodajGlasaca(@RequestBody Glasac glasac){
		System.out.println(glasac.toString());
		return new ResponseEntity<>(true,HttpStatus.OK);
	}

}
