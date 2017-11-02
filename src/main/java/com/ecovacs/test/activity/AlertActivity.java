package com.ecovacs.test.activity;

import com.ecovacs.test.common.Common;
import com.ecovacs.test.common.TranslateErrorReport;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by ecosqa on 17/4/28.
 * alert activity
 */
public class AlertActivity {
    private static AlertActivity alertActivity = null;

    @FindBy(id = "com.ecovacs.ecosphere.intl:id/titleContent")
    private MobileElement title = null;
    @FindBy(id = "com.ecovacs.ecosphere.intl:id/title_back")
    private MobileElement back = null;
    @FindBy(id = "com.ecovacs.ecosphere.intl:id/more_text_title")
    private MobileElement textTitle = null;
    @FindBy(id = "com.ecovacs.ecosphere.intl:id/more_text")
    private MobileElement textContent = null;
    @FindBy(id = "com.ecovacs.ecosphere.intl:id/warn_listview")
    private MobileElement listWarn = null;

    private AlertActivity(){

    }

    public static AlertActivity getInsatance(){
        if (alertActivity == null){
            alertActivity = new AlertActivity();
        }
        return alertActivity;
    }

    public void init(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickBack(){
        back.click();
    }

    private boolean translateStaticUI(Map<String, String> tranMap, String strWarnKey, Common.Malfunction malType){
        String strLanguage = tranMap.get("language");
        String strWarnTitle = tranMap.get("random_deebot_warn_text_title");
        if (malType == Common.Malfunction.DEEBOT_SUSPEND){
            strWarnTitle = tranMap.get("random_deebot_warn1_text_title");
        }
        boolean bTitle = title.getText().equalsIgnoreCase(tranMap.get("random_deebot_warn_title"));
        if (!bTitle) {
            TranslateErrorReport.getInstance().insetNewLine(
                    strLanguage, "Alert", title.getText(),
                    tranMap.get("random_deebot_warn_title"), "fail");
        }
        boolean bTextTitle = textTitle.getText().equalsIgnoreCase(strWarnTitle);
        if (!bTextTitle) {
            TranslateErrorReport.getInstance().insetNewLine(
                    strLanguage, "Alert", textTitle.getText(),
                    strWarnTitle, "fail");
        }
        boolean bTextContent = textContent.getText().equalsIgnoreCase(tranMap.get(strWarnKey));
        if (!bTextContent) {
            TranslateErrorReport.getInstance().insetNewLine(
                    strLanguage, "Alert", textContent.getText(),
                    tranMap.get(strWarnKey), "fail");
        }
        return bTitle && bTextTitle && bTextContent;
    }

    public boolean dropAlert(Map<String, String> tranMap){
        boolean bStatic = translateStaticUI(tranMap, "random_deebot_drop_detail", Common.Malfunction.OTHERS);
        clickBack();
        return bStatic;
    }

    public boolean wheelAlert(Map<String, String> tranMap){
        boolean bStatic = translateStaticUI(tranMap, "random_deebot_wheel_detail", Common.Malfunction.OTHERS);
        clickBack();
        return bStatic;
    }

    public boolean mainBrushAlert(Map<String, String> tranMap){
        boolean bStatic = translateStaticUI(tranMap, "random_deebot_mainbrush_detail", Common.Malfunction.OTHERS);
        clickBack();
        return bStatic;
    }

    public boolean sideBrushAlert(Map<String, String> tranMap){
        boolean bStatic = translateStaticUI(tranMap, "random_deebot_sidebrush_detail", Common.Malfunction.OTHERS);
        clickBack();
        return bStatic;
    }

    public boolean dustBinAlert(Map<String, String> tranMap){
        boolean bStatic = translateStaticUI(tranMap, "random_deebot_dust_detail", Common.Malfunction.OTHERS);
        clickBack();
        return bStatic;
    }

    public boolean deebotSuspendAlert(Map<String, String> tranMap){
        boolean bStatic = translateStaticUI(tranMap, "random_deebot_suspend_detail", Common.Malfunction.DEEBOT_SUSPEND);
        clickBack();
        return bStatic;
    }

    public void consumableRemind(Map<String, String> tranMap, List<String> detailList){
        String strLanguage = tranMap.get("language");
        List<MobileElement> list = listWarn.findElementsById("com.ecovacs.ecosphere.intl:id/more_text_title");
        for (MobileElement ele: list){
            System.out.println(ele.getText());
            boolean bRes = ele.getText().equalsIgnoreCase(tranMap.get("random_deebot_remind_text_title"));
            if (!bRes) {
                TranslateErrorReport.getInstance().insetNewLine(
                        strLanguage, "Alert", ele.getText(),
                        tranMap.get("random_deebot_remind_text_title"), "fail");
            }
        }
        List<MobileElement> listDetail = listWarn.findElementsById("com.ecovacs.ecosphere.intl:id/more_text");
        int iSize = detailList.size();
        for (int i = 0; i < iSize; i++){
            System.out.println(listDetail.get(i).getText());
            boolean bRes = listDetail.get(i).getText().equalsIgnoreCase(detailList.get(i));
            if (!bRes) {
                TranslateErrorReport.getInstance().insetNewLine(
                        strLanguage, "Alert", listDetail.get(i).getText(),
                        detailList.get(i), "fail");
            }
        }
        clickBack();
    }


}
