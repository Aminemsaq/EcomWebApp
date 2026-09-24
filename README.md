# SpringStarter

A small reusable Spring Boot + React starter, blank/virgin base ready for a new project, using:

- Java 21
- Spring Boot
- Maven
- PostgreSQL
- React + Vite
- Node 24
- Docker Compose
- Make

## Quick start

```bash
chmod +x setup.sh
make setup
source /goinfre/$USER/42-java-env.sh
make up
```

Services:

- Frontend: http://localhost:5173
- Backend: http://localhost:8080
- Health: http://localhost:8080/api/health
- PostgreSQL: localhost:5432

## Local development

Backend:

```bash
make db
make backend
```

Frontend:

```bash
make frontend
```

## Useful commands

```bash
make up
make down
make restart
make logs
make ps
make build
make test
make clean
make fclean
```

## Starting point

This project intentionally contains **no business logic** — just the Spring Boot bootstrap, database wiring, and a blank React shell. `ddl-auto: update` is on, so any `@Entity` you add is auto-migrated to the `starter_db` Postgres instance on startup.

Recommended progression when building on top of it:

1. Entity
2. Repository
3. DTO
4. Mapper
5. Service
6. Controller
7. Validation
8. Exception handling
9. Pagination
10. Authentication
11. Authorization
12. Unit tests
13. Integration tests

Copy this folder whenever you start a new backend/frontend project.
