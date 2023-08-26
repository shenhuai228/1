package User;

import java.util.Scanner;
import operation.*;
public class Administrator extends User {
    public Administrator(String name){
        super(name);
        this.operation=new IOperation[]{new ExiOperation(),new AddOperationA1(),new DelOperationA2(),
                new AddOperationA3(),new AddOperationA4()};
    }

    @Override
    public int menu(){
        System.out.println("welcom"+this.name);
        Scanner sc=new Scanner(System.in);
        System.out.println("=============");
        System.out.println("1.分配宿舍");
        System.out.println("2.删除学生信息");
        System.out.println("3.报修单");
        System.out.println("4.水电缴纳");
        System.out.println("0.退出系统");
        System.out.println("=============");
        int choice=sc.nextInt();
        return choice;
    }




}
