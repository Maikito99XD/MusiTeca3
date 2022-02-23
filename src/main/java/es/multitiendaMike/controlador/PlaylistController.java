package es.multitiendaMike.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.multitiendaMike.entitys.PlayList;
import es.multitiendaMike.servicios.PlayListService;

@Controller
@RequestMapping("/playlist")
public class PlaylistController {

	@Autowired
	private PlayListService playlistService;
	
	@GetMapping("/list")
	public String listadoPlaylist(Model model) {
		model.addAttribute("listaPlaylist", playlistService.findAll());
		return "/backend/listados/listadoPlaylist";
	}

	@GetMapping("/nuevaPlaylist")
	public String nuevaPlaylistForm(Model model) {
		model.addAttribute("playlistForm", new PlayList());
		return "/backend/formularios/formularioAddPlaylist";
	}

	@PostMapping("/new/summit")
	public String nuevaPlaylistSubmit(@ModelAttribute("playlistForm") PlayList nuevaPlaylist) {
		playlistService.save(nuevaPlaylist);
		return "redirect:/playlist/list";
	}

	@GetMapping("/edit/{id}")
	public String editarPlaylistForm(@PathVariable long id, Model model) {

		PlayList playList = playlistService.findById(id);
		if (playList != null) {
			model.addAttribute("playlistForm", playList);
			return "/backend/formularios/formularioAddPlaylist";
		} else {
			return "redirect:/playlist/nuevaPlaylist";
		}
	}

	@PostMapping("/edit/summit")
	public String editarPlaylistSubmit(@ModelAttribute("playlistForm") PlayList playList) {
		playlistService.save(playList);
		return "redirect:/playlist/list";
	}

	@GetMapping("/delete/{id}")
	public String deletePlaylist(@PathVariable long id, Model model) {
		PlayList playList = playlistService.findById(id);
		if (playList != null) {
			model.addAttribute("playlistForm", playList);
			return "/backend/formularios/formularioDeletePlaylist";
		} else {
			return "redirect:/playlist/list";
		}
	}

	@PostMapping("/delete/summit")
	public String deletePlaylistSubmit(@ModelAttribute("playlistForm") PlayList playList) {
		playlistService.delete(playList);
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
	 * model) { model.addAttribute("playlist", new PlayList()); return
	 * "admin/form-playlist"; }
	 * 
	 * @PostMapping("/admin/listadoPlaylist") public String
	 * submitNuevaPlaylist(@ModelAttribute("playlist") PlayList playlist, Model
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
	 * PlayList playlist = playlistService.findById(id );
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
