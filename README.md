# mildevs-pecas-api

<!---Esses são exemplos. Veja https://shields.io para outras pessoas ou para personalizar este conjunto de escudos. Você pode querer incluir dependências, status do projeto e informações de licença aqui--->

![GitHub repo size](https://img.shields.io/github/repo-size/BeatrizSouz/mildevs-pecas-api?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/BeatrizSouz/mildevs-pecas-api?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/BeatrizSouz/mildevs-pecas-api?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/BeatrizSouz/mildevs-pecas-api?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/BeatrizSouz/mildevs-pecas-api?style=for-the-badge)



> Projeto API de peças de uma carro com Spring Rest, que realiza as operações de criar, listar, atualizar e deletar as peças, além de conter validações de entrada e tratamento de exceções.

## 💻 Tecnologias usadas
![java logo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![spring logo](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![postgresql logo](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![postman logo](https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![hibernate logo](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)
![github logo](https://img.shields.io/badge/Git-E34F26?style=for-the-badge&logo=git&logoColor=white)


## 🔧 Modelo de relacionamento

![image](https://user-images.githubusercontent.com/112733336/219743684-bb999daf-8c97-49bd-b2c6-c199f818b669.png)



## ⚙ Funções:

O projeto abragem as seguintes tarefas:

- [x] Criar peças
- [x] Atualizar peças
- [x] Listar todas as peças
- [x] Buscar peças por código de barra
- [x] Buscar peças pelo seu modelo
- [x] Buscar peças pelo sua categoria
- [x] Atualiza peça pelo seu código de barra
- [x] Remove peça pelo seu código de barra

## ☕ Usando mildevs-pecas-api

Para usar mildevs-pecas-api, siga estas etapas:

Observe que no arquivo `application.properties`, o schema está configurado com o nome “pecas”, crie um  schema em seu banco com o mesmo nome:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/mildevs?currentSchema=pecas
spring.jpa.properties.default_schema=pecas
```
Também fique atento para seu nome de usuário e senha do seu banco de dados, por padrão a senha e usuário são: 
```
spring.datasource.username=postgres
spring.datasource.password=123456

```

## 😄 Contato da desenvolvedora <br>
<p>

<div align="left"> 
  <a href = "mailto:beatrizdesouzacarvalho@outlook.com"><img  height="28cm" src="https://img.shields.io/badge/Outlook-email-blue" target="_blank"></a>
  <a href="https://www.linkedin.com/in/beatriz-de-souza-carvalho/" target="_blank"><img height="28cm" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>    
</div>	

[⬆ Voltar ao topo](#mildevs-pecas-api)<br>
