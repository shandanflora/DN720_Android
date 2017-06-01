package com.ecovacs.test.activity;

import com.ecovacs.test.common.TranslateErrorReport;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by ecosqa on 17/2/9.
 *
 */
public class LanguageActivity {
    private static LanguageActivity languageActivity = null;
    private AndroidDriver androidDriver = null;
    private static Logger logger = LoggerFactory.getLogger(LanguageActivity.class);

    @FindBy(id = "com.ecovacs.ecosphere.intl:id/tv_zhongJian")
    private MobileElement title = null;
    @AndroidFindBy(id = "com.ecovacs.ecosphere.intl:id/tv_youBian")
    private AndroidElement btnOK = null;
    @FindBy(id = "com.ecovacs.ecosphere.intl:id/rll_bark")
    private MobileElement back = null;

    private LanguageActivity(){

    }

    public static LanguageActivity getInstance(){
        if(languageActivity == null){
            languageActivity = new LanguageActivity();
        }
        return languageActivity;
    }

    public void init(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.androidDriver = driver;
    }

    public void clickBack(){
        back.click();
    }

    public boolean selectLanguage(String strLanguage){

        String str = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(";
        str = str + "\"" + strLanguage + "\"" + ").instance(0))";
        MobileElement textViewCountry;
        try {
            textViewCountry = (MobileElement) androidDriver
                    .findElementByAndroidUIAutomator(str);
        }catch (NoSuchElementException e){
            logger.error("Can not find language: " + strLanguage);
            return false;
        }
        textViewCountry.click();
        btnOK.click();
        logger.info("Selected Language - " + strLanguage);
        return true;
    }

    public boolean staticUITranslation(Map<String, String> tranMap){
        boolean bTitle = title.getText().equalsIgnoreCase(tranMap.get("multi_lingual_a"));
        if (!bTitle){
            TranslateErrorReport.getInstance().insetNewLine(
                    tranMap.get("language"), "Language", title.getText(),
                    tranMap.get("multi_lingual_a"), "fail");
        }
        return bTitle;
    }
}
