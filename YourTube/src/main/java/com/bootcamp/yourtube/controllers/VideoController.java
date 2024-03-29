package com.bootcamp.yourtube.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.yourtube.models.Video;
import com.bootcamp.yourtube.services.VideoService;





@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/videos")
public class VideoController {

	
	

	@Autowired
	VideoService videoService;

	@GetMapping("/test")
	public ResponseEntity<String> testing() {
		return new ResponseEntity<>("Probando metodos de videos", HttpStatus.CREATED);
	}

	@GetMapping()
	public ResponseEntity<List<Video>> getVideos() {
		return ResponseEntity.ok(videoService.obtenerVideos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Video>> getVideoById(@PathVariable Integer id) {
		return ResponseEntity.ok(videoService.obtenerVideoPorId(id));
	}

	@PostMapping()
	public ResponseEntity<String> createVideo(@RequestBody Video video) {
		return ResponseEntity.ok(videoService.cearVideo(video));
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateVideo(@PathVariable int id, @RequestBody Video video) {
		return ResponseEntity.ok(videoService.modificarVideo(id,video));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Video> deleteVideo(@PathVariable int id) {
		return ResponseEntity.ok(videoService.eliminarVideo(id));
	}
}
