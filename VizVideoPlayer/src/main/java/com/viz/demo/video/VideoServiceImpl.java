package com.viz.demo.video;

import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
    private VideoRepository videoRepository;
	
	public boolean getFileProperties(File[] files) {
		for(File file : files) {
			VideoModel video = new VideoModel();
			video.setVideoName(file.getName());
			video.setPath(file.getAbsolutePath());
			video.setVideoSize(file.length());
			videoRepository.save(video);
		}
		return true;
	}
	public List<VideoModel> getAllVideos() {
		return videoRepository.findAll();
	}
	public VideoModel getVideoById(Long id) {
		return videoRepository.findByVideoId(id);
	}
}
