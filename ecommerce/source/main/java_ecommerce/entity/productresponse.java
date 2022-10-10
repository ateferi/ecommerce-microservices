package com.amol.microservices.ecommerce.entity;

import java.util.List;

/**
 * @author Abebe Lemma
 **/
public class ProductResponse{
    private List<Product> products;

    public ProductResponse(){
    }

    public ProductResponse(List<Product> products){
        this.products = products;
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}