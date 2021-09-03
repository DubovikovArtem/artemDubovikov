package com.hillel.lesson16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckLogin {
    @DataProvider(name = "variables")
    public Object[][] variables() {
        return new Object[][]{
                {"1"},
                {"2"},
                {"3"},
        };
    }

    @Test(dataProvider = "variables",groups = {"group"})
    public void testCheckLogin(String login) throws Exception {
        if(login.equals("2")){
            throw new Exception();
        }
        System.out.println(login);
    }

    @Test(dataProvider = "variables",dependsOnGroups = {"group"})
    public void testCheckLoginDependenceGroup(String login) {
        System.out.println(login);
    }


    @Parameters({"login","password"})
    @Test
    public void testCheckLoginTask3(String login, String password) {
        System.out.println("Login: "+ login);
        System.out.println("Password: "+ password);
    }
}
