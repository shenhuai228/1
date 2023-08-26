package User;

import com.lr.dormidemo.DormiList;
import operation.IOperation;
public abstract class User {
    public String name;
    public IOperation[] operation;

    public User(String name){
        this.name=name;
    }
    public abstract int menu();

    public void doOperation(int choice,DormiList dl){
        this.operation[choice].work(dl);
    }

}
