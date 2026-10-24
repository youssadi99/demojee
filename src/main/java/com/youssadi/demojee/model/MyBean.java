package com.youssadi.demojee.model;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named("bean")
@SessionScoped
public class MyBean implements Serializable {
    private String txt;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    public String soumission(){
        return "display";
    }
}
