Feature: Начальный тест для изучения Cucumber

  Scenario: Простой тест без тела
    Given открыт браузер

  Scenario: Простой тест c Given и When
    Given открыт браузер
  When страница логина открыта

  Scenario: Простой тест cо всеми ключевыми словами
    Given открыт браузер
    When страница логина открыта
    Then поле username отображается

  Scenario: Использование AND
    Given открыт браузер
    When страница логина открыта
    Then поле username отображается
    And поле password отображается

  Scenario: Использование But
    Given открыт браузер
    When страница логина открыта
    Then поле username отображается
    But поле password не отображается

  Scenario: Использование But
    Given открыт браузер
    * страница логина открыта
    * поле username отображается
    * поле password не отображается