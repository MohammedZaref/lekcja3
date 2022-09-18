package Future.Collars;

import Future.Collars.OOP_1.Excercise1.Place;
import Future.Collars.OOP_1.Excercise2.Film;
import Future.Collars.OOP_1.Excercise3.BaseEmployee;

public class Main {

    public static void main(String[] args) {
        // LEKCJA 3 EXERCISE 1 STARTS HERE
        Place newPlaceInCinema = new Place(5,3,true);
//        newPlaceInCinema.setPlaceNumber(5);
//        newPlaceInCinema.setRowNumber(3);
//        newPlaceInCinema.setPlaceStatus(true);

        System.out.println("Place Number: " + newPlaceInCinema.getPlaceNumber());
        System.out.println("Row number: " + newPlaceInCinema.getRowNumber());
        System.out.println("Is busy: " + newPlaceInCinema.getPlaceStatus());
        // LEKCJA 3 EXERCISE 1 ENDS HERE

        // EXERCISE 2 STARTS HERE
        Film newFilm = new Film();

//        newFilm.setTitle("The Social Network");
//        newFilm.setDirectorFullName("David Fincher");
//        newFilm.setDuration(120);
//        newFilm.setProductionYear(2010);
        System.out.println("Film: " + newFilm.getTitle());
        System.out.println("Directed By: " + newFilm.getDirectorFullName());
        System.out.println("Duration: " + newFilm.getDuration());
        System.out.println("Year of Production: " + newFilm.getProductionYear());
        // EXERCISE 2 ENDS HERE

        // EXERCISE 3 STARTS HERE




    }
}
