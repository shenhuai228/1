package com.lr.dormidemo;
import java.util.Date;
public class WaterAndEle {
    private String walDate;
    private int walNum;
    private String walType;

    public WaterAndEle(String walDate,int walNum,String walType){
        this.walDate=walDate;
        this.walNum=walNum;
        this.walType=walType;
    }

    public String getWalDate(){
        return walDate;
    }
    public void setWalDate(String walDate){
        this.walDate=walDate;
    }

    public int getWalNum(){
        return walNum;
    }
    public void setWalNum(int walNum){
        this.walNum=walNum;
    }

    public String getWalType(){
        return walType;
    }
    public void setWalType(String walType){
        this.walType=walType;
    }

    public String toString2(){
        return "walDate="+walDate+" walNum="+walNum+
                " walType="+walType;
    }
}
