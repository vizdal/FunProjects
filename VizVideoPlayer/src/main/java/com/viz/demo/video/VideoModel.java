package com.viz.demo.video;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class VideoModel {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VIDEO_SEQ_GEN")
	@SequenceGenerator(name="VIDEO_SEQ_GEN", sequenceName="VIDEO_SEQ_GEN", allocationSize=1)
	private Long videoId;
	
	@Column(name = "video_name")
	private String videoName;
	
	@Column(name = "video_path")
	private String path;
	
	@Column(name = "video_length")
	private Integer videoLength;
	
	@Column(name = "video_tag")
	private String videoTag;
	
	@Column(name = "video_size")
	private Long videoSize;
	
	@Column(name = "video_format")
	private Integer videoFormat;
	
	public Long getVideoId() {
		return videoId;
	}
	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public Integer getVideoLength() {
		return videoLength;
	}
	public void setVideoLength(Integer videoLength) {
		this.videoLength = videoLength;
	}
	public String getVideoTag() {
		return videoTag;
	}
	public void setVideoTag(String videoTag) {
		this.videoTag = videoTag;
	}
	public Long getVideoSize() {
		return videoSize;
	}
	public void setVideoSize(Long videoSize) {
		this.videoSize = videoSize;
	}
	public Integer getVideoFormat() {
		return videoFormat;
	}
	public void setVideoFormat(Integer videoFormat) {
		this.videoFormat = videoFormat;
	}
	
}
