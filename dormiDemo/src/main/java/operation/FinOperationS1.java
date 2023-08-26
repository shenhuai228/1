package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;
import java.util.Scanner;
public class FinOperationS1 implements IOperation{
        //@Override
        public void work(DormiList dl) {
            System.out.println("查找宿舍");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要查找的学生名字：");
            String name = sc.next();
            for (int i = 0; i < dl.getSize(); i++) {
                Dormi dormi = dl.getDormi(i);
                if(dormi.getStuName().equals(name)){
                    System.out.println("该学生的宿舍号和床位分别是");
                    System.out.println(dormi);
                    return;
                }
            }
            System.out.println("该学生未分派床位");
        }
}


