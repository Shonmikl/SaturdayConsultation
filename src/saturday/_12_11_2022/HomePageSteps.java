//package saturday._12112022;
//
//public class HomePageSteps implements En {
//
//    HomePage homePage;
//
//    public HomePageSteps() {
//        Given("Navigate to Home Page",() -> {
//            homePage = open(baseURL,HomePage.class);
//            homePage.acceptCookies();
//        });
//
//        Then("Home Page displayed",() -> {
//            homePage.validMyAccount().shouldHave(text("Onita Onitovna"));
//        });
//
//        When("Click on Main Konto icon",() -> {
//            homePage.clickOnMyAccountIcon();
//        });
//    }
//}
