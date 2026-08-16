### Controle de Estoque - API REST 
(Projeto feito com auxílio de IA)

API REST de gerenciamento de estoque de produtos, desenvolvida em estudo de back-end com Java e Spring Boot.

Tecnologias:

Java 26, 
Spring Boot,
Anthropic API (Claude),
Spring Data JPA,
H2 Database,
Maven


 Funcionalidades:
1. CRUD completo de produtos (Creat, Read, Update, Delete)
2. Validação de dados (nome obrigatório, preço positivo)
3. Tratamento de erros (404,400)
4. Geração de insights sobre o estoque usando IA

Endpoints da API

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/produtos` | Lista todos os produtos |
| GET | `/produtos/{id}` | Busca um produto pelo ID |
| GET | `/produtos/insights` | Gera uma análise inteligente do estoque via IA |
| POST | `/produtos` | Cria um novo produto |
| PUT | `/produtos/{id}` | Atualiza um produto existente |
| DELETE | `/produtos/{id}` | Remove um produto |

Como rodar
1. Clonar o repositório
2. Rodar: ./mvnw spring-boot:run
3. Acessar: http://localhost:8080/produtos

Configuração da IA (Opcional)

Para usar o endpoint de insights, é necssário uma chave de API da Anthropic:

1. Acesse com sua conta [console.anthropic.com](https://console.anthropic.com)
2. Gere uma API Key
3. Configure a variável de ambiente antes de rodar o projeto:

```bash
export ANTHROPIC_API_KEY=sua-chave-aqui
```

Sem essa configuração, todos os outros endpoints (CRUD de produtos) continuam funcionando normalmente, apenas o `/produtos/insights` depende dela.

Você pode testar os endpoints usando (https://www.postman.com/) ou `curl`:

```bash
curl http://localhost:8080/produtos
```

#### Melhorias futuras:
1. Refinar a resposta do endpoint de insight (extrair só o texto, sem os metadados da API)
2. Migração para banco de dados PostgreSQL

#### Autor: 
Guilherme Abreu 

- LinkedIn: linkedin.com/in/guilhermeacarvalho
- GitHub: github.com/guilhermeabreu-code
