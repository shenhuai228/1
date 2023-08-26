package User;
import operation.*;
import java.util.Scanner;
public class Student extends User {

        public Student(String name) {
            super(name);
            this.operation=new IOperation[]{new ExiOperation(),new FinOperationS1(),new AddOperationS2(),
                    new FinOperationS3(),new FinOperationS4()};
        }
        @Override
        public int menu() {
            System.out.println("欢迎" + this.name + "同学进入宿舍系统！");
            Scanner sc = new Scanner(System.in);
            System.out.println("==============");
            System.out.println("1.查看宿舍");
            System.out.println("2.宿舍报修");
            System.out.println("3.显示我的报修");
            System.out.println("4.查看水电费缴纳");
            System.out.println("0.退出系统");
            System.out.println("==============");
            int choice = sc.nextInt();
            return choice;
        }


}
