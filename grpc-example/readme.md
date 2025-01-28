source:
https://github.com/spring-projects-experimental/spring-grpc/tree/main/samples/grpc-server

after run server make request with following command in terminal:

grpcurl -d '{"name":"Hi"}' -plaintext localhost:9090 Simple.SayHello