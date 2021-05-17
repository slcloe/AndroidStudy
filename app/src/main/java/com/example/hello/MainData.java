package com.example.hello;

public class MainData {
    private int iv_prifile;
    private String tv_name;
    private String tv_content;


    public MainData(int iv_prifile, String tv_name, String tv_content) {
        this.iv_prifile = iv_prifile;
        this.tv_name = tv_name;
        this.tv_content = tv_content;
    }

    public int getIv_prifile() {
        return iv_prifile;
    }

    public void setIv_prifile(int iv_prifile) {
        this.iv_prifile = iv_prifile;
    }

    public String getTv_name() {
        return tv_name;
    }

    public void setTv_name(String tv_name) {
        this.tv_name = tv_name;
    }

    public String getTv_content() {
        return tv_content;
    }

    public void setTv_content(String tv_content) {
        this.tv_content = tv_content;
    }
}
