# spring-security-basic

admin info:
- username: admin
- password: admin

user info:
- username: user
- password: user

BCryptPasswordEncoder:
- encypted version of admin: $2y$12$I0Di/vfUL6nqwVbrvItFVOXA1L9OW9kLwe.1qDPhFzIJBpWl76PAe
- 2y represents the BCrypt algorithm version
- 12 represents the strength of the algorithm

### Authenticate

<image src="auth-post.PNG">

jwt token: "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImlzQWRtaW4iOnRydWUsImV4cCI6MTY0NjMwNzcyNCwiaWF0IjoxNjQ2Mjg5NzI0fQ.KNGrYQD3pkzHeJ1J2gOx1JpWSU5hXNBxf2dsifdGNeBv9kJ4csUPA6scfltMyJmCwe5KYi2sd15bPahdKwaVWQ"

decoded jwt:

<image src = "decoded-jwt.PNG">

### Authorisation
Client side sends a request to server with jwt token:
<image src="get-req-with-jwt.PNG">

The server checks existance of jwt token. The tocken is checked with the customJwtAuthenticationFilter object in the customJwtAuthenticationFilter class. Then the role of the user passed to spring sequrity. if the user authenticated and has access to the end point the OK response returned to yhe user.

### jwt epiration
[This]( https://www.javainuse.com/webseries/spring-security-jwt/chap4 ) tutorial says spring has an issue with jwt expiration exception. Shows how to solve that probleb. Soon tihis documentaion and source code will be updated.

### Source
[This](https://www.javainuse.com/webseries/spring-security-jwt/chap3) tutorial used while doing this troject: [link](https://www.javainuse.com/webseries/spring-security-jwt/chap3)