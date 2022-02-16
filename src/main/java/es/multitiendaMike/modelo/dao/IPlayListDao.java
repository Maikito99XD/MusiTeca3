package es.multitiendaMike.modelo.dao;

import java.util.List;

import es.multitiendaMike.modelo.entidades.Playlist;

public interface IPlayListDao {
public List<Playlist> findAll();
}
