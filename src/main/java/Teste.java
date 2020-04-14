import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.estudo.Controller.NasaController;
import br.com.estudo.Nasa.Nasa;
import br.com.estudo.Repository.NasaRepository;

public class Teste {
	
	@Autowired
	private static NasaController nasaController;
	
	@Autowired
	private static NasaRepository nasaRepository;
	
	public static void main(String[] args) throws Exception {
		
		String url = "https://api.nasa.gov/planetary/apod?api_key=RLcbMFRbbPR51LHpjSt6Gb8ASEuFVKkZka2X6Dde";

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");

		if (conn.getResponseCode() != 200) {
			System.out.println("Erro " + conn.getResponseCode() + " ao obter dados da URL " + url);
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		String output = "";
		String line;
		while ((line = br.readLine()) != null) {
			output += line;
		}

		JSONObject json = new JSONObject(output);

		Nasa n = new Nasa();
		n.setId(1);
		n.setCopyright(json.getString("url"));
		n.setDate(json.getString("date"));
		n.setExplanation(json.getString("explanation"));
		
		//nasaRepository.save(n);
		
		nasaController.addNewNasa(n);
		
		conn.disconnect();
	}
}
