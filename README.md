# fc-eda
 Desafio FullCycle EDA

*ACESSANDO DB MS GO*

>docker-compose exec mysql bash
>mysql -u root -p wallet
>pw: root

*ACESSANDO DB MS JAVA*

>docker-compose exec mysql2 bash 
>mysql -u root -p balances
>pw: root


*ACESSANDO CONTROL CENTER*

url: http://localhost:9021/

>Em "Clusters" criar os topicos "balances" e "transactions"

>Ao abrir os topicos no control-center, nos selects colocar as opções "Jump to offset" e no segundo "0".
Vai aparecer os itens na fila do kafka

>Para testar as chamadas de API, abra o arquivo fc-eda-goapp/api/client.http

>Para executar os containers, recomendo utilizar o Linux Ubuntu v.22-lts e executar o comando docker-compose up -d --build no mesmo diretório onde fizer o clone do repositório
