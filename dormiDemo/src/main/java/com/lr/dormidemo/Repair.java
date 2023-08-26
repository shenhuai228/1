package com.lr.dormidemo;

import java.util.Date;
public class Repair {
    private int reId=0;
    private String reType;
    private String reCampus;
    private String rePlace;
    private String rePhone;
    private String reDate;
    private String reCondition;

    public Repair(String reType,String reCampus,String rePlace,
                  String rePhone,String reDate,String reCondition){
       // this.reStu=reStu;
        this.reId=this.reId+1;
        this.reType=reType;
        this.reCampus=reCampus;
        this.rePlace=rePlace;
        this.rePhone=rePhone;
        this.reDate=reDate;
        this.reCondition=reCondition;
    }

    public Repair(String reType){
        this.reType=reType;
    }

    public  int getReId(){
    return reId;
    }
    public void setReId(){
    this.reId=this.reId+1;
    }

    public String getReType()
    {
      return reType;
    }
    public void setReType(String reType){
    this.reType=reType;
    }

    public String getReCampus()
    {
        return reCampus;
    }
    public void setReCampus(String reCampus){
        this.reCampus=reCampus;
    }

    public String getRePlace()
    {
        return rePlace;
    }
    public void setRePlace(String rePlace){
        this.rePlace=rePlace;
    }

    public String getRePhone()
    {
        return rePhone;
    }
    public void setRePhone(String rePhone){
        this.rePhone=rePhone;
    }

    public String getReDate(){
        return reDate;
    }
    public void setReDate(String reDate){
        this.reDate=reDate;
    }

    public String getReCondition(){
        return reCondition;
    }
    public void setReCondition(String reCondition){
        this.reCondition=reCondition;
    }

    public String toString1(){
        return "reId="+reId+" reType="+reType+
                " reCampus="+reCampus+" rePlace="+rePlace
                +" rePhone="+rePhone+" reDate="+reDate;
    }

}
