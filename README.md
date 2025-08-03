# Janitri-Assignment

# 🧪 Janitri Dashboard QA Test Report

## 📌 Project Overview

This repository contains the **manual test cases, bug reports, automation test scripts, and execution summary** for the **Janitri Dashboard** – focusing on login, dashboard UI, and core functionalities across web and mobile views.

- **Project Under Test:** https://dev-dash.janitri.in/
- **Tested By:** Mohammad Adnan
- **Testing Type:** Manual Testing & Automation Testing
- **Test Cycle Date:** August 3, 2025

---

## 📂 Repository Structure

📁 Janitri-Dashboard-QA
├── README.md
├── test-cases/
│ └── Janitri_TestCases.xlsx
├── bug-reports/
│ └── Janitri_BugReports.xlsx
├── summary-report/
│ └── Janitri_TestExecutionSummary.pdf
├── automation/
│ ├── pom.xml
│ ├── testng.xml
│ ├── /base/
│ │ └── BaseTest.java
│ ├── /pages/
│ │ └── LoginPage.java
│ └── /tests/
│ └── LoginTests.java

markdown
Copy
Edit

---

## ✅ Test Case Coverage

- **Total Manual Test Cases:** 23
- **Modules Covered:** 
  - Login Page
  - Dashboard View
  - Forgot Password Flow
- **Test Types:**
  - Functional Testing
  - UI & UX Testing
  - Boundary Testing
  - Usability & Compatibility
  - Performance Testing

---

## 🐞 Bugs Identified

| Bug ID  | Title                                                 | Severity | Priority |
|---------|-------------------------------------------------------|----------|----------|
| BUG-001 | ID field accepts more than 255 characters             | Medium   | Medium   |
| BUG-002 | Login page takes more than 3 seconds to load          | High     | High     |
| BUG-003 | Dashboard layout breaks in mobile view                | Medium   | Medium   |
| BUG-004 | Special characters allowed in ID field                | Medium   | Medium   |
| BUG-005 | “Forgot Password” link not visible                    | High     | High     |
| BUG-006 | ID field not visually highlighted on hover            | Medium   | Medium   |
| BUG-007 | Error message persists after editing credentials      | High     | High     |

---

## 📊 Summary of Results

- ✅ **Passed Test Cases:** 16  
- ❌ **Failed Test Cases:** 7  
- 📌 **High Priority Cases Tested:** 100%  
- 🧪 **Bugs Logged:** 7 Open Issues  

---

## ⚙️ Test Environment

- **OS:** Windows 10
- **Browser:** Chrome v114
- **Network:** 100 Mbps Broadband
- **Device:** Laptop/Desktop, Mobile Responsive View via DevTools

---

## 🔧 About Test Automation

Automation scripts are implemented for the **Login Page UI functionality** using:

janitri-login-automation/
├── pom.xml
├── testng.xml
├── src/
│   ├── main/java/pages/LoginPage.java
│   └── test/java/
│       ├── base/BaseTest.java
│       └── tests/LoginTests.java


- **Language:** Java  
- **Testing Framework:** TestNG  
- **Automation Tool:** Selenium WebDriver  
- **Design Pattern:** Page Object Model (POM)  
- **Build Tool:** Maven  
- **Reports:** ExtentReports (optional setup supported)

### 💡 Features of the Automation Framework:
- Reusable **BaseTest** setup for WebDriver configuration  
- **Page classes** for structured locators and actions (e.g., `LoginPage.java`)  
- **Test classes** mapped to business scenarios (e.g., `LoginTests.java`)  
- Supports **test data externalization** via properties or CSV (optional extension)  
- Easily extendable to other pages like Dashboard, Forgot Password, etc.
