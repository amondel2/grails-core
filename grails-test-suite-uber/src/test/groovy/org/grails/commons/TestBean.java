package org.grails.commons;

/**
 * Original author: marc
 */
public class TestBean {
    public static String favouriteFood = "indian";
    static private String welcomeMessage = "hello";
    public String favouriteArtist = "Cardiacs";
    private String userName = "marc";

    public static String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getUserName() {
        return userName;
    }
}
