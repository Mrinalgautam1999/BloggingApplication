# Blogging App

Blogging App is a web-based platform that allows users to create, read, update, and delete posts and comments. Users can also search for posts, follow other users, and engage in discussions.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup](#setup)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

The Blogging App is built on the Spring Boot framework and follows the Model-View-Controller (MVC) architecture. It uses a MySQL database to store user data, posts, and comments. The platform includes user registration and authentication, allowing users to create, update, and delete their own posts, as well as comment on posts created by others. Users can also follow other users and interact with posts through various API endpoints.

## Technologies Used

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL
- Lombok
- Swagger
- Maven

## Project Structure

The project is structured into several components:

- `src/main/java`: Contains the Java source code.
  - `com.example.bloggingapp.controller`: Controllers for handling API requests.
  - `com.example.bloggingapp.model`: Entity classes representing the data structure.
  - `com.example.bloggingapp.repository`: JPA repositories for database interaction.
  - `com.example.bloggingapp.service`: Services for business logic.
  - `com.example.bloggingapp.validation`: Annotation-based validation for request payloads.
- `src/main/resources`: Contains configuration files and static resources.
- `pom.xml`: Maven configuration file specifying project dependencies.

## Setup

 # Blogging App

Blogging App is a web-based platform that allows users to create, read, update, and delete posts and comments. Users can also search for posts, follow other users, and engage in discussions.

## Usage

- Access the Swagger API documentation at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to explore and test the available endpoints.

## API Endpoints

- **Follow User**:
  - `POST /follow/user/{targetUserId}`: Follow a specific user.

- **Retrieve All Followers**:
  - `GET /all/follower`: Get a list of all followers for the logged-in user.

- **Comment on Post**:
  - `POST /comment/post/{postId}`: Comment on a specific post.

- **Delete Post Comment**:
  - `DELETE /post/comment/{commentId}`: Delete a comment on a post.

- **Get All Comments for a Post**:
  - `GET /all/comment/{postId}`: Retrieve all comments for a specific post.

- **Update Comment**:
  - `PUT /update/comment/{commentId}`: Update a comment.

- **Create a Post**:
  - `POST /Post/vlog`: Create a new post.

- **Get All Posts**:
  - `GET /All/Post`: Retrieve all posts.

- **Update Post**:
  - `PUT /update/Post/{postId}`: Update a post.

- **Delete Post**:
  - `DELETE /Post/{postId}`: Delete a post.

- **User Sign-Up**:
  - `POST /user/signUp`: Register a new user.

- **User Sign-In**:
  - `POST /User/signIn`: Log in as a user.

- **User Sign-Out**:
  - `DELETE /user/signOut`: Log out the user.

- **Get Post by ID**:
  - `GET /postById/{postId}`: Retrieve a post by its ID.

- **Change Password**:
  - `PUT /change/password`: Change the user's password.

## Contributing

We welcome contributions from the community. If you have suggestions, bug reports, or want to add new features, please submit an issue or a pull request. We follow the standard GitHub flow for contributions.

## License

This project is licensed under the MIT License.

<!-- Acknowledgments -->
## Acknowledgments
- Thank you to the Spring Boot and Java communities for providing excellent tools and resources.

<!-- Contact -->
## Contact
For questions or feedback, please contact : Mrinal Gautam 
- Maild Id : mmrinalgautam1999@gmail.com

<h1 align="center">Thank You...<h1>
<h3 align = "center"> ***********************************************************<h3>

