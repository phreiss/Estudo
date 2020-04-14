import org.springframework.beans.factory.annotation.Autowired;

import br.com.estudo.Controller.NasaController;
import br.com.estudo.Repository.NasaRepository;

public class test1 {
	
	@Autowired 
	public static NasaController nasaController;
	
	@Autowired
	private static NasaRepository nasaRepository;

	public static void main(String[] args) {
		System.out.println(nasaController);
		System.out.println(nasaRepository);
	}
	
}
