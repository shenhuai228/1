package operation;

import com.lr.dormidemo.DormiList;
import com.lr.dormidemo.Dormi;

import java.util.Scanner;

public class AddOperationA4 implements IOperation{
    public void work(DormiList dl) {
        Scanner sc = new Scanner(System.in);
        System.out.println("添加学生水电缴纳信息");
        System.out.println("请输入学生的名字：");
        String stuName = sc.nextLine();
        System.out.println("请输入学生的学号：");
        int stuNum = sc.nextInt();
        System.out.println("请输入学生缴纳日期：");
        String walDate = sc.next();
        System.out.println("请输入学生的水电费：");
        int walNum = sc.nextInt();
        System.out.println("请输入学生状态：");
        String walType = sc.next();

        Dormi book = new Dormi(stuName,stuNum,walDate,walNum,walType);
        int curSize = dl.getSize();//拿到长度
        dl.setDormi(curSize,book);
        dl.setSize(curSize+1);
        System.out.println("添加成功！");
    }

}
