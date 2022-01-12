Проект **_alfaform-api-autotests_** - коробка для тестирования API с помощью технологии REST_ASSURED

[REST ASSURED официальный сайт](https://rest-assured.io/ "Официальный сайт REST ASSURED")

**Подготовка:**
* install jdk11

**Переменные при запуске:**

* rp.endpoint - ссылка на report portal
* rp.uuid - уникальный uuid пользователя в report portal
* rp.launch - название прогона в report portal
* rp.project - название проекта в report portal
* rp.enable - включена ли функция отправки отчета в report portal 
* rp.tags - теги, которые будут запускаться

**Структура:**

класс _apiData.Endpoints_ - класс в котором лежат все ссылки и все, что связано с тестовыми путями

_test.java_ - Папка для тестов

_test.resources_ - папка для json схемам, по которым идет сравнение с ответом

В файле _src.main.resources.reportportal.properties_ указываются параметры для report portal

**Ключевые слова:**

После ключевого слова _**given**_ идут преднастройки запроса, 

после ключевого слова _**when**_ идут параметры самого запроса, 

после ключевого слова _**then**_ идут проверка результата.

**Локальный запуск:**

_./gradlew clean test_