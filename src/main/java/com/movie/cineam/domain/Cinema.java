package com.movie.cineam.domain;

public class Cinema {

    private final int movieNo;
    private final String valideSeats;
    private final String bookedSeats;

    public Cinema(int movieNo, String validSeats, String bookedSeats){
        this.movieNo = movieNo;
        this.valideSeats = validSeats;
        this.bookedSeats = bookedSeats;
    }

    public int getMovieNo() {
        return movieNo;
    }

    public String getValideSeats() {
        return valideSeats;
    }

    public String getBookedSeats() {
        return bookedSeats;
    }


}
