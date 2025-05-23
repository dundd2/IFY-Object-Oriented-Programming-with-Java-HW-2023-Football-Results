# IFY-Object-Oriented-Programming-with-Java-HW-2023-Football-Results

This repository showcases my Java project developed for the Foundation SEP_IFY: Object Oriented Programming with Java (OOPJ) module. The project focuses on creating an application that allows football teams to store and manage information about the matches they participate in. It tracks match outcomes, points gained, and provides statistical insights for each team based on their performance.

Completed in March 2023, this project received a grade of 37 out of 50. For further details, please refer to the accompanying PDF documentation.

## Overview


The application consists of two main classes: **FootMatch** and **Team**, along with a test class for validation. The **FootMatch** class captures match details between two teams, while the **Team** class calculates and updates the team's results based on the matches played.

## Features

- **Match Management**: Record and report on matches played by a team.
- **Team Statistics**: Track total goals scored, goals against, and points accumulated.
- **Result Calculation**: Automatically determine match results and update team statistics.
- **Extended Functionality**: Additional methods to view match records, such as listing matches against specific teams or identifying draws.

## Class Breakdown

### FootMatch Class

#### Fields
- `String homeTeamName`: Name of the home team.
- `String awayTeamName`: Name of the away team.
- `int homeGoals`: Goals scored by the home team.
- `int awayGoals`: Goals scored by the away team.

#### Methods
- `setResult(...)`: Sets the result of the match after its completion.
- Accessor methods for all fields.
- `toString()`: Returns a string representation of match details.

### Team Class

#### Fields
- `String teamName`: Name of the team.
- `ArrayList<FootMatch> results`: Stores the matches played by the team.
- `int totalGoalsFor`: Total goals scored by the team.
- `int totalGoalsAgainst`: Total goals conceded by the team.
- `int totalPoints`: Total points accumulated.
- `int[] stats`: Array for additional statistical data.

#### Methods
- `getResults(FootMatch aMatch)`: Updates match results for the team based on the provided match.
- `getMatchResult(...)`: Determines if the team was involved in the match and updates statistics accordingly.
- `updateStatistics(int ourGoals, int theirGoals)`: Calculates total goals and points for the team.

## Testing

The application includes a dedicated test class to ensure functionality. Various test cases are implemented to validate the correctness of match recording and statistical calculations.

## Installation

To run the application:
1. Clone this repository.
2. Compile the Java files using your preferred IDE or command line.
3. Execute the main class to start using the application.

## Conclusion

This project demonstrates my ability to apply object-oriented programming principles and manage data effectively within a Java application. It reflects my understanding of software design and my commitment to producing high-quality code.

### Grade: 37/50

Feedback highlighted the need for improvements in functionality handling and statistical reporting, indicating areas for future development.
