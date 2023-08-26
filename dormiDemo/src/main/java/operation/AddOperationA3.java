package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;
import com.lr.dormidemo.Repair;

import java.util.Scanner;

public class AddOperationA3 implements IOperation{//报修单
    public void work(DormiList dl) {
        System.out.println("查找宿舍报修");
        //Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dl.getSize(); i++) {
            Dormi dormi = dl.getDormi(i);
            if(dormi.getRepair().getReCondition().equals("未接单")){
                System.out.println("该学生的宿舍号和床位分别是");
                System.out.println(dormi);
                //return;
            }
        }
        System.out.println("是否完成报修");
        Scanner sc = new Scanner(System.in);
        System.out.println("如完成请输入姓名");
        String name = sc.next();
        for (int i = 0; i < dl.getSize(); i++) {
            Dormi dormi = dl.getDormi(i);
            if(dormi.getStuName().equals(name)){

                Repair repair=dormi.getRepair();
                repair.setReCondition("已完成");
                dormi.setRepair(repair);
                System.out.println(dormi);
                //return;
            }
        }

    }
}
