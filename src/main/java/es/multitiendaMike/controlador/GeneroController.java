package es.multitiendaMike.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.multitiendaMike.entitys.Genero;
import es.multitiendaMike.entitys.PlayList;
import es.multitiendaMike.servicios.GeneroService;

@Controller
@RequestMapping("/genero")
public class GeneroController {
	
	@Autowired
	private GeneroService generoService;
	
	@GetMapping("/list")
	public String listadoPlaylist(Model model) {
		model.addAttribute("listaGenero", generoService.findAll());
		return "/backend/listados/listadoGeneros";
	}

	@GetMapping("/nuevoGenero")
	public String nuevaPlaylistForm(Model model) {
		model.addAttribute("generoForm", new Genero());
		return "/backend/formularios/formularioAddEditGenero";
	}

	@PostMapping("/new/summit")
	public String nuevoGeneroSubmit(@ModelAttribute("generoForm") Genero nuevoGenero) {
		generoService.save(nuevoGenero);
		return "redirect:/genero/list";
	}

	@GetMapping("/edit/{id}")
	public String editarGeneroForm(@PathVariable long id, Model model) {

		Genero genero = generoService.findById(id);
		if (genero != null) {
			model.addAttribute("generoForm", genero);
			return "/backend/formularios/formularioAddEditGenero";
		} else {
			return "redirect:/genero/nuevoGenero";
		}
	}

	@PostMapping("/edit/summit")
	public String editarGeneroSubmit(@ModelAttribute("generoForm") Genero genero) {
		generoService.save(genero);
		return "redirect:/genero/list";
	}

	@GetMapping("/delete/{id}")
	public String deleteGenero(@PathVariable long id, Model model) {
		Genero genero = generoService.findById(id);
		if (genero != null) {
			model.addAttribute("generoForm", genero);
			return "/backend/formularios/formularioDeleteGenero";
		} else {
			return "redirect:/genero/list";
		}
	}

	@PostMapping("/delete/summit")
	public String deleteGeneroSubmit(@ModelAttribute("generoForm") Genero genero) {
		generoService.delete(genero);
		return "redirect:/genero/list";
	}
}
