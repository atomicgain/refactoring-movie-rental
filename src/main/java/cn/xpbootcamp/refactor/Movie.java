package cn.xpbootcamp.refactor;

public class Movie {

    static final int CAMPUS = 2;
    static final int HISTORY = 0;
    static final int NEW_RELEASE = 1;

    private String movieName;
    private int priceCode;

    Movie(String title, int priceCode) {
        this.movieName = title;
        this.priceCode = priceCode;
    }

    int getPriceCode() {
        return priceCode;
    }

    String getTitle() {
        return movieName;
    }
}
