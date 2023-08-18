package com.videoapi.webfluxvideoapi.controllers;

import com.videoapi.webfluxvideoapi.service.StreamingService;

import org.springframework.core.io.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/streaming")
public class StreamingController {
    private final StreamingService streamingService;

    @GetMapping(value ="video/{title}",produces = "video/mp4")
    public Mono<Resource> getVideos(@PathVariable String title, @RequestHeader("Range") String range){
        System.out.println("range in byte() "+range);
        return streamingService.getVideo(title);
    }
}
