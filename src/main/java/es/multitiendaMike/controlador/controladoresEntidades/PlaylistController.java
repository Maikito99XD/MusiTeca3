package es.multitiendaMike.controlador.controladoresEntidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import es.multitiendaMike.hibernate.Playlist;
import es.multitiendaMike.modelo.servicios.PlayListService;
//import es.multitiendaMike.modelo.servicios.PlayListService;

@Controller
public class PlaylistController {
	
	@Autowired
	private PlayListService playlistService;
	
	@GetMapping("/playlist/list")
	public String listadoPlaylist(Model model) {
		model.addAttribute("listaPlaylist", playlistService.findAll());
		return "/backend/listados/listadoPlaylist";
	}
	/*
	@Autowired
	private PlayListService playlistService;
	
	@GetMapping("/admin/listarPlaylist")
	public String index(Model model) {
		model.addAttribute("playlist", playlistService.findAll());
		return "admin/list-categoria";
	}
	
	@GetMapping("/admin/formularioPlayList")
	public String nuevaPlaylist(Model model) {
		model.addAttribute("playlist", new Playlist());
		return "admin/form-playlist";
	}
	
	@PostMapping("/admin/listadoPlaylist")
	public String submitNuevaPlaylist(@ModelAttribute("playlist") Playlist playlist, Model model) {
		
		playlistService.save(playlist);
		
		return "redirect:/admin";
	}
	

	@GetMapping("/borrar/{id}")
	public String borrarCategoria(@PathVariable("id") Long id, Model model) {
		
		Playlist playlist = playlistService.findById(id );
		
		if (playlist != null) {
			
			if (productoService.numeroProductosCategoria(categoria) == 0) {
				categoriaService.delete(categoria);				
			} else {
				return "redirect:/admin/categoria/?error=true";
			}
			
		} 

		return "redirect:/admin/categoria/";
	}
	*/
}
