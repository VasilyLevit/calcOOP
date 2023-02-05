package version2;

import version2.Model.I_Model;
import version2.View.GetValue;

public class Presenter {
    GetValue view;
    I_Model model;

    public Presenter(I_Model m, GetValue v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "результат операции: ");
    }
}
