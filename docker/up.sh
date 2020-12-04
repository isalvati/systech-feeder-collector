#!/bin/sh
docker-compose --project-name systech-collector -f docker-compose-systech-collector.yml up -d
#--no-recreate
echo "docker instance up"

echo "docker setting rabbit mq mqtt config"
RESULT=$(docker exec -it systech_rabbit rabbitmq-plugins enable --offline rabbitmq_management)
echo $RESULT
RESULT=$(docker exec -it systech_rabbit rabbitmq-plugins enable --offline rabbitmq_mqtt)
echo $RESULT
RESULT=$(docker exec -it systech_rabbit rabbitmq-plugins enable --offline rabbitmq_web_mqtt)
echo $RESULT
RESULT=$(docker exec -it systech_rabbit rabbitmq-plugins enable --offline rabbitmq_prometheus)
echo $RESULT
RESULT=$(docker exec -it systech_rabbit rabbitmq-plugins enable --offline rabbitmq_auth_backend_oauth2)
echo $RESULT
RESULT=$(docker exec -it systech_rabbit echo 'SYSTECH_RABBIT_NODE=rabbit@localhost' >> /etc/rabbitmq/rabbitmq.conf)
echo $RESULT
echo "docker rabbit mq mqtt config finished"
