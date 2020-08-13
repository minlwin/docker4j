# PostgreSQL DB Image

## Dockerfile

<code>
FROM postgres:13-alpine

ENV POSTGRES_DB=location
ENV POSTGRES_USER=location
ENV POSTGRES_PASSWORD=location

EXPOSE 5432/tcp
</code>