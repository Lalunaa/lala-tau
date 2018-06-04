package com.lala.app.jbhsel;

import org.jbehave.web.selenium.WebDriverProvider;
import com.lala.app.jbhsel.pages.*;

public class Pages {

    private WebDriverProvider driverProvider;

    private Github github;

    public Pages(WebDriverProvider driverProvider) {
        super();
        this.driverProvider = driverProvider;
    }

    public Github github() {
        if (github == null) {
            github = new Github(driverProvider);
        }
        return github;
    }
}
