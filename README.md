# E-commerce Website Backend Development

This project is a full-stack development of an e-commerce website with a robust backend implemented in Java and MySQL database. The site features roles for customers, managers, and admins, each with specific responsibilities. The APIs are designed to be RESTful, ensuring a clean and efficient interaction between the frontend and backend.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
  - [Customer](#customer)
  - [Manager](#manager)
  - [Admin](#admin)
- [Technologies Used](#technologies-used)
- [Database Schema](#database-schema)
- [API Endpoints](#api-endpoints)
- [Installation and Setup](#installation-and-setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Overview
This project is an e-commerce platform where users can sign up as customers, managers, or admins. Each user role has specific capabilities:

- **Customers** can browse products, add them to the cart, purchase items, and rate products.
- **Managers** can manage the inventory, ban and delete customers.
- **Admins** can add and delete both customers and managers, as well as perform all the actions available to managers.

The backend APIs are developed using Java and follow RESTful principles, while the database is managed using MySQL.

## Features

### Customer
- **Browse Products**: View a list of available products.
- **Add to Cart**: Add items to the shopping cart.
- **Purchase Items**: Buy products added to the cart.
- **Rate Products**: Provide ratings for purchased products.

### Manager
- **Manage Inventory**: Add, update, and delete products from the inventory.
- **Ban Customers**: Restrict access to customers who violate terms.
- **Delete Customers**: Remove customer accounts from the system.

### Admin
- **Add/Delete Users**: Create and remove customer and manager accounts.
- **Full Manager Access**: Perform all tasks that managers can do.

## Technologies Used
- **Frontend**: HTML, CSS, JavaScript (Frameworks/Libraries: React, Angular, or Vue)
- **Backend**: Java (Spring Boot for RESTful APIs)
- **Database**: MySQL
- **Authentication**: JWT (JSON Web Tokens)

## Database Schema
The database schema includes tables for users, products, orders, and ratings. Key relationships between these tables ensure data integrity and support complex queries.

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - Login a user

### Customer Endpoints
- `GET /api/products` - Get all products
- `POST /api/cart` - Add product to cart
- `POST /api/orders` - Purchase items in the cart
- `POST /api/ratings` - Rate a product

### Manager Endpoints
- `POST /api/products` - Add new product
- `PUT /api/products/{id}` - Update existing product
- `DELETE /api/products/{id}` - Delete a product
- `POST /api/customers/ban` - Ban a customer
- `DELETE /api/customers/{id}` - Delete a customer

### Admin Endpoints
- `POST /api/users` - Add a new user (customer or manager)
- `DELETE /api/users/{id}` - Delete a user
- All Manager Endpoints
