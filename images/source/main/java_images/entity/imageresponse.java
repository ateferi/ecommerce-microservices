package com.amol.microservices.images.entity;

import java.util.List;

/**
 * @author Abebe Lemma
 **/
public class ImageResponse {
    private List<Image> images;

    public ImageResponse(){
    }

    public ImageResponse(List<Image> images){
        this.images = images;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
Footer
© 2022 GitHub, Inc.