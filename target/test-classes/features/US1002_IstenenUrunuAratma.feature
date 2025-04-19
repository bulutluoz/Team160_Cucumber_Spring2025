
  Feature: US1002 kullanici testotomasyonunda istedigi kelimeyi aratir


    Scenario: TC04 kullanici furniture aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "samsung" yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

    @smoke @kullaniciE2E @regression @system
    Scenario: TC05 kullanici furniture aratabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "apple" yazip aratir
      And senkronizasyon icin 3 saniye bekler
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir