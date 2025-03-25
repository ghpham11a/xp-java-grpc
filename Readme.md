
```json
{
  "openCase": {
    "identifier": "ABCDE12345",
    "caseCode": 2,
    "queries": [
      {
        "questionId": 1,
        "answerId": 10,
        "answerValue": "Answer One"
      },
      {
        "questionId": 2,
        "answerId": 20,
        "answerValue": "Answer Two"
      }
    ]
  }
}
```

```json
{
  "closedCase": {
    "identifier": "ABCDE67890",
    "caseCode": 1,
    "query1": {
      "questionId": 1,
      "answerId": 100,
      "answerValue": "Query1 Answer"
    },
    "query2": {
      "questionId": 2,
      "answerId": 200,
      "answerValue": "Query2 Answer"
    }
  }
}
```

###### 3. Setup PostgreSQL

Setup PostgreSQL containers using values from dev-postgres-values.yaml. This is in the k8s folder.

```sh
helm install xp-postgres -f dev-postgres-config.yaml bitnami/postgresql
```

Connect to the PostgreSQL in the container via psql. First set the password.

```sh
# set admin password with Powershell
$POSTGRES_PASSWORD = [System.Text.Encoding]::UTF8.GetString([System.Convert]::FromBase64String((kubectl get secret --namespace default xp-postgres-postgresql -o jsonpath="{.data.postgres-password}")))

# set admin password in bash
secret=$(kubectl get secret --namespace default xp-postgres-postgresql -o jsonpath="{.data.postgres-password}")

POSTGRES_PASSWORD=$(echo "$secret" | base64 --decode)
```

Using the password from above, get into the container and launch psql

```sh
kubectl run xp-postgres-postgresql-client --rm --tty -i --restart='Never' --namespace default --image docker.io/bitnami/postgresql:17.0.0-debian-12-r6 --env="PGPASSWORD=$POSTGRES_PASSWORD" --command -- psql --host xp-postgres-postgresql -U postgres -d postgres -p 5432
```

Create the database

```
CREATE DATABASE <your_database_name>;
```

Connect to this database

```
\c <your_database_name>
```

Create the tables

```sql
-- Create the OpenCase table
CREATE TABLE open_case (
    identifier VARCHAR(255) PRIMARY KEY,
    case_code INTEGER NOT NULL
);

-- Create the OpenQuery table for the repeated queries field
CREATE TABLE open_query (
    id SERIAL PRIMARY KEY,
    open_case_identifier VARCHAR(255) NOT NULL,
    question_id INTEGER NOT NULL,
    answer_id INTEGER NOT NULL,
    answer_value TEXT NOT NULL,
    FOREIGN KEY (open_case_identifier) REFERENCES open_case(identifier) ON DELETE CASCADE
);

CREATE TABLE closed_case (
    identifier VARCHAR(255) PRIMARY KEY,
    case_code INTEGER NOT NULL,
    -- Query1 fields
    query1_question_id INTEGER NOT NULL,
    query1_answer_id INTEGER NOT NULL,
    query1_answer_value TEXT NOT NULL,
    -- Query2 fields
    query2_question_id INTEGER NOT NULL,
    query2_answer_id INTEGER NOT NULL,
    query2_answer_value TEXT NOT NULL
);
```

To check that it was created successfully

```sh
postgres=# \dt
```

Grant priveledges to user setup in dev-postgres-config.yaml

```
GRANT ALL PRIVILEGES ON TABLE open_case TO "postgres-username";
GRANT ALL PRIVILEGES ON TABLE open_query TO "postgres-username";
GRANT ALL PRIVILEGES ON TABLE closed_case TO "postgres-username";
GRANT USAGE, SELECT, UPDATE ON SEQUENCE open_query_id_seq TO "postgres-username";
```

Quit psql

```sh
postgres=# \q
```