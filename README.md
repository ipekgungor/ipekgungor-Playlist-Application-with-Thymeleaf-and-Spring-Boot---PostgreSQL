# Playlist Application with Thymeleaf and Spring Boot - PostgreSQL

This project is a music application developed using Thymeleaf and Spring Boot, integrated with a PostgreSQL database. The application allows users to list artists, albums, and songs, and manage their playlists.

## Features

- **Artist Detail Page:** Lists artists with their names, surnames, genres, birth years, and songs.
- **Album Detail Page:** Displays albums belonging to each artist with details.
- **Song List:** Shows songs belonging to albums and artists in detail with music platform links.
- **Playlist:** Users can add and remove songs to their playlist and view their playlist songs.

## Requirements

- **Java:** 17 or later
- **Maven:** 
- **PostgreSQL:** Database management system

## Installation Instructions

To run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/ipekgungor/ipekgungor-Playlist-Application-with-Thymeleaf-and-Spring-Boot---PostgreSQL.git
   cd ipekgungor-Playlist-Application-with-Thymeleaf-and-Spring-Boot---PostgreSQL
   
2. Set up your PostgreSQL database:
   ```bash
   CREATE USER <postgres_user> WITH PASSWORD '<password>';
   CREATE DATABASE <database_name>;
   GRANT ALL PRIVILEGES ON DATABASE <database_name> TO <postgres_user>;
3. Run sql scripts (in src/main/resources/sql)
4. Run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
5. Once the application is running, navigate to http://localhost:8080 to use the app.


## Contact
- **Developer:** İpek Güngör
- **Email:** ipekgungor2001@gmail.com
- **GitHub Profile:** ipekgungor

## Notes
- **Be careful about the java and eclipse versions.** My Eclipse version: 2024-06 (4.32.0) / My Java version: java 22.0.
- **You can find sql commands in src/main/resources/sql** 
