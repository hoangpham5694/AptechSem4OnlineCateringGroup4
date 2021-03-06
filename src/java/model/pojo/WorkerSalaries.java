package model.pojo;
// Generated Jul 14, 2015 10:47:49 AM by Hibernate Tools 4.3.1

/**
 * WorkerSalaries generated by hbm2java
 */
public class WorkerSalaries  implements java.io.Serializable {


     private int id;
     private Workers workers;
     private Integer workingDay;
     private String payType;

    public WorkerSalaries() {
    }

	
    public WorkerSalaries(int id) {
        this.id = id;
    }
    public WorkerSalaries(int id, Workers workers, Integer workingDay, String payType) {
       this.id = id;
       this.workers = workers;
       this.workingDay = workingDay;
       this.payType = payType;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Workers getWorkers() {
        return this.workers;
    }
    
    public void setWorkers(Workers workers) {
        this.workers = workers;
    }
    public Integer getWorkingDay() {
        return this.workingDay;
    }
    
    public void setWorkingDay(Integer workingDay) {
        this.workingDay = workingDay;
    }
    public String getPayType() {
        return this.payType;
    }
    
    public void setPayType(String payType) {
        this.payType = payType;
    }




}


