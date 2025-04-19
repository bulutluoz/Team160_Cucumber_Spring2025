
  Feature: US1003 kullanici istedigi urunu dogru olarak aratabilmeli
    @wip
    Scenario: TC06 kullanici aradigi urunun dogru olarak arandigini kontrol edebilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna "phone" yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      Then ilk urunu tiklar
      And ilk urun isminde case sensitive olmadan "phone" bulundugu test eder
      And sayfayi kapatir