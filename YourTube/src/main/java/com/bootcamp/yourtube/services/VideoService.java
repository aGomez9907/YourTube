package com.bootcamp.yourtube.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bootcamp.yourtube.models.Video;
import com.bootcamp.yourtube.repositories.VideoRepository;

@Service
public class VideoService {

	
	@Autowired
	VideoRepository videoRepository;
	
	
	public List<Video> obtenerVideos() {
		return videoRepository.findAll();
	}

	public Optional<Video> obtenerVideoPorId(Integer id) {
		return videoRepository.findById(id);
	}
	
	public String cearVideo(Video video) {
		videoRepository.save(video);
		return "Video creada correctamente";
	}
	
	public String modificarVideo(Integer id, Video video) {
		try {
			Video v = videoRepository.findById(id).get(); 
			v.setUrl(video.getUrl());
			v.setCategory(video.getCategory());
			v.setDescription(video.getDescription());
			v.setViews(video.getViews());
			v.setLikes(video.getLikes());
			v.setDislikes(video.getDislikes());
			videoRepository.save(v);
			return "Video "+ id +" modificada correctamente.";
		}catch(Exception err) {
			return "Error: el video no pudo ser modificado.";
		}
		
		
		
		
//		Video v = videoRepository.findById(id).get(); // obtengo la tarea original
//		if(v != null) {
//			v.setUrl(video.getUrl());
//			v.setCategory(video.getCategory());
//			v.setDescription(video.getDescription());
//			v.setViews(video.getViews());
//			v.setLikes(video.getLikes());
//			v.setDislikes(video.getDislikes());
//			videoRepository.save(v);
//			return "Video "+ id +" modificada correctamente.";
//		}
//		return "Error: el video no pudo ser modificado.";
		
		
	}
	
	
	public Video eliminarVideo(Integer id) {
		try {
		Video videoToReturn = videoRepository.findById(id).get();
		videoRepository.deleteById(id);
		//si el borrado es lógico aca habria que llamar al metodo que cambia el valor de eliminado. El mismo debe ser creado dentro del servicio tambien
		return videoToReturn;
		}catch(Exception err) {
			err.getMessage();
		}
		return null;
	}
}
