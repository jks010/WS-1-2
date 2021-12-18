# WS-1-2

## CRUD Usage

# Create

```
curl -X POST http://localhost:8080/createC -d "id=&factory_id=&model=&year=&fuel=&doors=&cost=&color"

curl -X POST http://localhost:8080/createF -d "id=&name=&country_code="
```
# Read
```
curl http://localhost:8080/getC
curl http://localhost:8080/getC/{id}

curl http://localhost:8080/getF
curl http://localhost:8080/getF/{id}
```

# Update 

```
curl -X PUT http://localhost:8080/updateC/{id} -d "id=&factory_id=&model=&year=&fuel=&doors=&cost=&color"

curl -X PUT http://localhost:8080/updateF/{id} -d "id=&name=&country_code="
```
# Delete 
```
curl -X DELETE http://localhost:8080/deleteC/{id}
curl -X DELETE http://localhost:8080/deleteF/{id}
```

# Upload CSV file

```
curl -F file=@"file.csv" http://localhost:8080/file
```
