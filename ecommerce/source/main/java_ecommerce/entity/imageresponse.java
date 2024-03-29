package com.amol.microservices.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Abebe Lemma
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {

    private int productId;

    private String path;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
Footer
� 2022 GitHub, Inc.
Footer navigation
Terms