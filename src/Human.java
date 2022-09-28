public class Human {

    private Integer yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(String name, String town, Integer year, String job) {
        if (year < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = year;
        }
        if (name != null && name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town != null && town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job != null && job.isEmpty()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth < 0 || yearOfBirth == null) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
