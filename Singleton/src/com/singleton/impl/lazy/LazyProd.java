package com.singleton.impl.lazy;

import com.singleton.entities.ProductList;

/**
 * Created by will on 7/28/15.
 */
public class LazyProd extends ProductList {
    private static LazyProd lazyImpl;
    private LazyProd(){

    }
    public LazyProd getLazyImpl(){
        if(lazyImpl == null)
            lazyImpl = new LazyProd();
        return lazyImpl;
    }
}
