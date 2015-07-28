package com.singleton.impl.bullpugh;

import com.singleton.entities.ProductList;

/**
 * Created by will on 7/28/15.
 */
public class PughProd extends ProductList {
    private PughProd(){

    }
    private static class singletonHelper{
        private static final PughProd instance = new PughProd();
    }
    public static PughProd getPughProdImpl(){
        return singletonHelper.instance;
    }
}
