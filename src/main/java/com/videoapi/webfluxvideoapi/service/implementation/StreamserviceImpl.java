package com.videoapi.webfluxvideoapi.service.implementation;


import com.videoapi.webfluxvideoapi.service.StreamingService;
import com.videoapi.webfluxvideoapi.utils.Format;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StreamserviceImpl implements StreamingService {
    private final ResourceLoader resourceLoader;

    public Mono<Resource> getVideo(String title){
        return Mono.fromSupplier(()->resourceLoader.
                getResource(String.format(Format.getFormat(),title)))   ;
    }

}
