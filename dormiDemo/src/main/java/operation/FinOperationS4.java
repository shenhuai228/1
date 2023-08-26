package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;

import java.util.Scanner;

public class FinOperationS4 implements IOperation{
    public void work(DormiList dl) {
        System.out.println("查找水电情况");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的学生名字：");
        String name = sc.next();
        for (int i = 0; i < dl.getSize(); i++) {
            Dormi dormi = dl.getDormi(i);
            if(dormi.getStuName().equals(name)){
                System.out.println("该学生缴费情况如下");
                System.out.println(dormi.getWaterAndEle().toString2());
                return;
            }
        }
        System.out.println("未找到该学生");
    }
}
