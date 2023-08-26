package operation;

import com.lr.dormidemo.Dormi;
import com.lr.dormidemo.DormiList;
public class ExiOperation implements IOperation{
        //@Override
        public void work(DormiList dl) {
            System.out.println("退出系统");
            System.exit(1);
        }


}
