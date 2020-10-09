package activity;

import controles.View;
import org.openqa.selenium.By;

public class DebtDataRuat {

    public View polizaView;

    public DebtDataRuat(){
        this.polizaView = new View(By.xpath("//android.view.View[7]"));
    }
}
