# SCTP Module 4 — DevOps Demo

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/rchai1/devops-demo/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/rchai1/devops-demo/tree/main)

Spring Boot demo project for Lessons 4.4–4.7 using Java 21, Maven, Docker, PostgreSQL, GitHub Flow, and CircleCI.

## Run locally

```powershell
.\mvnw.cmd clean test
.\mvnw.cmd spring-boot:run
```

Open <http://localhost:8080/> and check health at <http://localhost:8080/actuator/health>.

## Lesson 4.5 — Docker

```powershell
docker build -t rchai1/devops-demo:local .
docker run --rm -p 8080:8080 rchai1/devops-demo:local
```

## Lesson 4.6 — Docker Compose and PostgreSQL

Copy `.env.example` to `.env`, choose a local-only password, then run:

```powershell
docker compose up --build
docker compose down
```

Use `docker compose down -v` only when you intentionally want to delete the PostgreSQL lesson data.

## Lesson 4.7 — CircleCI

Connect the GitHub repository in CircleCI and add these project environment variables:

- `DOCKERHUB_USERNAME` = `rchai1`
- `DOCKERHUB_TOKEN` = a Docker Hub access token (never the account password)

Feature branches run tests and build the image. The `main` branch additionally publishes the commit-tagged and `latest` images to Docker Hub.

## GitHub Flow

Create a short-lived branch, push it, open a pull request, wait for CI, merge to `main`, then delete the branch.
