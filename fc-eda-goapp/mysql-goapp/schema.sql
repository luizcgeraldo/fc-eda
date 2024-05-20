USE wallet

DROP TABLE IF EXISTS wallet.transactions;
DROP TABLE IF EXISTS wallet.accounts;
DROP TABLE IF EXISTS wallet.clients;


Create table wallet.clients (id varchar(255), name varchar(255), email varchar(255), created_at date);
Create table wallet.accounts (id varchar(255), client_id varchar(255), balance int, created_at date);
Create table wallet.transactions (id varchar(255), account_id_from varchar(255), account_id_to varchar(255), amount int, created_at date);


INSERT INTO wallet.clients (id, name, email, created_at) VALUES ('323ae4f9-4e7b-490a-92e5-d1dcb27cac07', 'John Doe', 'johndoe@example.com', '2023-10-06');
INSERT INTO wallet.clients (id, name, email, created_at) VALUES ('f46bb0a4-403a-466e-8ec1-8c2e3502d38c', 'Jane Doe', 'janedoe@example.com', '2023-10-06');

INSERT INTO wallet.accounts (id, client_id, balance, created_at) VALUES ('9a9d550f-c475-4bad-a034-cfd3dbdb6813', '323ae4f9-4e7b-490a-92e5-d1dcb27cac07', 1000, '2023-10-06');
INSERT INTO wallet.accounts (id, client_id, balance, created_at) VALUES ('092ce768-68e5-448f-8747-b0b149b01131', 'f46bb0a4-403a-466e-8ec1-8c2e3502d38c', 500, '2023-10-06');
