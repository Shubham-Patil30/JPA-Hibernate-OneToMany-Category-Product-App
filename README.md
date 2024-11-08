# Category-Product CRUD Project

## Description
This project demonstrates a One-to-Many relationship in JPA and Hibernate using CRUD operations. The setup includes two tables: `Category` and `Product`, where one `Category` can have multiple `Products`. All operations performed on `Category` are cascaded to `Product`, showcasing how relational mappings work in JPA.

## Features
- **One-to-Many Relationship**: Maps a single `Category` to multiple `Products` using the `@OneToMany` and `@JoinColumn` annotations.
- **Cascade Operations**: All CRUD operations on `Category` are automatically cascaded to associated `Products`.
- **CRUD Operations**: Supports Create, Read, Update, and Delete operations on both `Category` and `Product` tables.

## Technologies Used
- **Java**
- **JPA (Java Persistence API)**
- **Hibernate ORM**
- **MySQL (or any relational database)**
- **Maven** for dependency management

## Project Structure
- **Entity Classes**: Defines `Category` and `Product` entities with relational mapping using `@OneToMany` and `@JoinColumn`.
- **DAO Layer**: Contains methods to handle CRUD operations for both entities, with cascade settings ensuring changes to `Category` are reflected in `Product`.

## Annotations and Mappings
- **@OneToMany**: Establishes a one-to-many relationship between `Category` and `Product`.
- **@JoinColumn**: Specifies the foreign key column in `Product` that references `Category`.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/Shubham-Patil30/JPA-Hibernate-OneToMany-Category-Product-App.git
