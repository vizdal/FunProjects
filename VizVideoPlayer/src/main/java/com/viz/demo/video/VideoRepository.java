package com.viz.demo.video;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<VideoModel, Integer>{
	VideoModel findByVideoId(Long videoId);
}
