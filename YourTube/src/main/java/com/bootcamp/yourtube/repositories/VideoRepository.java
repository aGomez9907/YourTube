package com.bootcamp.yourtube.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bootcamp.yourtube.models.Video;

public interface VideoRepository extends JpaRepository<Video, Integer>{

}

