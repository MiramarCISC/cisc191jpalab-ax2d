[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23511429)
# 1v1 Matching Game Server Lab
## Spring Boot + Spring Data JPA

This GitHub Classroom lab teaches the basics of **Spring Boot** and **Spring Data JPA**
using a simple **1v1 matching game server** theme.

Students will work with:
- Spring Boot application structure
- REST controllers
- JPA entities and relationships
- Spring Data repositories
- a service layer
- an in-memory H2 database for local testing

## Learning Goals

By the end of this lab, you should be able to:
1. explain the role of `@SpringBootApplication`, `@RestController`, `@Service`, `@Entity`, and repository interfaces
2. model a simple domain using JPA relationships
3. save and query entities with Spring Data JPA
4. implement service-layer methods that support a small matchmaking workflow
5. run tests against an H2 in-memory database

## Domain Overview

The app models a simplified 1v1 matching server:

- `PlayerAccount`: a player with a username and rating
- `QueueEntry`: a player waiting in the matchmaking queue
- `MatchRecord`: a 1v1 match between two players, with an optional winner

## Your Tasks

Complete the TODO methods in:

- `MatchmakingService.java`

Required methods:
1. `registerPlayer`
2. `enqueuePlayer`
3. `createMatch`
4. `finishMatch`
5. `findRecentMatchesForPlayer`

## Rules

- Do not rename classes or methods.
- Do not change package names.
- Do not modify the tests.
- Keep all code in `edu.sdccd.cisc191`.
- Use the repositories provided in the starter.
- Throw `IllegalArgumentException` when an ID does not exist or a winner is not part of the match.

## Run the app

```bash
mvn spring-boot:run
```

The app uses an in-memory H2 database.

## Run the tests

```bash
mvn test
```

## Example API endpoints

Register a player:
```bash
curl -X POST "http://localhost:8080/api/players?username=alpha&rating=1200"
```

Put a player in queue:
```bash
curl -X POST "http://localhost:8080/api/queue/1"
```

Create a match:
```bash
curl -X POST "http://localhost:8080/api/matches?playerOneId=1&playerTwoId=2&arenaName=Volcano"
```

Complete a match:
```bash
curl -X POST "http://localhost:8080/api/matches/1/finish?winnerId=2"
```

## Reflection Questions

1. Why is the service layer useful even when repositories already exist?
2. What JPA relationship is used from `QueueEntry` to `PlayerAccount`?
3. Why does `MatchRecord` store references to player entities instead of only storing usernames?
4. What is the benefit of using H2 for a classroom lab?
