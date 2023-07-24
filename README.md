# Spring Boot JWT Authentication
This project provides a basic JWT authentication implementation using Spring Boot.

## How to run?
To run this project, you need to set three environment variables in your IDE:

> `POSTGRES_URL`: Your PostgreSQL DB URL

> `POSTGRES_USER`: Your PostgreSQL DB User

> `POSTGRES_PASSWORD`: Your PostgreSQL DB Password

The project will run on http://localhost:8081.

## How to test?
Follow the steps below to test the JWT authentication:
1. Try sending a `GET request` to /products (you'll receive a 403 forbidden response).
2. Create a user using the `POST /register` endpoint with the following JSON payload:
```json
{
  "login": "test@test.com",
  "password": "test123"
  "role": "ADMIN"
}
```

3. After creating the user, use the `POST /login` endpoint to obtain a JWT by providing the following JSON payload:
```json
{
  "login": "test@test.com",
  "password": "test123",
}
```
4. The response from `POST /login` will contain your JWT.
5. Now, try making a GET request to /products, but don't forget to set the Authorization header with the value `Bearer "YOUR_TOKEN"`.
6. Since your token is valid, you will receive the list of products.
7. You can also call the POST /products endpoint (without a request body). If your role is ADMIN, you will receive a 200 status code; otherwise, if your role is USER, you will receive a 403 status code.

Please note that the instructions above assume you have properly set up the PostgreSQL database and other required components for Spring Boot to run successfully.