package com.viz.demo.video;

import java.io.File;
import java.util.List;

public interface VideoService {
	public boolean getFileProperties(File[] files);
	public List<VideoModel> getAllVideos();
	public VideoModel getVideoById(Long id);
}
