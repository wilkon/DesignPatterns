package com.singleton.impl;

/**
 * Created by will on 7/28/15.
 */
public class EagerList {
    private static final EagerList productList = new EagerList();
    private EagerList(){

    }
    public EagerList getList(){
        return productList;
    }
}
