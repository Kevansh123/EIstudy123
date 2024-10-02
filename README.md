# Coding Exercises

## Overview
This repository contains two coding exercises focused on demonstrating key programming concepts: design patterns and a scheduling application. 

### Exercise 1: Design Patterns

#### Description
This project showcases six different design patterns implemented in Java, including:
- **Two Behavioral Patterns**: 
  - **Observer Pattern**: Implements a newsletter system where subscribers receive updates.
  - **Strategy Pattern**: Implements a calculator that can perform different operations dynamically.
  
- **Two Creational Patterns**: 
  - **Singleton Pattern**: Implements a logger that ensures only one instance exists.
  - **Factory Pattern**: Implements a shape factory that can create different shapes (Circle and Rectangle).

- **Two Structural Patterns**: 
  - **Adapter Pattern**: Implements a media player that can play different formats using an adapter.
  - **Composite Pattern**: Implements a restaurant menu where both individual dishes and meal combinations can be treated uniformly.

#### Key Files
- **ObserverPattern.java**
- **StrategyPattern.java**
- **SingletonPattern.java**
- **FactoryPattern.java**
- **AdapterPattern.java**
- **CompositePattern.java**

### Exercise 2: Astronaut Daily Schedule Organizer

#### Description
The Astronaut Daily Schedule Organizer is a console-based application designed to help astronauts manage their daily tasks. The application allows users to add, remove, and view tasks, ensuring that no two tasks overlap in time. 

#### Key Features
- Add tasks with a description, start time, end time, and priority level.
- Remove tasks by their description.
- View all tasks, sorted by start time.
- Validate that tasks do not overlap in time.

#### Key Files
- **Task.java**: Class representing a task with relevant attributes.
- **ScheduleManager.java**: Singleton class to manage the scheduling of tasks.
- **TaskFactory.java**: Factory class for creating task objects.
- **Main.java**: Main application to interact with users.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
