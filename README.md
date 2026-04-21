## Tasks API - Desafio Turing

Esta é uma aplicação focada em Back-End desenvolvida para o processo seletivo da Empresa Júnior **Turing**. O projeto consiste em um sistema de gerenciamento de tarefas (To-Do List) que permite o controle total sobre o ciclo de vida de atividades, integrando um back-end robusto em Java com uma interface simples de usuário dinâmica e responsiva.

---

### Tecnologias Utilizadas
 - **Java 21:** Versão estável e moderna da linguagem.
 - **Spring Boot 3:** Framework para construção da API REST.
 - **Spring Data JPA:** Abstração da camada de persistência.
 - **Postgres:** Banco de dados.
 - **Lombok:** Redução de código boilerplate (Getters/Setters).
 - **Maven:** Gerenciador de dependências e automação de build.
 - **Vanilla JavaScript:** Comunicação assíncrona com a API (Fetch API).
 - **CSS3:** Estilização personalizada e layout responsivo.

### Modelagem de Dados
O sistema baseia-se em uma entidade principal:
 - **Tarefa (Task):** Entidade que armazena o identificador, título, descrição, status de conclusão e a data de criação. A data é gerada automaticamente pelo sistema no momento do cadastro.

### Funcionalidades Principais
 - **Gerenciamento Completo (CRUD):** Criação, listagem, edição e exclusão de tarefas.

 - **Interface Dinâmica:** Atualização em tempo real da lista de tarefas sem necessidade de recarregar a página.

 - **Edição Avançada:** Permite alterar o título, a descrição e o status de tarefas já existentes através de uma interface intuitiva.

 - **Controle de Status:** Botão de ação rápida para alternar entre pendente e concluído.

 - **Histórico Cronológico:** Exibição da data de criação da tarefa formatada no padrão brasileiro.

 - **Layout Responsivo:** Interface que se adapta automaticamente a telas de computadores e dispositivos móveis.

### Endpoints
| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| POST | /tarefa | Cadastra uma nova tarefa |
| GET | /tarefa | Lista todas as tarefas cadastradas |
| PUT | /tarefa/{id} | Alterna o status (Concluído/Pendente) |
| PUT | /tarefa/atualizar/{id} | Atualiza título, descrição e status |
| DELETE | /tarefa/{id} | Remove uma tarefa permanentemente |

---

### Como Executar
1. Clone o repositório em sua máquina local.
2. Certifique-se de ter o **JDK 21** configurado.
3. Execute a aplicação através do Maven:
   ```bash
   mvn spring-boot:run
