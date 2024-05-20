USE balances

DROP TABLE IF EXISTS balances.balances;

Create table balances.balances (account_id varchar(255), balance int, created_at date, updated_at date);

INSERT INTO balances.balances (account_id,  balance, created_at) VALUES ('9a9d550f-c475-4bad-a034-cfd3dbdb6813', 1000, '2023-10-06');
INSERT INTO balances.balances (account_id, balance, created_at) VALUES ('092ce768-68e5-448f-8747-b0b149b01131', 500, '2023-10-06');


