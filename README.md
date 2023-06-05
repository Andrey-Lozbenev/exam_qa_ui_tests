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
</p>

## :heavy_check_mark: Что проверяем

> - Открывается нужный блог при клике на новость из списка 
> - При нажатии на кнопку 'Загрузить еще' подгружаются еще новости 
> - При переходе во вкладку Блог есть запись `Блог Cloudmaster` 
> - На странице Coster отображается форма обратной связи 
> - При клике на Coster идет переброс на страницу, на которой есть текст 'FinOps-решение для бюджетирования, контроля и оптимизации расходов'
> - При вводе некорректных значений для полей email и телефон выводится нужный текст ошибки Введите валидный email
## <img width="4%" title="Jenkins" src="media/logo/Jenkins.svg"> Запуск тестов из [Jenkins](https://jenkins.autotests.cloud/job/exam_qa_ui_tests/)

Для запуска тестов из Jenkins:
1. Необходимо нажать кнопку "Собрать".
   <img src="media/img/JApi.PNG" alt="Jenkins"/>
2. Нажать кнопку "Собрать".

### :earth_asia: Удаленный запуск тестов

```bash
gradle clean test
```

## :computer: Запуск тестов из терминала

Для локального запуска необходимо выполнить команду:
```
gradle clean test
```

## :bar_chart: Отчеты о прохождении тестов доступны в Allure

### <img width="3%" title="Allure" src="media/logo/Allure_Report.svg"> [Allure](https://jenkins.autotests.cloud/job/exam_qa_api_tests/2/allure/)

#### Главная страница

<img src="media/img/JAllurresult.PNG" alt="Allure"/>

#### Тесты

<img src="media/img/JAllureSuites.png" alt="Allure"/>
