
**_POSTMAN LINK_** -> [https://www.getpostman.com/collections/403fddc3f887ce7c637e](https://www.getpostman.com/collections/403fddc3f887ce7c637e)


<b> Services and Their Port Nos: </b>  

    Eureka Server : 8761
    Token Sevice : 8080
    Admin Service : 8081
    Consumer Service : 8082
    ShopMgmt Service : 8083
    Shop Service : 8084

******************************************************************

ADMIN SERVICES:

    1.1)SIGNUP:
    Method: POST
    Endpoint: http://localhost:8081/user/signup    

    1.2) LOGIN:
    Method: POST
    Endpoint: http://localhost:8081/user/login    
  
    1.3) GET-USERS:
    Method: GET
    Endpoint: http://localhost:8081/user/get-users



SHOP SERVICES:

    2.1) GET-PRODUCTS:
    Method: GET
    Endpoint: http://localhost:8084/shop/products    

    2.2) GET-PRODUCTS-BY-FIELD:
    Method: POST
    Endpoint: http://localhost:8084/shop/products    

    2.3) GET-CATEGORIES:
    Method: GET
    Endpoint: http://localhost:8084/shop/categories    

    2.4) GET-CATEGORIES-BY-FIELD:
    Method: POST
    Endpoint: http://localhost:8084/shop/categories    



    CONSUMER SERVICES: (TOKEN REQUIRED)

    3.1) CATEGORIES:

    3.1.1) GET categories:
    Method: GET
    Endpoint: http://localhost:8082/consumer/shop-management/categories    

    3.1.2) ADD category
    Method: POST
    Endpoint: http://localhost:8082/consumer/shop-management/add-category    

    3.1.3) UPDATE category by ID
    Method: POST
    Endpoint: http://localhost:8082/consumer/shop-management/update-category-by-id/{id}   

    3.1.4) DELETE category by ID
    Method: DELETE
    Endpoint: http://localhost:8082/consumer/shop-management/delete-category-by-id/{id}


    3.2) PRODUCTS:

    3.2.1) GET Products
    Method: GET
    Endpoint: http://localhost:8082/consumer/shop-management/products    3.2.2) ADD PRODUCT
    Method: POST
    Endpoint: http://localhost:8082/consumer/shop-management/add-product    

  
    3.2.3) LINK PRODUCT WITH CATEGORY
    METHOD: PUT
    Endpoint: http://localhost:8082/consumer/shop-management/product-with-category/{product_id}/{category_id}    

    3.2.4) UPDATE PRODUCT by ID
    Method: POST
    Endpoint: http://localhost:8082/consumer/shop-management/update-product-by-id/{id}    
   
    3.2.5) DELETE PRODUCT by ID
    Method: DELETE
    Endpoint: http://localhost:8082/consumer/shop-management/delete-product-by-id/{id}


