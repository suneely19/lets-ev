package com.india.letsev.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class LetsEvListener implements ServletRequestListener {

    int count=0;
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        count++;
        System.out.println("request number : "+ count);

    }
}
