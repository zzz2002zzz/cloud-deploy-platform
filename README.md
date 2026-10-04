# Cloud Deploy Platform

A DevOps-focused application that demonstrates backend development, containerization, database integration, and Continuous Integration (CI) using modern development tools.

## Project Overview

Cloud Deploy Platform is a containerized Spring Boot REST API connected to PostgreSQL. Docker Compose manages the application services, while GitHub Actions automates the build, verification, and Docker image build process.

## Technologies Used

* **Backend:** Java 21, Spring Boot
* **Database:** PostgreSQL 16
* **Build Tool:** Maven
* **Containerization:** Docker, Docker Compose
* **CI/CD:** GitHub Actions
* **Health Monitoring:** Spring Boot Actuator
* **Version Control:** Git, GitHub

## Architecture

```text
Developer
    |
    v
   GitHub
    |
    v
GitHub Actions
    |
    +-- Build and verify application
    |
    +-- Build Docker image
    |
    v
Docker Compose
    |
    +-- Spring Boot Backend (:8080)
    |
    +-- PostgreSQL Database (:5432)
```

## Key Features

* REST API for managing tasks
* PostgreSQL database integration
* Containerized backend application
* Docker Compose service orchestration
* Automated CI workflow with GitHub Actions
* Application health checks using Spring Boot Actuator
* Persistent database storage

## Getting Started

### Prerequisites

Install Git, Java 21, Docker Desktop, and Docker Compose.

### Run the Application

Clone the repository:

```bash
git clone https://github.com/zzz2002zzz/cloud-deploy-platform.git
cd cloud-deploy-platform
```

Start the services using Docker Compose:

```bash
docker compose up -d --build
```

Check the running containers:

```bash
docker compose ps
```

### Verify Application Health

Open:

`http://localhost:8080/actuator/health`

A healthy application should return a status of `UP`.

## API Examples

Base URL: `http://localhost:8080`

### Get All Tasks

```http
GET /api/tasks
```

### Create a Task

```http
POST /api/tasks
Content-Type: application/json
```

Example request body (adjust fields to match the API model):

```json
{
  "title": "Deploy application",
  "description": "Deploy the application",
  "status": "TODO"
}
```

### Health Check

```http
GET /actuator/health
```

## Continuous Integration

The GitHub Actions workflow runs when code is pushed to `main` or a pull request targets `main`.

The pipeline includes:

* Java 21 environment setup
* Maven build and verification
* Automated test execution through Maven
* Docker image build

View workflow runs in the repository's **Actions** tab.

## Project Structure

```text
cloud-deploy-platform/
├── .github/
│   └── workflows/
│       └── ci.yml
├── backend/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── docker-compose.yml
└── README.md
```

## Future Improvements

* Infrastructure provisioning with Terraform
* Deployment to a cloud platform
* Monitoring and visualization with Prometheus and Grafana

## Author

**Chamudi Thamasha**

Information Technology Undergraduate | Aspiring DevOps Engineer

GitHub: https://github.com/zzz2002zzz
