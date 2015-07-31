package com.singleton.test.bullpugh;

import com.singleton.impl.bullpugh.PughProd;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by will on 7/28/15.
 */
public class PughTest {
    @Test
    public void isSingleInstance(){
        assertTrue(PughProd.getPughProdImpl().getProducts().isEmpty());

        PughProd.getPughProdImpl().add("hello");
        assertTrue(PughProd.getPughProdImpl().getProducts().contains("hello"));

        PughProd.getPughProdImpl().drop("hello");
        assertFalse(PughProd.getPughProdImpl().getProducts().contains("hello"));

        assertTrue(PughProd.getPughProdImpl().getProducts().isEmpty());
    }

}