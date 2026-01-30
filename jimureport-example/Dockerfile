FROM registry.cn-hangzhou.aliyuncs.com/jeecgdocker/alpine-java:8_server-jre_unlimited

MAINTAINER jeecgos@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /jimureport

WORKDIR /jimureport

EXPOSE 8085

ADD ./target/jimureport-example-2.1.jar ./

CMD java -DMYSQL-HOST=jimureport-mysql -Dfile.encoding=utf-8 -Djava.security.egd=file:/dev/./urandom -jar jimureport-example-2.1.jar