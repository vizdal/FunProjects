package com.viz.demo.video;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Util.AppConstants;
import Util.VideoFileFilter;
import Util.MultipartFileSender;

@Controller
public class VideoController {
	@Autowired
	VideoService videoService;
	
	@RequestMapping(value="/video/list", method=RequestMethod.GET)
	public ModelAndView getVideoList() {
		Map<String, Object> dataMap = new HashMap<String,Object>();
		dataMap.put("response", videoService.getAllVideos());
		ModelAndView modelView = new ModelAndView("videolist");
		modelView.addObject("data", dataMap);
		return modelView;
	}
	@RequestMapping(value="/video/fetch",method = RequestMethod.GET)
	public void fetchVideoDetails(){
		/*
		 * Will fetch mp4 files from target directory.
		 * */
		File directory = new File(AppConstants.scanDirectory);
		File[] files = directory.listFiles(new VideoFileFilter());
		videoService.getFileProperties(files);
	}
	@RequestMapping(value = "/videos/{videoid}", method = RequestMethod.GET)
	public void getFullVideo(HttpServletRequest request, HttpServletResponse response,@PathVariable Long videoid) throws Exception {
		URI uri = new File(videoService.getVideoById(videoid).getPath()).toURI();
		MultipartFileSender.fromPath(Paths.get(uri))
        .with(request)
        .with(response)
    .serveResource();

	}
}
