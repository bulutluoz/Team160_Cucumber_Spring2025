
  Feature: US1001 Testotomasyonu arama

    Scenario: TC01 Kullanici testotomasyonu sayfasinda phone aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC02 Kullanici testotomasyonu sayfasinda dress aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna dress yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir


    Scenario: TC03 Kullanici testotomasyonu sayfasinda baby aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna baby yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir



