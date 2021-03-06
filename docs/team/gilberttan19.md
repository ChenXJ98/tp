---
layout: page
title: Gilbert's Project Portfolio Page
---

## Gilbert Tan - Project Portfolio for QuickCache (tP)

### 1.Introduction

This document serves as a project portfolio for QuickCache, and outlines my contributions to the project, including the features that I have implemented.

### 1.1. About the team

My team of five consists of  five Year 2 Computer Science students, all taking the module CS2103T Software Engineering.

### 1.2. About the project

This project was developed as part of the module CS2103T Software Engineering. We were tasked to develop a desktop application (Windows/macOS/Linux) with a Command Line Interface (that is, the program operates via text input from the user, called commands). Additionally, we were required to use an existing application, called AddressBook Level 3, as the starting point for building our application.

My team decided to a create an application that helps students manage their flashcards, test themselves, and view their performance over time. To do so, we incorporated the existing people management features of AddressBook and used it as a starting point to build QuickCache.

In total, QuickCache took a total of 10 weeks to complete.

<div style="page-break-after: always;"></div>

### 2. Summary of Contributions

I am in charge of code quality in the team, and I am responsible for creating features such as adding flashcard with both open ended and multiple choice question, editing the flashcard and deleting the flashcard.

Given below are my contributions to the project in greater detail with the documentation for the features that I have already written in developer guide and user guide.

#### 2.1. Enhancements and new features added
The following describes the feature and enhancement I have already done in the project.

#### 2.1.1 Added the ability to add a flashcard with both open ended question and multiple choice question
  * What it does: This command allows the user to add flashcard one at a time. The flashcard can contains either open ended question or multiple choice question.
  * Justification: This feature is the a core function in the application and most of the feature depend on the creation of the flashcard.
  * Highlights: The implementation of this enhancement follow closely the OOP principle and use the polymorphism concept in OOP.

#### 2.1.2 Added the ability to edit a flashcard.
  * What it does: This command allows the user to edit flashcard one at a time. The flashcard can contains either open ended question or multiple choice question.
  * Justification: This feature is the one of the feature in 1.3 as edit is basically create and delete.
  * Justification: This feature improves the product significantly because a user can make mistakes when creating a flashcard or the user want to update the flashcard and the app should provide a convenient way to rectify them.
  * Highlights: The implementation of this command uses defensive programming as it copy the flashcard before updating the internal state of the flashcard and set the udpated flashcard on the list.

#### 2.1.3 Added the ability to delete a flashcard by index.
  * What it does: This command allows the user to delete flashcard one at a time.
  * Justification: This feature improves the product significantly because as there will be too many flashcards as time goes on and the app should provide a convenient way to delete them.
  * Highlights: This command updates the internal state of the list and update them accordingly to the storage.

### 2.2. Code contributed
 Given below is the link to the code that I have contributed.
 * [RepoSense link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=gilberttan19)
 * [Functional Code](https://github.com/AY2021S1-CS2103T-T13-2/tp/tree/master/src/main/java/quickcache)
 * [Test Code](https://github.com/AY2021S1-CS2103T-T13-2/tp/tree/master/src/test/java/quickcache)

### 2.3. Other contribution

Given below is other contributions that I have made to the project.

* **Project management**:
  * Managed 30 issues on GitHub
  * Helped in checking the code quality

* **Enhancements to existing features**:
  * Wrote additional tests for existing features to increase coverage (Pull requests [\#203](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/203), [\#221](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/221)
  * Morph the Logic and Model of AddressBook to have a UniqueFlashcardList. (Pull requests [\#37](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/37))
  * Refactored remnant code from Person to Flashcard. (Pull requests [\#248](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/248))

* **Documentation**:
  * User Guide:
    * Added the documentation for the features `delete`, `add`, `edit`, and `addmcq` (Pull requests [\#152](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/152). [\#137](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/137))
    * Added the preface for the quick start section. (Pull requests [\#141](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/141))

  * Developer Guide:
    * Added implementation details of the `delete`, `add`, `edit`, abd `addmcq` feature. (Pull requests [\#128](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/128), [\#229](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/229))
* **Community**:
  * PRs reviewed (with non-trivial review comments): (Pull requests [\#115](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/115), [\#85](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/85), [\#227](https://github.com/AY2021S1-CS2103T-T13-2/tp/pull/227))
  * Reported bugs and suggestions for other teams in the class (examples: [1](https://github.com/GilbertTan19/ped/issues/1), [2](https://github.com/GilbertTan19/ped/issues/2), [3](https://github.com/GilbertTan19/ped/issues/3))
