package com.lr.dormidemo;

public class Dormi {
    private String stuName;
    private int stuNum;
    private String dorNum;
    private int bedNum;
    private Repair repair;
    private WaterAndEle waterAndEle;

    public String notice;

    public Dormi(String stuName,int stuNum,String dorNum,int bedNum,Repair repair,WaterAndEle waterAndEle){
        this.stuName=stuName;
        this.stuNum=stuNum;
        this.dorNum=dorNum;
        this.bedNum=bedNum;
        this.repair=repair;
        this.waterAndEle=waterAndEle;
    }
    public Dormi(String stuName,int stuNum,String dorNum,int bedNum){
        this.stuName=stuName;
        this.stuNum=stuNum;
        this.dorNum=dorNum;
        this.bedNum=bedNum;
    }

    public Dormi(String stuName,int stuNum,String walDate,int walNum,String walType){
        this.stuName=stuName;
        this.stuNum=stuNum;
        this.waterAndEle.setWalDate(walDate);
        this.waterAndEle.setWalNum(walNum);
        this.waterAndEle.setWalType(walType);
    }
    public Dormi(String reType,String reCampus,String rePlace,String rePhone,String reDate)
    {
        this.repair.setReType(reType);
        this.repair.setReCampus(reCampus);
        this.repair.setRePlace(rePlace);
        this.repair.setRePhone(rePhone);
        this.repair.setReDate(reDate);
        this.repair.setReId();
    }

    public String getStuName(){
        return stuName;
    }
    public void setStuName(String stuName){
        this.stuName=stuName;
    }

    public int getStuNum(){
        return stuNum;
    }
    public void setStuNum(int stuNum){
        this.stuNum=stuNum;
    }

    public String getDorNum(){
        return dorNum;
    }
    public void setDorNum(String dorNum){
        this.dorNum=dorNum;
    }

    public int getBedNum(){
        return bedNum;
    }
    public void setBedNum(int bedNum){
        this.bedNum=bedNum;
    }

    public Repair getRepair(){
        return repair;
    }
    public void setRepair(Repair repair){
        this.repair=repair;
    }

    public WaterAndEle getWaterAndEle(){
        return waterAndEle;
    }
    public void setWaterAndEle(WaterAndEle waterAndEle){
        this.waterAndEle=waterAndEle;
    }

    //@override
    public String toString(){
        return "stuName="+stuName+"  "+
                "stuNum="+stuNum+"  "+
                "dorNum="+dorNum+"  "+
                "bedNum="+bedNum+"  ";
                /*+"repair="+repair+"  "+
                "waterAndEle="+waterAndEle+"  ";*/
    }



}
