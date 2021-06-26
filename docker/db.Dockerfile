FROM postgres:12-alpine

WORKDIR /project

ENV POSTGRES_USER=newuser
ENV POSTGRES_PASSWORD=mysecretpassword
ENV POSTGRES_DB=authproject
ENV DB_PORT=5432

EXPOSE 5432

COPY /data/all_files.sql /docker-entrypoint-initdb.d/project_data.sql