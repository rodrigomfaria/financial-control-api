# API Controle Financeiro

API Restful para aplicação de controle financeiro usando Spring MVC, PostgreSQL, JPA e Hibernate.

<h1>Requisitos</h1>

<ul>
<li>Java - 1.8.x</li>
<li>Maven - 3.x.x</li>
<li>PostgreSQL - 11.x.x</li>
</ul>

<h1>Instalação</h1>
<ul>
<li>Clone o aplicativo: https://github.com/rodrigomfaria/challenge-api.git</li>
<li>Crie uma base de dados no PostgreSQL</li>
<li>Altere o nome de usuário, senha e url do PostgreSQL conforme sua instalação no arquivo application.properties</li>
<li>Construa e execute o aplicativo usando <a href="https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html">Maven</a></li>
</ul>

<h1>APIs Rest</h1>

O aplicativo define as seguintes APIs:

GET / transactions

POST / transactions

GET / transactions / {Id}

PUT / transactions / {Id}

DELETE / transactions / {Id}

Você pode testá-las utilizando o <a href="https://www.getpostman.com" target="_blank">postman</a> ou qualquer outro cliente.
