package cn.xpbootcamp.refactor;

public class Rental {

    private Movie movieName;
    private int daysRented;

    Rental(Movie name, int daysRented) {
        this.movieName = name;
        this.daysRented = daysRented;
    }

    Movie getMovie() {
        return movieName;
    }

    int getDaysRented() {
        return daysRented;
    }

}
