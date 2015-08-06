package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1



import java.util.HashSet;
import java.util.Set;

/**
 * Cities generated by hbm2java
 */
public class Cities  implements java.io.Serializable {


     private int id;
     private Countries countries;
     private String cityName;
     private Set catererses = new HashSet(0);

    public Cities() {
    }

	
    public Cities(int id) {
        this.id = id;
    }
    public Cities(int id, Countries countries, String cityName, Set catererses) {
       this.id = id;
       this.countries = countries;
       this.cityName = cityName;
       this.catererses = catererses;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Countries getCountries() {
        return this.countries;
    }
    
    public void setCountries(Countries countries) {
        this.countries = countries;
    }
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public Set getCatererses() {
        return this.catererses;
    }
    
    public void setCatererses(Set catererses) {
        this.catererses = catererses;
    }




}

