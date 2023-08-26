package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;

public class DisOperation implements IOperation{
       // @Override
        public void work(DormiList dl) {
            System.out.println("显示学生宿舍");
            for (int i = 0; i < dl.getSize(); i++) {
                Dormi dormi = dl.getDormi(i);
                System.out.println(dormi);
            }
        }


}
