import java.util.Date;
import java.util.TreeMap;

public class Cat {
    private String name;
    private Boolean gender;
    private Date birthday;
    private String catBreed;
    private Boolean vaccinations;

    public Cat(String name, Boolean gender, String catBreed, Boolean vaccinations){
        this.name = name;
        this.gender = gender;
        this.catBreed = catBreed;
        this.vaccinations = vaccinations;
    }
    public String getGender(){
        if (this.gender)
            return "Кот";
        else
            return "Кошка";
    }
    public String getVaccination(){
        if(this.vaccinations)
            return "привит";
        else
            return "не привит";
    }
    public String getName(){
        return this.name;
    }
    public String getCatBreed(){
        return this.catBreed;
    }
    public void setVaccinations(boolean vaccination){
        this.vaccinations = vaccination;
    }

}
