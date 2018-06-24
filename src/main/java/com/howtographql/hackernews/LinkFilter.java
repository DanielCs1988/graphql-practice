package com.howtographql.hackernews;

public class LinkFilter {

    private String urlContains;
    private String descContains;

    public String getUrlContains() {
        return urlContains;
    }

    public void setUrlContains(String urlContains) {
        this.urlContains = urlContains;
    }

    public String getDescContains() {
        return descContains;
    }

    public void setDescContains(String descContains) {
        this.descContains = descContains;
    }
}
