# Supported operations:

The following will return a list of all countries

```
GET http://localhost:8080/countries
Accept: application/json
```

The following will return a list which will contain information about all countries that are passed as arguments
to the request.

The request to retrieve information about each country will be made in parallel

```
GET http://localhost:8080/countries?names=India&names=Chinas
Accept: application/json
```

This is the same as the previous request but this time the request
needs Basic authentication to be made.

```
GET http://localhost:8080/countries/secured?names=India&names=Chinas
Accept: application/json
Authorization: Basic Y2hyaXN0b3M6c290aXJpb3U=
```

## Other information
At the end of the operation that returns the information about multiple countries, there is a check for the current security context.

This is done to showcase that there is context propagation by default when making asynchronous requests.
