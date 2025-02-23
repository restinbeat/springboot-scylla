# springboot-scylla

## scylla

---

### 접속
```bash
cd docker
docker compose up -d
```

### 로컬 확인

---
```bash
cqlsh localhost 9042
```


### 키 스페이스 생성 (단일) - (dev)

---

```bash
CREATE KEYSPACE sample 
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};
```

### 키 스페이스 생성 (다중) - 운영 (production)

---

```bash
CREATE KEYSPACE sample 
WITH replication = {'class': 'NetworkTopologyStrategy', 'datacenter1': 3};
```
