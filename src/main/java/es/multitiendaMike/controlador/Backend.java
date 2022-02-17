package es.multitiendaMike.controlador;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import es.multitiendaMike.modelo.servicios.CancionService;

@Controller
public class Backend {
	@Autowired
	private CancionService cancionService;
	@GetMapping({"/admin"})
	public String admin(Model model) throws MalformedURLException {
		
		InetAddress addr=null;
		String hostnameCanonical=null;
		String hostname=null;
		byte[] address = null;
		final String currentURL = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
		URL requestURL = new URL(currentURL);
		model.addAttribute("host",requestURL.getHost());
		
		return "backend/admin";
	}
	
	@GetMapping({"/admin/listadoCanciones"})
	public String listadoCanciones(Model model) throws MalformedURLException{
		
		//model.addAttribute("listarCanciones",cancionService.findAll());
		return "backend/listadoCanciones";
	}
}