package com.ecovacs.test;

import com.ecovacs.test.common.Common;
import com.ecovacs.test.common.PropertyData;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by ecosqa on 17/2/7.
 * test translate of intl app
 */
public class TestIntlTranslate_Spanish {
    private AndroidDriver driver = null;

    @BeforeClass
    public void setUp(){
        driver = Common.getInstance().getDriver();
        if(driver == null){
            return;
        }
        HandleIntl.getInstance().init(driver);
        HandleIntl.getInstance().translate_init("es-ES", "Spanish");
        //HandleIntl.getInstance().translateErrorReport_init();
    }

    @AfterClass
    public void tearDown(){
        HandleIntl.getInstance().changeLanguage(PropertyData.getProperty("French"));
        driver.quit();
    }

    @Test
    public void translateWelcome(){
        Assert.assertTrue(HandleIntl.getInstance().translateWelcome());
    }

    @Test
    public void translateLogin(){
        Assert.assertTrue(HandleIntl.getInstance().translateLogin());
    }

    @Test
    public void translateCountryRegion(){
        Assert.assertTrue(HandleIntl.getInstance().translateCountryRegion());
    }

    @Test
    public void translateForget(){
        Assert.assertTrue(HandleIntl.getInstance().translateForget());
    }

    @Test
    public void translateRegister(){
        Assert.assertTrue(HandleIntl.getInstance().translateRegister());
    }

    @Test
    public void translateMain(){
        Assert.assertTrue(HandleIntl.getInstance().translateMain());
    }

    @Test
    public void translateSelectDEEBOT(){
        Assert.assertTrue(HandleIntl.getInstance().translateSelectDEEBOT());
    }

    @Test
    public void translateNetworkSetting(){
        Assert.assertTrue(HandleIntl.getInstance().translateNetworkSetting());
    }

    @Test
    public void translateConnectGuide1(){
        Assert.assertTrue(HandleIntl.getInstance().translateConnectGuide1());
    }

    @Test
    public void translateConnectGuide2(){
        Assert.assertTrue(HandleIntl.getInstance().translateConnectGuide2());
    }

    @Test
    public void translateNetworkSettingActivity_ing(){
        Assert.assertTrue(HandleIntl.getInstance().translateNetworkSettingActivity_ing());
    }

    @Test
    public void translateFailNetworkSetting(){
        Assert.assertTrue(HandleIntl.getInstance().translateFailNetworkSetting());
    }

    @Test
    public void translateMore(){
        Assert.assertTrue(HandleIntl.getInstance().translateMore());
    }

    @Test
    public void translateChangePass(){
        Assert.assertTrue(HandleIntl.getInstance().translateChangePass());
    }

    @Test
    public void translateAbout(){
        Assert.assertTrue(HandleIntl.getInstance().translateAbout());
    }

    @Test
    public void translateUserAgree(){
        Assert.assertTrue(HandleIntl.getInstance().translateUserAgree());
    }

    @Test
    public void translateLanguage(){
        Assert.assertTrue(HandleIntl.getInstance().translateLanguage());
    }

    @Test
    public void translateHelpCenter(){
        Assert.assertTrue(HandleIntl.getInstance().translateHelpCenter());
    }

    @Test
    public void translateUnibotClean(){
        Assert.assertTrue(HandleIntl.getInstance().translateUnibotClean());
    }

    @Test
    public void translateUnibotSetting(){
        Assert.assertTrue(HandleIntl.getInstance().translateUnibotSetting());
    }

    @Test
    public void translateWorkLog(){
        Assert.assertTrue(HandleIntl.getInstance().translateWorkLog());
    }

    @Test
    public void translateContinueClean(){
        Assert.assertTrue(HandleIntl.getInstance().translateContinueClean());
    }

    @Test
    public void translateContinueClean_Status(){
        Assert.assertTrue(HandleIntl.getInstance().translateContinueClean_Status());
    }

    @Test
    public void translateContinueClean_SameTime(){
        Assert.assertTrue(HandleIntl.getInstance().translateSameContinueTime());
    }

    @Test
    public void translateNoTimeSchedule(){
        Assert.assertTrue(HandleIntl.getInstance().translateNoTimeSchedule());
    }

    @Test
    public void translateNewSchedule(){
        Assert.assertTrue(HandleIntl.getInstance().translateNewSchedule());
    }

    @Test
    public void translateRepetition(){
        Assert.assertTrue(HandleIntl.getInstance().translateRepetition());
    }

    @Test
    public void translateSelectWeekOfDate(){
        Assert.assertTrue(HandleIntl.getInstance().translateSelectWeekOfDate());
    }

    @Test
    public void translateSelectWeekend(){
        Assert.assertTrue(HandleIntl.getInstance().translateSelectWeekend());
    }

    @Test
    public void translateSelectWorkday(){
        Assert.assertTrue(HandleIntl.getInstance().translateSelectWorkday());
    }

    @Test
    public void translateSelectEveryday(){
        Assert.assertTrue(HandleIntl.getInstance().translateSelectEveryday());
    }

    @Test
    public void translateConsumable(){
        Assert.assertTrue(HandleIntl.getInstance().translateConsumable());
    }
    //
    @Test
    public void translateRename(){
        Assert.assertTrue(HandleIntl.getInstance().translateRename());
    }

    @Test
    public void translateFirmwareVer(){
        Assert.assertTrue(HandleIntl.getInstance().translateFirmVer());
    }

    @Test
    public void translateAddTimeSchedule_sun(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_sun());
    }

    @Test
    public void translateAddTimeSchedule_mon(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_mon());
    }

    @Test
    public void translateAddTimeSchedule_tues(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_tues());
    }

    @Test
    public void translateAddTimeSchedule_wed(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_wed());
    }

    @Test
    public void translateAddTimeSchedule_thurs(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_thurs());
    }

    @Test
    public void translateAddTimeSchedule_fri(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_fri());
    }

    @Test
    public void translateAddTimeSchedule_sat(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_sat());
    }

    @Test
    public void translateAddTimeSchedule_weekends(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_weekends());
    }

    @Test
    public void translateAddTimeSchedule_workday(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_workday());
    }

    @Test
    public void translateAddTimeSchedule_everyday(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_everyday());
    }

    @Test
    public void translateAddTimeSchedule_repeat(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_repeat());
    }

    @Test
    public void translateAddTimeSchedule_never(){
        Assert.assertTrue(HandleIntl.getInstance().translateAddTimeSchedule_never());
    }

    @Test
    public void translateDelSchedule_Edit(){
        Assert.assertTrue(HandleIntl.getInstance().translateDelSchedule_edit());
    }

    @Test
    public void translateDelSchedule_Swipe(){
        Assert.assertTrue(HandleIntl.getInstance().translateDelSchedule_swipe());
    }
    @Test
    public void translateOverTimeSchedule(){
        Assert.assertTrue(HandleIntl.getInstance().translateOverTimeSchedule());
    }

}
