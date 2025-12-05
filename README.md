
# 🧪 Selenium WebDriver Automation Framework


![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.0-green)
![Selenium](https://img.shields.io/badge/Selenium-4.15.0-orange)
![Eclipse](https://img.shields.io/badge/Eclipse-IDE-purple)


---
Ce projet est un framework d’automatisation de tests basé sur :

- **Selenium WebDriver**
- **Cucumber (BDD)**
- **JUnit 5**
- **Page Object Model (POM)**
- **Factory Pattern**
- **Allure Report** (Rapports avancés)
-----

# 🚀 Features

- Exécution cross-browser (Chrome, Firefox, Edge)
- Scénarios lisibles en Gherkin
- Pages structurées en POM
- Gestion centralisée du WebDriver via Factory Pattern
- Rapports détaillés avec Allure (screenshots, logs, steps)
- Architecture claire et scalable
---

## 🏗️ Project Structure

```

selenium-cucumber-junit-pom-factory
│── src
│   ├── main
│   │   └── java
│   │       ├── factory
│   │       │   └── BrowserFactory.java      # Factory Pattern for WebDriver
│   │       └── pages
│   │           └── LoginPage.java           # Example Page Object
│   │
│   └── test
│       └── java
│           ├── stepDefinitions
│           │   └── LoginSteps.java          # Cucumber step definitions
│           └── runners
│               └── TestRunner.java          # JUnit test runner
│
│── src/test/resources
│   ├── features
│   │   └── login.feature                    # Example Gherkin feature
│   └── config.properties                    # Config file (browser, baseUrl, etc.)
│
│── pom.xml                                  # Maven dependencies
│── README.md

````
----
# 📊 Allure Report Integration

Ce framework inclut **Allure Report** pour générer des rapports professionnels :

- Graphiques interactifs  
- Timeline d’exécution  
- Screenshots automatiques en cas d’échec  
- Détails par step Gherkin  
- Attachments & logs  

---

# 📦 Installation — Ajouter Allure dans `pom.xml`

```xml
<!-- Allure Cucumber JVM -->
<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-cucumber7-jvm</artifactId>
    <version>2.24.0</version>
</dependency>

<!-- Allure JUnit 5 -->
<dependency>
    <groupId>io.qameta.allure</groupId>
    <artifactId>allure-junit5</artifactId>
    <version>2.24.0</version>
</dependency>
---

## 🏃 Test Runner

```java
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/spec/features"},
    plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
    //glue = {"/selenium-cucumber/src/test/java/com/automation/e2eTests/stepDefinitions"},
    tags = ("@loginOutline"),
    monochrome = true,
    snippets = CAMELCASE
)
public class RunWebSuiteTest {
}
---------------------
----
## 🧩 Hooks – Screenshot automatique (Allure)

```java
package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import factory.BrowserFactory;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = BrowserFactory.getDriver(System.getProperty("browser", "chrome"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot Failure");
        }
        driver.quit();
    }
}

---
--------------------
## ▶️ Running Tests

Run all tests with default browser (Chrome):

```bash
mvn test
```
------------
##  📊 Génération du rapport Allure

 Générer le rapport :
```bash
allure generate target/allure-results -o target/allure-report --clean
```
Ouvrir le rapport Allure :
```bash
allure open target/allure-report

```

## 📜 License

This project is licensed under the MIT License.

 ------

👩‍💻 Auteur Rahma Louati |Software QA Engineer – Test manuel & automatisé|

```
```
