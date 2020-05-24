package com.aptheone.refactor;

public class VideoProcessor {

    private VideoEncoder videoEncoder;
    private VideoDatabase videoDatabase;
    private NotificationService notificationService;

    public VideoProcessor(VideoEncoder videoEncoder, VideoDatabase videoDatabase, NotificationService notificationService) {
        this.videoEncoder = videoEncoder;
        this.videoDatabase = videoDatabase;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        videoEncoder.encode(video);
        videoDatabase.store(video);
        notificationService.notify(video.getUser());
    }
}

