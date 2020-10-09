package activity;

import controles.Button;
import controles.TextBox;
import org.openqa.selenium.By;

public class DebtConsultationRuat {
    public TextBox placaPTA;
    public Button sendConsult;

    public DebtConsultationRuat(){
        this.placaPTA= new TextBox(By.xpath("//android.view.View/android.widget.EditText"));
        this.sendConsult = new Button(By.xpath("//android.widget.Button[@text='close send']"));
    }


}
