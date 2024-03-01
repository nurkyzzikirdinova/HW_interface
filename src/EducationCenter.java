import java.time.LocalDate;

public  abstract  class EducationCenter {

    private String EducationCenterName;
    private String  locatedCountry;
    private LocalDate foundationYear;


    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this. EducationCenterName = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }


    @Override
    public String toString() {
        return EducationCenterName +",  "+
                "located country - " + locatedCountry +" , "+
                "foundation date - " + foundationYear
               ;
    }


}
