package com.easy_cal_test_cases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.easycal_pages.pnr_status_page;
import uti.excel2;
import com.easycal_pages.Base_class_pnr;
public class pdemo2 extends Base_class_pnr {
	

	    @Test
	    public void pnrApp() throws Exception {
	        excel2 excel = new excel2();
	        String cellData = excel.getStringData("Sheet1", 0, 0);
	        pnr_status_page p = PageFactory.initElements(driver, pnr_status_page.class);
	        p.pnrmethod(cellData);
	        Thread.sleep(10000);
	    }
	}
