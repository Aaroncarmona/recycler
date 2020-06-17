package com.upax.masterlist.modules.recyclermaster.entities.amodelos;

import com.upax.masterlist.modules.recyclermaster.entities.base.ElementoBase;

public class PublicacionVideo extends ElementoBase {
    public String videoUrl;
    public long duration;
    public int resource;

    public PublicacionVideo(String videoUrl, long duration, int resource) {
        this.videoUrl = videoUrl;
        this.duration = duration;
        this.resource = resource;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
