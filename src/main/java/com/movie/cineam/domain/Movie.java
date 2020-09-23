package com.movie.cineam.domain;

import java.util.Date;

public class Movie {

    private final String name;
    private final String imgUrl;
    private final String useYn;
    private final Date startDt;
    private final Date endDt;

    public Movie(String name, String imgUrl, String useYn, Date startDt, Date endDt){
        this.name = name;
        this.imgUrl = imgUrl;
        this.useYn = useYn;
        this.startDt = startDt;
        this.endDt = endDt;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getUseYn() {
        return useYn;
    }

    public Date getStartDt() {
        return startDt;
    }

    public Date getEndDt() {
        return endDt;
    }

}
