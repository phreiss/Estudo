package br.com.estudo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.Nasa.Nasa;
import br.com.estudo.Repository.NasaRepository;

@RestController
@RequestMapping(value = "/Nasa")
public class NasaController {

	@Autowired
	private NasaRepository nasaRepository;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewNasa(@RequestParam Nasa nasa) {
		Nasa n = new Nasa();
		n.setId(1);
		n.setCopyright(nasa.getCopyright());
		n.setDate(nasa.getDate());
		n.setExplanation(nasa.getExplanation());
		
		System.out.println(nasaRepository);

		nasaRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Nasa> getAllNasa() {
		// This returns a JSON or XML with the users
		return nasaRepository.findAll();
	}
}
