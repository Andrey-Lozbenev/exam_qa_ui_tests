# Проект автоматизации UI тестирования для <a target="_blank" href="https://cloudmaster.ru/">Cloudmaster</a>

## :open_book: Содержание:
- [Технологии и инструменты](#gear-в-проекте-используются-следующие-технологии-и-инструменты)
- [Что проверяем](#heavy_check_mark-что-проверяем)
- [Запуск тестов из Jenkins](#-запуск-тестов-из-jenkins)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Отчеты](#bar_chart-отчеты-о-прохождении-тестов-доступны-в-allure)
- - [Allure](#-allure)


## :gear: В проекте используются следующие технологии и инструменты:

<p align="center">
<img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/>
<img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/>
<img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/>
<img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="media/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="media/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="media/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
</p>

## :heavy_check_mark: Что проверяем

> - Открывается нужный блог при клике на новость из списка 
> - При нажатии на кнопку 'Загрузить еще' подгружаются еще новости 
> - При переходе во вкладку Блог есть запись `Блог Cloudmaster` 
> - На странице Coster отображается форма обратной связи 
> - При клике на Coster идет переброс на страницу, на которой есть текст 'FinOps-решение для бюджетирования, контроля и оптимизации расходов'
> - При вводе некорректных значений для полей email и телефон выводится нужный текст ошибки Введите валидный email
## <img width="4%" title="Jenkins" src="media/logo/Jenkins.svg"> Запуск тестов из [Jenkins](https://jenkins.autotests.cloud/job/Students/job/exam_qa_ui_tests/)

Для запуска тестов из Jenkins:
1. Необходимо нажать кнопку "Собрать".
   <img src="media/img/JApi.PNG" alt="Jenkins"/>
2. Нажать кнопку "Собрать".

# Запуск тестов
Для запуска тестов на Selenoid использовать команду ниже:
```shell
gradle test -Denv=remote
```

Для запуска тестов локально использовать команду ниже:
```shell
gradle test -Denv=local
```

## :bar_chart: Отчеты о прохождении тестов доступны в Allure

### <img width="3%" title="Allure" src="media/logo/Allure_Report.svg"> [Allure](https://jenkins.autotests.cloud/job/exam_qa_ui_tests/8/allure/)

#### Главная страница

<img src="media/img/JAllurresult.PNG" alt="Allure"/>

#### Тесты

<img src="media/img/JAllureSuites.png" alt="Allure"/>

## <a id="telegram"><img src="media/logo/Telegram.svg" width="50" height="50" ></a> Отчёт в Telegram

После завершения сборки сообщение с основными результатами прогона тестов отправляется через созданный бот в выбранный телеграм-канал
<p align="center">
<img src="media/img/Telegram.png">

## <img src="media/logo/Allure_TO.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3415/dashboards">Allure TestOps</a>

### Dashboard с  результатами тестирования
<p align="center">
<img title="Allure Graphics" src="media/img/AllureDashboard.png">
</p>

### Пример отчёта выполнения одного из автотестов
<p align="center">
<img title="Allure Graphics" src="media/img/AllureTest.png">
</p>

## <img src="media/logo/Jira.svg" width="25" height="25"  alt="Allure"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-759">Atlassian Jira</a>
<p align="center">
<img title="Jira" src="media/img/Jira.png">
</p>


### <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/logo/Selenoid.svg"> Видео примера запуска тестов в Selenoid

К каждому тесту в отчете прилагается видео прогона.
<p align="center">
  <img title="Selenoid Video" src="media/gif/MovieTests.gif">
</p>
