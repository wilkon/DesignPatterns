package com.singleton.impl.threadsafe;

/**
 * Created by will on 7/28/15.
 */
public class ThreadSafeProd {
    private static ThreadSafeProd threadSafeList;
    private ThreadSafeProd(){

    }
    public static synchronized ThreadSafeProd getThreadSafeList(){
        if(threadSafeList == null)
            threadSafeList = new ThreadSafeProd();
        return threadSafeList;
    }
}
