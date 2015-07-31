package com.builder.test;

import com.builder.impl.Client;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by will on 7/31/15.
 */
public class ClientTest {
    @Test
    public void buildClient(){
        Client test = new Client.ClientBuilder("hello", "world", "world@universe.com")
                .setAddress("100 Test lane")
                .setMiddleName("big")
                .build();
        assertEquals("100 Test lane", test.getAddress());
    }

}