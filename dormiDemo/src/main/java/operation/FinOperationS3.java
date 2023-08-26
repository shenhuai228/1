package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;

import java.util.Scanner;

public class FinOperationS3 implements IOperation{
    public void work(DormiList dl) {
        System.out.println("查找我的报修");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入报修学生名字：");
        String name = sc.next();
        System.out.println("该学生的报修如下：");
        for (int i = 0; i < dl.getSize(); i++) {
            Dormi dormi = dl.getDormi(i);
            if(dormi.getStuName().equals(name)){
                System.out.println(dormi.getRepair().toString1());

            }
        }
    }
}
