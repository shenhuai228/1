package com.lr.dormidemo;
import User.Administrator;
import User.Student;
import User.User;
import com.lr.dormidemo.DormiList;
import java.util.Scanner;

public class Main {
        public static User login() {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请确认您的身份：1 > 管理员  0 > 学生");
            int choice = sc.nextInt();
            if(choice == 1){
                return new Administrator(name);
            }else{
                return new Student(name);
            }
        }
        public static void main(String[] args) {
            DormiList dl = new DormiList();
            //登录
            User user = login();
            //选择菜单
            while(true){
                int choice = user.menu();
                user.doOperation(choice,dl);
            }

        }


}
