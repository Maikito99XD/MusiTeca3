package es.multitiendaMike.controlador.controladoresEntidades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@GetMapping("/playlist/nuevaPlaylist")
	public String nuevaPlaylistForm(Model model) {
		model.addAttribute("playlistForm", new Playlist());
		return "/backend/formularios/formularioAddPlaylist";
	}

	@PostMapping("/playlist/new/summit")
	public String nuevaPlaylistSubmit(@ModelAttribute("playlistForm") Playlist nuevaPlaylist) {
		playlistService.add(nuevaPlaylist);
		return "redirect:/playlist/list";
	}

	@GetMapping("/playlist/edit/{id}")
	public String editarPlaylistForm(@PathVariable long id, Model model) {

		Playlist playlist = playlistService.findById(id);
		if (playlist != null) {
			model.addAttribute("playlistForm", playlist);
			return "/backend/formularios/formularioAddPlaylist";
		} else {
			return "redirect:/playlist/nuevaPlaylist";
		}
	}

	@PostMapping("/playlist/edit/summit")
	public String editarPlaylistSubmit(@ModelAttribute("playlistForm") Playlist playlist) {
		playlistService.edit(playlist);
		return "redirect:/playlist/list";
	}

	@GetMapping("/playlist/delete/{id}")
	public String deletePlaylist(@PathVariable long id, Model model) {
		Playlist playlist = playlistService.findById(id);
		if (playlist != null) {
			model.addAttribute("playlistForm", playlist);
			return "/backend/formularios/formularioDeletePlaylist";
		} else {
			return "redirect:/playlist/list";
		}
	}

	@PostMapping("/playlist/delete/summit")
	public String deletePlaylistSubmit(@ModelAttribute("playlistForm") Playlist playlist) {
		playlistService.delete(playlist);
		return "redirect:/playlist/list";
	}

	/*
	 * @Autowired private PlayListService playlistService;
	 * 
	 * @GetMapping("/admin/listarPlaylist") public String index(Model model) {
	 * model.addAttribute("playlist", playlistService.findAll()); return
	 * "admin/list-categoria"; }
	 * 
	 * @GetMapping("/admin/formularioPlayList") public String nuevaPlaylist(Model
	 * model) { model.addAttribute("playlist", new Playlist()); return
	 * "admin/form-playlist"; }
	 * 
	 * @PostMapping("/admin/listadoPlaylist") public String
	 * submitNuevaPlaylist(@ModelAttribute("playlist") Playlist playlist, Model
	 * model) {
	 * 
	 * playlistService.save(playlist);
	 * 
	 * return "redirect:/admin"; }
	 * 
	 * 
	 * @GetMapping("/borrar/{id}") public String borrarCategoria(@PathVariable("id")
	 * Long id, Model model) {
	 * 
	 * Playlist playlist = playlistService.findById(id );
	 * 
	 * if (playlist != null) {
	 * 
	 * if (productoService.numeroProductosCategoria(categoria) == 0) {
	 * categoriaService.delete(categoria); } else { return
	 * "redirect:/admin/categoria/?error=true"; }
	 * 
	 * }
	 * 
	 * return "redirect:/admin/categoria/"; }
	 */
}
