# Tema 
## Model
| Atributo | Tipo                |
|----------|---------------------|
| id       | int (PK)            |
| assunto  | String              |
| postagem | List<ModelPostagem> |

## Crud
| Método | Endpoint                | Descrição                              |
|--------|-------------------------|----------------------------------------|
| GET    | /tema                   | Retorna lista de todos os temas        |
| GET    | /tema/{id}              | Retorna tema por id                    |
| GET    | /tema/assunto/{assunto} | Retorna lista de postagens por assunto |
| PUT    | /tema                   | Edita tema por id                      |
| POST   | /tema                   | Cria novo tema                         |
| DELETE | /tema/{id}              | Exclui tema por id                     |

# Postagem
## Model
| Atributo | Tipo                |
|----------|---------------------|
| id       | int (PK)            |
| descricao  | String              |
| tag | String |
| link | String |
| interacao | int |
| usuario_id | int |
| tema_id | int |

## Crud
| Método | Endpoint                        | Descrição                                |
|--------|---------------------------------|------------------------------------------|
| GET    | /postagem                       | Retorna lista de todas as postagens      |
| GET    | /postagem/descricao/{descricao} | Retorna lista de postagens por descrição |
| GET    | /postagem/tag/{tag}             | Retorna lista de postagens por tag       |
| GET    | /postagem/{id}                  | Retorna postagem por id                  |
| PUT    | /postagem                       | Edita postagem por id                    |
| PUT    | /postagem/{idPostagem}          | Atualiza quantidade de interações        |
| POST   | /postagem                       | Cria nova postagem                       |
| DELETE | /postagem/{id}                  | Exclui postagem por id                   |

# Usuario
## Model
| Atributo | Tipo                |
|----------|---------------------|
| id       | int (PK)            |
| nome_completo  | String              |
| email | String |
| senha | String |
| contato | String |

## Crud
| Método | Endpoint            | Descrição                          |
|--------|---------------------|------------------------------------|
| GET    | /usuarios           | Retorna lista de todos os usuários |
| GET    | /usuarios/{id}      | Retorna usuário por id             |
| POST   | /usuarios/cadastrar | Cadastra novo usuário              |
| POST   | /usuarios/logar     | Autentica login do usuário         |
| PUT    | /usuarios           | Edita usuário                      |
