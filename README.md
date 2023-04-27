About this repository
A demo of microservices to be run on your local machine

Components
consul
Needs to be installed locally Refer official doc for how to install locally.
The consul UI can be used to view service status and configure properties.

http://localhost:8500

Below 3 microservices use consul for external config and service discovery

Ecommerce service
Main service that lists ecommerce products through RESTful endpoint. http://localhost:9080/github.com/ateferi/ecommerce-microservices/ecommerceProducts

Add property key as
config/ecommerceApp/useImages
and value as true.

Data is stored in H2 in memory database.

This spring boot service can be started as below:

cd ecommerce
mvn spring-boot:run
product-service
Product service that lists product entity details through RESTful endpoint.

http://localhost:8090/product-service/products

Data is stored in H2 in memory database.
This spring boot service can be started as below:
cd product
mvn spring-boot:run
image-service
Images service that lists images for products through RESTful endpoint.
http://localhost:9090/image-service/images

Data is stored in H2 in memory database.
This spring boot service can be started as below:
cd images
mvn spring-boot:run
Usage
mvn spring-boot:run
