# Spring boot REST APIs with Actuator, Micrometer, OpenAPI

curl --location --request GET 'http://localhost:8080/customer/hello'

curl --location --request POST 'http://localhost:8080/customer' \
--header 'Content-Type: application/json' \
--data-raw '{
"first_name":"James",
"zipcode": "12301"
}'

curl --location --request GET 'http://localhost:8080/customer/all'

curl --location --request GET 'http://localhost:8080/customer/cca9e216-bbb6-42a2-a03e-7920da7da7621'

# Actuator

http://localhost:8080/actuator

http://localhost:8080/actuator/health

http://localhost:8080/actuator/prometheus

# OpenAPI3

https://springdoc.org/

http://localhost:8080/swagger-ui/index.html