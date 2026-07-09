Create authentication service that returns JWT 

As part of first step of JWT process, the user credentials needs to be sent to authentication service request that generates and returns the JWT.
Ideally when the below curl command is executed that calls the new authentication service, the token should be responded. Kindly note that the credentials are passed using -u option.

Request
curl -s -u user:pwd http://localhost:8024/authenticate
Response
{"token":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNzUyMzAwMjEzLCJleHAiOjE3NTIzMDM4MTN9.7Wdp8uFmZSVLzVP5vQIyGBTvAqv-o6Ksu1pozB52b50"}

