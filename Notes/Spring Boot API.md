x🔹 What is Spring Boot API?

In Spring Boot, an API usually refers to a REST API (Representational State Transfer), which allows client applications (frontend, mobile apps, other services) to communicate with your backend service.

Spring Boot makes it easy to create REST APIs using:

@RestController

@RequestMapping / @GetMapping, @PostMapping, etc.

@RequestBody, @PathVariable, @RequestParam

ResponseEntity for responses

🔹 Basic Spring Boot API Example
package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/products")  // Base URL: /api/products
public class ProductController {

    private List<String> products = new ArrayList<>(List.of("Laptop", "Phone", "Tablet"));

    // GET - Fetch all products
    @GetMapping
    public List<String> getAllProducts() {
        return products;
    }

    // GET - Fetch single product by index
    @GetMapping("/{id}")
    public String getProduct(@PathVariable int id) {
        return products.get(id);
    }

    // POST - Add new product
    @PostMapping
    public String addProduct(@RequestBody String product) {
        products.add(product);
        return "Product added: " + product;
    }

    // PUT - Update product
    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody String product) {
        products.set(id, product);
        return "Product updated at index " + id;
    }

    // DELETE - Remove product
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        String removed = products.remove(id);
        return "Deleted: " + removed;
    }
}

🔹 How this API Works

GET /api/products → returns all products

GET /api/products/0 → returns first product

POST /api/products with body "Camera" → adds new product

PUT /api/products/1 with body "Smartphone" → updates second product

DELETE /api/products/2 → deletes third product

🔹 Best Practices for Spring Boot APIs

Use DTOs (Data Transfer Objects) instead of exposing entities directly.

Handle errors with @ControllerAdvice + @ExceptionHandler.

Return proper status codes using ResponseEntity.
Example: return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);

Validation with @Valid + @NotNull, @Size, etc.

Service Layer for business logic (don’t keep everything in the controller).

Repository Layer with JPA/Hibernate for database interactions.