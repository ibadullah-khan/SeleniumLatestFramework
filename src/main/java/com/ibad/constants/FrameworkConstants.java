package com.ibad.constants;

public final class FrameworkConstants {

    private FrameworkConstants(){

    }

    public static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";

    public static String getChromedriverpath(){
        return CHROMEDRIVERPATH;
    }
}
