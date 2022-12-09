![Kronos symbol](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/Kronos%20symbol.png)

# KRONOS

## Description

Named after the Titan of Time, ‘Kronos’ is a great tool for planning and managing your schedule. You can efficiently organize tasks and track habits. It also comes with a Pomodoro Timer. 

## Motivation

As students, we have to balance and keep track of various things at the same time. Hence, we decided to create a Time-management system based on our personal experiences and needs.

## Features

* Account Creation and Login 
* Habit Creation and Tracking
* Task and Category Creation
* Pomodoro Timer
* User Habits Visualization

## How to Use

The user needs to have an account on the system to be able to access the features. In case the user has an account, they can log in. 

Logging in leads to the Menu page which has options for the features: Habits, Tasks, Categories, Data Visualization and Timer. The user can then choose any of them and they will be led to the corresponding page. 

## Graphical User Interface

## 1. Feature: User

### a. User Login Screen

![front page](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/front%20page.png)

### b. User SignUp Screen

![sign up](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/sign%20up.png)

### c. Menu Page 

![home page](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/home%20page.png)

## 2. Feature: Habit 

### a. Habit Profile Screen

![habit profile](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/habit%20profile.png)

### b. Habit Creation Screen

![habit creation](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/habit%20creation.png)

### c. Habit Edit Screen

![habit edit](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/habit%20edit.png)

### d. Habit Track Screen

![habit track](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/f6298bc3154f68ab34dcfc386d1396e628936400/images/habit%20track.png)

## 3. & 4. Features: Task and Category

### a. To-Do List Screen

![To Do List View](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/ae6483423688069d61c519ea003976f8c854ddd4/images/To%20Do%20List%20View.png)

### b. Task Creation Screen

![Create Task](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/5ef5229683d19d9b79ba12673ee4f88616824c8e/images/Create%20Task.png)

### c. Task Edit Screen

![Edit Task](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/5ef5229683d19d9b79ba12673ee4f88616824c8e/images/Edit%20Task.png)

### d. Category Creation Screen

![Create Category](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/ae6483423688069d61c519ea003976f8c854ddd4/images/Create%20Category.png)

### e. Category Edit Screen

![Edit Category](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/ae6483423688069d61c519ea003976f8c854ddd4/images/Edit%20Category.png)

## 5. Feature: Tomato Timer

### a. Timer Start Screen

![timer](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/a13b4e3986e803484789f8d7ad0dbd99072cf8ae/images/timer.jpeg)

### b. Set Timer

![Set Timer](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/8639dab8f29bd8c686a6fd0298d1a77ab95a3121/images/Set%20Timer.png)

### c. Start Timer

![Start Timer](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/8639dab8f29bd8c686a6fd0298d1a77ab95a3121/images/Start%20Timer.png)

### d.Rest Timer Running Screen

![Rest Timer Running](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/8639dab8f29bd8c686a6fd0298d1a77ab95a3121/images/Rest%20Timer%20Running.png)


## 6. Feature: Data Visualization

### a. Weekly Visualization Screen

![daily](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/740abe32407bed3bce523c3c3f6c5bfae8baf3bb/images/daily.png)

### b. Monthly Visualization Screen

![month](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/740abe32407bed3bce523c3c3f6c5bfae8baf3bb/images/month.png)

### c. Yearly Visualization Screen

![year](https://github.com/CSC207-2022F-UofT/course-project-kronos/blob/740abe32407bed3bce523c3c3f6c5bfae8baf3bb/images/year.png)

## Design Pattern

The design patterns implemented in the project are:

### Façade 
- The use cases are implemented using the Façade design pattern. 

### Private Data Class
- The entities are implementing using the Private Data Class design pattern. This is to reduce coupling and limit user access to the core of the system.

## SOLID Principles

We ensured that the project followed all the SOLID principles. 

### Single Responsibility Principle (SRP) 
 - Each use case is specifically responsible for one function, ensuring the Single Responsibility Principle. We are 

### Open - Closed Principle 
  - We used interfaces in the use cases which are open to extension but not modification. 
  
### Liskov Subsitution Principle
 - We ensured that that the principle was not violated. Application behaviour does not depend on which subtypes it uses.

### Interface Segregation Principle
 - We ensured that no classes were forced to implement or use interfaces they did not need.
 
### Dependency Inversion Principle
 - It was implemented by the User use cases.

## MVP 

The project mainly follows the MVP model. However, to ensure clean architecture, we implemented controllers and presenters separately. 

## GitHub Features

The GitHub features used in project are:

- Issues
- Pull Requests
- Action
- License

## Test Coverage

- The test coverage is 80%. 
- We have tested the entities, use cases, controllers and database.
- We did not test UIs because we though the way to ensure its correctness is to check if it runs correctly and fulfils its function.
- We partially tested controllers and presenters.

## Future Plans

### Provide more functionalities:
- Our initial plan for this project was too ambitious as we only had a limited time. We didn't realize this until we implemented it. During the implementation, we removed some features mentioned in our plan because implementing these features can be very complicated, and we don't know how to make things work for some of them.

### Improve test coverage:
- We would use Mockito or a property-based testing library to add more unit tests to improve the test coverage of our project.

### Improve UI:
-Currently, text, frame sizes, and colors are fixed in our UI. Users with more limited sensory abilities may have different preferences that aren't accounted for.
Also, the UI is very limited and undynamic. We need to make it more interactive and user-friendly.

### Improve and add more accessibility features : 
- Currently, our program is inaccessible to some groups of people. For example, our program does not accommodate blind people as we did not have functions such as automatic reading and cursor navigation. We can add these to our program to make it more accessible to blind people.




