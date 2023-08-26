package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;
import java.util.Scanner;

public class DelOperationA2 implements IOperation{
        //@Override
        public void work(DormiList dl) {
            System.out.println("删除学生和宿舍信息");
            System.out.println("请输入需要删除的学生名字：");
            Scanner sc = new Scanner(System.in);
            String stuName = sc.nextLine();
            int i = 0;
            for (; i < dl.getSize(); i++) {
                Dormi dormi = dl.getDormi(i);
                if(dormi.getStuName().equals(stuName)){
                    break;
                }
            }
            if(i >= dl.getSize()){
                System.out.println("没有找到此学生");
                return;
            }
            int j = i;
            for(; j < dl.getSize() - 1; j++){
                Dormi book = dl.getDormi(j + 1);
                dl.setDormi(j,book);
            }
            int cueSize = dl.getSize();
            dl.setSize(cueSize-1);
            System.out.println("成功删除学生和宿舍信息！");
        }


}
