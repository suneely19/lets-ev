package com.india.letsev.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class LetsEvSessionListener implements HttpSessionListener {
    int count=0;
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
       if(httpSessionEvent.getSession().isNew()){
           count++;
           System.out.println("New session created : "+ count);
       }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
                count--;
    }
}
