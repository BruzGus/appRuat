package activity;

import controles.Button;
import org.openqa.selenium.By;

public class MainRuat {
    public Button deudaVehiculos;
    public Button menuMain;
    public Button buttonDeuda;

    public MainRuat(){
        this.deudaVehiculos = new Button(By.xpath("//android.view.View[2]/android.view.View[@text='arrow forward Deuda Vehículos']"));
        this.menuMain = new Button(By.xpath("//android.widget.Button[@text='menu']"));
        this.buttonDeuda = new Button(By.xpath("//android.view.View[2]/android.view.View/android.view.View[@text='Consulta Deuda']"));

    }

}
