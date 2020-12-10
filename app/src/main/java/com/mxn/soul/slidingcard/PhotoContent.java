package com.mxn.soul.slidingcard;

/**
 * Created by cys on 15/6/24.
 *
 */
public class PhotoContent {

    private String id ;
    private String url ;
    private String title ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PhotoContent() {
    }

    public PhotoContent(String id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }
}
