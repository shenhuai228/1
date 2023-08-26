package com.lr.dormidemo;

public class DormiList {
    private Dormi[] dormi;
    private int size;

    Repair repair1=new Repair("11","1","1","1","1","未接单");
    Repair repair2=new Repair("22","2","2","2","2","未接单");
    Repair repair3=new Repair("33","1","3","3","3","未接单");
    WaterAndEle wal1=new WaterAndEle("1",1,"1");
    WaterAndEle wal2=new WaterAndEle("2",2,"2");
    WaterAndEle wal3=new WaterAndEle("3",3,"3");

    public DormiList(){
        this.dormi=new Dormi[10];
        dormi[0]=new Dormi("林1",1,"1",1,repair1,wal1);
        dormi[1]=new Dormi("王2",2,"2",2,repair2,wal2);
        dormi[2]=new Dormi("刘3",3,"3",3,repair3,wal3);
        this.size=3;
    }

    public int getSize() {
        return  size;
    }
    public void setSize(int size){
        this.size=size;
    }

    public Dormi getDormi(int pos){
        return this.dormi[pos];
    }
    public void setDormi(int pos,Dormi dormi){
        this.dormi[pos]=dormi;
    }

}
