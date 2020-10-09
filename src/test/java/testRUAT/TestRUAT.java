package testRUAT;

import activity.DebtConsultationRuat;
import activity.DebtDataRuat;
import activity.MainRuat;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import session.Session;

import java.net.MalformedURLException;

public class TestRUAT {

    MainRuat mainRuat = new MainRuat();
    DebtConsultationRuat consulta = new DebtConsultationRuat();
    DebtDataRuat debtData = new DebtDataRuat();

    @Test
    public void testPolizaBetweenControlBoard() throws MalformedURLException {
        // Arrange
        String controlBoard="[NUMERO DE PLACA]";
        String expectedResult = "[NUMERO DE POLIZA]";

        // Act
        mainRuat.menuMain.click();
        mainRuat.buttonDeuda.click();
        consulta.placaPTA.type(controlBoard);
        consulta.sendConsult.click();
        String actualResult=debtData.polizaView.getText();

        // Assertion
        Assert.assertEquals("",expectedResult,actualResult);

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }


}
