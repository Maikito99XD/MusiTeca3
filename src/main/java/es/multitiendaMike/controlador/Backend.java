package es.multitiendaMike.controlador;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
public class Backend {
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
}