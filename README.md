# 🧪 **FrameworkForge – Hybrid Automation Testing Framework**

> A complete hybrid automation test framework built using Selenium WebDriver, TestNG, ExtendReports, Excel-based Data-Driven Testing (DDT), and logging capabilities. Designed to be portfolio-ready and scalable for real-world QA automation. ([GitHub][1])

---

## 📌 Project Overview

**FrameworkForge** is a hybrid automation test framework designed to automate web application testing using Java and Selenium WebDriver. It integrates:

* **Hybrid approach** combining data-driven and modular design
* **TestNG** for flexible test execution and grouping
* **ExtendReports** for rich HTML reporting
* **Excel-based Data-Driven Testing (DDT)**
* **Logger support** for execution traceability
* Screenshot capture and logs on failures

This framework is suitable to demonstrate automation skills in interviews and real QA tasks. ([GitHub][1])

---

## 🚀 Tech Stack

| Category           | Technology                     |
| ------------------ | ------------------------------ |
| Language           | Java                           |
| Automation         | Selenium WebDriver             |
| Test Runner        | TestNG                         |
| Reporting          | ExtendReports                  |
| Logging            | Logger (Log4j or Java Logging) |
| Build & Dependency | Maven                          |
| Data               | Excel (DDT)                    |

---

## 📁 Repository Structure

```
FrameworkForge/
├── src/test/java/          # Test implementation classes & utilities
├── src/test/resources/     # Test data files (Excel), config files
├── test-data/              # Excel data sheets for data-driven tests
├── reports/                # Generated test execution reports
├── screenshots/            # Screenshots captured on failure
├── logs/                   # Execution logs
├── pom.xml                 # Maven configuration
├── Jenkinsfile             # CI/CD pipeline config (optional)
├── testNG.xml              # TestNG execution configuration
└── README.md               # Project documentation
```

---

## ⚙️ Setup & Prerequisites

1. Install **JDK 11+**
2. Install **Maven** and verify with `mvn -v`
3. Add browser drivers (ChromeDriver/GeckoDriver) to `drivers/` or system PATH
4. Update Excel test data files under `test-data/`

Clone the project:

```bash
git clone https://github.com/MK-MAN0JKUMAR/rahulshetty_updated.git
cd rahulshetty_updated
```

---

## 🧪 How to Execute Tests

Execute all tests via Maven:

```bash
mvn clean test
```

Or execute using the TestNG suite file:

```bash
mvn test -DsuiteXmlFile=testNG.xml
```

Reports will be generated under the `reports/` folder, and screenshots/logs will be available for analysis.

---

## 📊 Key Features

### 📌 Hybrid Test Strategy

* Combines modular scripts with **data-driven testing**
* Read input data from Excel sheets
* Flexible data mapping for multiple test iterations

### 🧩 Test Execution with TestNG

* Group and manage test execution (smoke, regression, sanity)
* Parallel execution to speed up test runs

### 📈 ExtendReports

* Clear, professional test reporting
* Screenshots on failure embedded in HTML reports

### 🪵 Logging & Debugging

* Logs capture execution flows and issues
* Logs make root-cause faster to investigate

---

## Author
* Manoj Kumar | SDET-I | Automation Engineer | Selenium WebDriver, Java, Playwright, Javascript |

