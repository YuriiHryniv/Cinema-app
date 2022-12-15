
![logo](pngs/logo.png)
# Cinema-app
___

### 📚 Project Description
___
_A server-based application that was written in accordance to SOLID rules and REST principles.
The emphasis was made upon the usage of popular Java frameworks like Spring and Hibernate. One can 
log in as an Admin and have access to methods that can manipulate the data inside the DB, or register 
a new user and have access to less sensitive endpoints. The data is transmitted through JSON format._

###  🔗 Features:
___
* registration like a user; 
* authentication like a user; 
* authentication like an admin;
* create/find by email a user;
* create a ticket;
* create/update/get users shopping cart;
* complete order/get users orders history;
* create/get/find available movie session;
* create/get movie;
* create/get cinema hall;
* display list of all movies;
* display list of all cinema halls;

### 👽 Available endpoints:
___
  * POST: /register - all
  * GET: /cinema-halls - user/admin
  * POST: /cinema-halls - admin
  * GET: /movies - user/admin
  * POST: /movies - admin
  * GET: /movie-sessions/available - user/admin
  * POST: /movie-sessions - admin
  * PUT: /movie-sessions/{id} - admin
  * DELETE: /movie-sessions/{id} - admin
  * GET: /orders - user
  * POST: /orders/complete - user
  * PUT: /shopping-carts/movie-sessions - user
  * GET: /shopping-carts/by-user - user
  * GET: /users/by-email - admin

### 👾 Tech stack
___
|   Technology	    | Version |
|:----------------:|:-------:|
|      JDK 	       |   11    |
|     Spring	      |  5.2.2  |
|     TomCat	      | 9.0.69  |
|    Hibernate	    | 8.0.30  |
|   Spring Web	    |  5.2.2  |
|      Maven	      |  3.8.6  |
|      MySQL	      |  8.0.0  |
| Spring Security	 |  5.2.2  |


### 🚀  How to run:
___
In order to use this application properly you should install MySQL, PostMan and Tomcat.
1. Clone this project from GitHub;
2. Create schema manually;
3. Go [here](https://github.com/YuriiHryniv/Cinema-app/blob/49c8099da59ec8ed358300fc2d9de82caa9efb97/src/main/resources/db.properties#L5) and provide the properties;
4. Change "hibernate.hbm2ddl.auto" to validate so that you can store data permanently;
5. Add Tomcat Server configure:
    * Press 'edit configuration' near run button.
    * Select the plus in the upper left corner.
    * Find Tomcat Server and choose local.
    * Press fix button in lower right corner.
    * Choose 'cinema-project:war exploded'.
    * Click 'apply' and 'Ok'.
6. Go to [DataInitializer.class](https://github.com/YuriiHryniv/Cinema-app/blob/49c8099da59ec8ed358300fc2d9de82caa9efb97/src/main/java/cinema/config/DataInitializer.java#L12) to provide your own default users;
7. Use it


### 🏠 Schema: 
___
![schema](pngs/schema.png)
