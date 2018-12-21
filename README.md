# README #


---

#### Infos  ####

* App Health

```
curl -XGET http://localhost:8080/actuator/health

```

* Info App

```
curl -XGET  http://localhost:8080/actuator/info

```
* POST Payload into JMS Queue

```
curl -i -X POST http://localhost:8080/messages -H 'Content-Type: application/json' -d '{ "ts": "teste", "sender": "project.message.q", "message": { "foo": "01", "bar": "02" }, "sentFromIp": "192.168.0.1", "priority": 2 }'

```

---

Deploy Kubernetes:

```

```
