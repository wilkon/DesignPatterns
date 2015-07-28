package com.singleton.impl.bullpugh;

/**
 * Created by will on 7/28/15.
 */
public class PughProd {
    private PughProd(){

    }
    private static class singletonHelper{
        private static final PughProd instance = new PughProd();
    }
    public PughProd getPughProdImpl(){
        return singletonHelper.instance;
    }
}
