package version2;

import version2.Model.ResultModel;
import version2.View.GetValue;

public class Program {
    public static void main(String[] args) {
        Presenter p = new Presenter(new ResultModel(), new GetValue());
        p.buttonClick();
    }
}
