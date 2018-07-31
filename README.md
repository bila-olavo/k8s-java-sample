* Health da app

curl -X GET \
  http://localhost:8080/actuator/health \


* Info da App

curl -X GET \
  http://localhost:8080/actuator/info \


* Request para publicar a msg

curl -X POST \
  http://localhost:8080/messages \
  -H 'Content-Type: application/json' \
  -d '{
  "ts": "teste",
  "sender": "project.message.q",
  "message": {
    "foo": "01",
    "bar": "02"
  },
  "sentFromIp": "192.168.0.1",
  "priority": 2
}'