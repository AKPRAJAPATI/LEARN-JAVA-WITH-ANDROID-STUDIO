package com.example.javadevelopementapp.Models;

public class Model {
  public static final int LAYOUT_ONE_SHOW_TEXT = 1;
  public static final int LAYOUT_TWO_SHOW_PREVIEW = 2;
  public final int MY_VIEW_TYPE ;

private String show_title_text;
private String show_code_priview;
private int javaImage;

    public Model(int MY_VIEW_TYPE, String show_title_text) {
        this.MY_VIEW_TYPE = MY_VIEW_TYPE;
        this.show_title_text = show_title_text;
    }

 
    public Model(int MY_VIEW_TYPE, String show_code_priview, String show_title_text, int javaImage) {
        this.MY_VIEW_TYPE = MY_VIEW_TYPE;
        this.show_code_priview = show_code_priview;
        this.show_title_text = show_title_text;
        this.javaImage = javaImage;
    }



    public int getMY_VIEW_TYPE() {
        return MY_VIEW_TYPE;
    }

    public String getShow_title_text() {
        return show_title_text;
    }

    public void setShow_title_text(String show_title_text) {
        this.show_title_text = show_title_text;
    }

    public String getShow_code_priview() {
        return show_code_priview;
    }

    public void setShow_code_priview(String show_code_priview) {
        this.show_code_priview = show_code_priview;
    }

    public int getJavaImage() {
        return javaImage;
    }

    public void setJavaImage(int javaImage) {
        this.javaImage = javaImage;
    }
}
