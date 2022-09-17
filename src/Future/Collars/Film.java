package Future.Collars;

public class Film {
    private String filmTitle;
    private String directorFullName;
    private int duration;
    private int productionYear;

    public String getFilmTitle() {
        return filmTitle;
    }

    public String getDirectorFullName() {
        return directorFullName;
    }

    public int getDuration() {
        return duration;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }
    public void setDirectorFullName(String directorFullName) {
        this.directorFullName = directorFullName;
    }
    public void setDuration (int duration) {
        this.duration = duration;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
