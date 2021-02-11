# API Controle Financeiro

API Restful para aplicação de controle financeiro usando Spring Boot, PostgreSQL e JPA.

<h1>Requisitos</h1>

<ul>
<li>Java - 1.8.x</li>
<li>Spring Tool Suite - 4.x.x</li>
<li>PostgreSQL - 11.x.x</li>
</ul>

<h1>Instalação</h1>
<ul>
<li>Clone o aplicativo: https://github.com/rodrigomfaria/financial-control-api.git</li>
<li>Altere a url do PostgreSQL conforme sua instalação no arquivo application.properties ou no mesmo arquivo configure para a opção test</li>
</ul>

<h1>APIs Rest</h1>

O aplicativo define as seguintes APIs:

GET / transactions

POST / transactions

GET / transactions / {Id}

PUT / transactions / {Id}

DELETE / transactions / {Id}

Você pode testá-las utilizando o <a href="https://www.getpostman.com" target="_blank">postman</a> ou qualquer outro cliente.
