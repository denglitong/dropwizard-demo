# DropWizard demo

## Build

    # {target}_deploy.jar 生成可独立运行的包 是一个约定
    
    bazel build //:dropwizard-demo_deploy.jar

## Run

    java -jar ./bazel-bin/dropwizard-demo_deploy.jar server application.yml

http://localhost:8080/hello-world

    {"id":1,"content":"Hello, Stranger!"}

http://localhost:8080/hello-world?name=compass

    {"id":2,"content":"Hello, compass!"}

## Metrics

http://localhost:8081/metrics

## Admin panel

http://localhost:8081/

## Integrate with Guice

http://localhost:8080/api/v1/user

    {"userId":1,"userName":"compass"}