package org.driverhq.automation;

import org.drivrhq.drivr.runnr.TestProvider;
import org.drivrhq.drivr.web.browser.BrowserFactory;
import org.drivrhq.drivr.web.browser.enums.BrowserType;
import org.drivrhq.drivr.web.browser.enums.DriverRunType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

/**
 * (C) Copyright 2017 Dominic Pace (https://github.com/Dominic-Pace)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
public class ExampleBaseTest extends TestProvider {

    protected WebDriver driver;

    /**
     * Method used to initialize the browser before the test.
     */
    @BeforeTest
    public void initBrowserBeforeTest() {
        BrowserFactory browserFactory = new BrowserFactory(BrowserType.CHROME);
        driver = browserFactory.getBrowserInstance(DriverRunType.DIRECT);
    }
}
