package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;
import java.util.Scanner;
public class AddOperationA1 implements IOperation {//分配宿舍
        @Override
        public void work(DormiList dl) {
            Scanner sc = new Scanner(System.in);
            System.out.println("添加学生和宿舍信息");
            System.out.println("请输入学生的名字：");
            String stuName = sc.nextLine();
            System.out.println("请输入学生的学号：");
            int stuNum = sc.nextInt();
            System.out.println("请输入学生宿舍号：");
            String dorNum = sc.next();
            System.out.println("请输入学生宿舍床位：");
            int bedNum = sc.nextInt();

            Dormi book = new Dormi(stuName,stuNum,dorNum,bedNum);
            int curSize = dl.getSize();//拿到长度
            dl.setDormi(curSize,book);
            dl.setSize(curSize+1);
            System.out.println("添加成功！");
        }


}
