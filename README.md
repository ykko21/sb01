### Spring boot REST APIs with Actuator, Micrometer

curl --location --request GET 'http://localhost:8080/hello'

curl --location --request POST 'http://localhost:8080/customer' \
--header 'Content-Type: application/json' \
--data-raw '{
"first_name":"James",
"zipcode": "12301"
}'

curl --location --request GET 'http://localhost:8080/customers'

curl --location --request GET 'http://localhost:8080/customer/cca9e216-bbb6-42a2-a03e-7920da7da7621'