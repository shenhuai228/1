package operation;
import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;
import com.lr.dormidemo.Repair;

import java.util.Scanner;
import java.util.Date;

public class AddOperationS2 implements IOperation {
    public void work(DormiList dl) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要报修的学生名字：");
        String name = sc.next();
        Dormi dormi1=new Dormi(null,0,null,0,null,null);
        for (int i = 0; i < dl.getSize(); i++) {
            Dormi dormi = dl.getDormi(i);
            if(dormi.getStuName().equals(name)){
                dormi1=dormi;
                break;
            }
        }

        System.out.println("添加报修信息");
        System.out.println("请输入报修类型：");
        String reType = sc.next();
        System.out.println("请输入校区：");
        String reCampus  = sc.next();
        System.out.println("请输入报修地点：");
        String rePlace = sc.next();
        System.out.println("请输入联系电话：");
        String rePhone = sc.next();
        System.out.println("请预约报修时间：");
        String reDate = sc.next();

        dormi1.getRepair().setReId();
        dormi1.getRepair().setReType(reType);
        dormi1.getRepair().setReCampus(reCampus);
        dormi1.getRepair().setRePlace(rePlace);
        dormi1.getRepair().setRePhone(rePhone);
        dormi1.getRepair().setReDate(reDate);



        System.out.println("添加成功！");
    }
}
