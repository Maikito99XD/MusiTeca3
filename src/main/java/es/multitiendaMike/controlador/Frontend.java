package es.multitiendaMike.controlador;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import es.multitiendaMike.modelo.servicios.PlayListService;


@SuppressWarnings("unused")
@Controller
@RequestMapping("/")
public class Frontend {
		
	
	@GetMapping({"/","","/home","/inicio","/index"})
	public String inicio (Model model) throws MalformedURLException {
		
		InetAddress addr= null;
		String hostnameCanonical=null;
		String hostname=null;
		byte[] address = null;
		final String currentURL = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
		URL requestURL = new URL(currentURL);
		model.addAttribute("host",requestURL.getHost());
		    
		return "index";
	}
	
	@GetMapping({"/login"})
	public String login(Model model) {
		
		return "login/login";
	}
}
