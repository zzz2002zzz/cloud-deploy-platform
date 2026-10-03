\# Cloud Deploy Platform



A containerized application deployment project built to practise DevOps fundamentals, Docker, CI automation, and database integration.



\## Project Overview



Cloud Deploy Platform is a Spring Boot REST API connected to PostgreSQL. Docker containers run the application and database, while GitHub Actions automatically builds and tests the backend when changes are pushed.



\## Technology Stack



\* \*\*Backend:\*\* Java 21, Spring Boot, Maven

\* \*\*Database:\*\* PostgreSQL 16

\* \*\*Containers:\*\* Docker, Docker Compose

\* \*\*CI:\*\* GitHub Actions

\* \*\*Version Control:\*\* Git and GitHub



\## Architecture



```text

Developer

&#x20;  |

&#x20;  v

GitHub Repository

&#x20;  |

&#x20;  v

GitHub Actions CI

&#x20;  |

&#x20;  v

Build and Test

&#x20;  |

&#x20;  v

Spring Boot REST API

&#x20;  |

&#x20;  v

PostgreSQL Database

```



\## Features



\* REST API for managing tasks

\* PostgreSQL database integration

\* Docker containerization

\* Docker Compose configuration

\* PostgreSQL health check

\* GitHub Actions CI workflow

\* Actuator health endpoint

\* Persistent database storage



\## API Endpoints



| Method | Endpoint           | Purpose                  |

| ------ | ------------------ | ------------------------ |

| GET    | `/actuator/health` | Check application health |

| GET    | `/api/tasks`       | Retrieve tasks           |



\## Run Locally



\### Prerequisites



\* Java 21

\* Maven

\* Docker Desktop

\* Git



\### Start the Application



Clone the repository:



```bash

git clone https://github.com/zzz2002zzz/cloud-deploy-platform.git

cd cloud-deploy-platform

```



Build the backend:



```bash

docker compose build backend

```



Start the services:



```bash

docker compose up -d

```



Check the services:



```bash

docker compose ps

```



Check application health:



```bash

curl http://localhost:8080/actuator/health

```



Retrieve tasks:



```bash

curl http://localhost:8080/api/tasks

```



\## Continuous Integration



GitHub Actions runs the backend CI workflow when changes are pushed to the repository. The workflow builds and tests the application with PostgreSQL configured for CI.



\## Future Improvements



\* Container image publishing

\* Kubernetes deployment

\* Prometheus and Grafana monitoring

\* Cloud deployment

\* Automated deployment pipeline



\## Author



\*\*Chamudi Thamasha\*\*



GitHub: https://github.com/zzz2002zzz



\---



\*This project is being developed as a hands-on DevOps and cloud engineering learning project.\*



