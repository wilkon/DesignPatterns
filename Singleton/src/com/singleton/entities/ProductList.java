package com.singleton.entities;

import java.util.ArrayList;

/**
 * Created by will on 7/28/15.
 */
public class ProductList {
    ArrayList<String> productList;
    protected ProductList(){
        this.productList = new ArrayList<String>();
    }
    public ArrayList<String> getProducts(){
        return productList;
    }
    public void add(String product){
        this.productList.add(product);
    }
}
