package es.multitiendaMike.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.multitiendaMike.entitys.Cancion;
import es.multitiendaMike.entitys.Genero;
import es.multitiendaMike.servicios.CancionService;
import es.multitiendaMike.servicios.GeneroService;

@Controller
@RequestMapping("/cancion")
public class CancionesController {
	
	@Autowired
	CancionService cancionService;
	
	@Autowired
	GeneroService generoService;
	
	@GetMapping("/list")
	public String listadoCanciones(Model model) {
		model.addAttribute("listaCanciones", cancionService.findAll());
		return "/backend/listados/listadoCanciones";
	}

	@GetMapping("/nuevaCancion")
	public String nuevaCancionForm(Model model) {
		model.addAttribute("cancionForm", new Cancion());
		model.addAttribute("generos", generoService.findAll());
		return "/backend/formularios/formularioAddEditCancion";
	}

	@PostMapping("/new/summit")
	public String nuevaCancionSubmit(@ModelAttribute("cancionForm") Cancion nuevaCancion) {
		List<Genero> generos = generoService.findAll();
		
		for(Genero genero : generos) {
			if(genero.getNombre().equals(nuevaCancion.getGenero().getNombre())) {
				cancionService.save(nuevaCancion);
				return "redirect:/cancion/list";
			}
		}
		generoService.save(new Genero(nuevaCancion.getGenero().getNombre()));
		cancionService.save(nuevaCancion);
		return "redirect:/cancion/list";
	}

	@GetMapping("/edit/{id}")
	public String editarCancionForm(@PathVariable long id, Model model) {

		Cancion cancion = cancionService.findById(id);
		if (cancion != null) {
			model.addAttribute("cancionForm", cancion);
			return "/backend/formularios/formularioAddEditCancion";
		} else {
			return "redirect:/cancion/nuevaCancion";
		}
	}

	@PostMapping("/edit/summit")
	public String editarCancionSubmit(@ModelAttribute("cancionForm") Cancion cancion) {
		cancionService.save(cancion);
		return "redirect:/cancion/list";
	}

	@GetMapping("/delete/{id}")
	public String deleteCancion(@PathVariable long id, Model model) {
		Cancion cancion = cancionService.findById(id);
		if (cancion != null) {
			model.addAttribute("cancionForm", cancion);
			return "/backend/formularios/formularioDeleteCancion";
		} else {
			return "redirect:/cancion/list";
		}
	}

	@PostMapping("/delete/summit")
	public String deleteCancionSubmit(@ModelAttribute("cancionForm") Cancion cancion) {
		cancionService.delete(cancion);
		return "redirect:/cancion/list";
	}
}
