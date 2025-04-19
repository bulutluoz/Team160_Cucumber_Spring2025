package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestotomasyonuStepdefinition {

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get("https://www.testotomasyonu.com");
    }

    @When("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {

        String actualAramaSonucu = testotomasyonuPage
                                            .aramaSonucYaziElementi
                                            .getText();
        String unExpectedSonucYazisi = ConfigReader.getProperty("toBulunamadiYazisi");

        Assertions.assertNotEquals(unExpectedSonucYazisi,actualAramaSonucu);
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }


    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {

        testotomasyonuPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna baby yazip aratir")
    public void aramaKutusunaBabyYazipAratir() {
        testotomasyonuPage.aramaKutusu.sendKeys("baby" + Keys.ENTER);

    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aranacakKelime) {
        testotomasyonuPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);

    }

    @And("senkronizasyon icin {int} saniye bekler")
    public void senkronizasyonIcinSaniyeBekler(int beklenecekSaniye) {

        try {
            Thread.sleep(beklenecekSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
