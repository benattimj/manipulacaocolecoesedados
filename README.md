Este projeto foi desenvolvido com o objetivo de praticar manipulação de dados e coleções em Java, utilizando List, Map, Streams e Collectors.
A aplicação trabalha com uma lista de objetos Aluno e realiza operações comuns do dia a dia em sistemas reais, como filtragem, agrupamento, ordenação e remoção de duplicatas.

🛠️ Tecnologias Utilizadas

Java 17+
Collections Framework (List, Map, Set)
Java Streams API
Comparator
Collectors
equals() e hashCode()

🧱 Estrutura do Projeto
src/
 ├── model/
 │   └── Aluno.java
 └── service/
     └── AlunoService.java


model: contém a entidade Aluno

service: contém as regras de negócio e manipulação de dados


👤 Classe Aluno

A classe Aluno representa a entidade principal do sistema e contém:

Nome do aluno
Curso
Nota final

Destaques:

Implementação de equals() e hashCode() para permitir remoção de duplicatas
Método isAprovado() para encapsular a regra de aprovação
toString() para facilitar a visualização dos dados

⚙️ Funcionalidades Implementadas
1️⃣ Filtrar alunos aprovados
filter(Aluno::isAprovado)


O que foi feito:
Filtragem de alunos com nota maior ou igual a 7.

Por que foi usado:
Evita loops manuais e deixa o código mais legível e funcional.

2️⃣ Filtrar alunos reprovados
filter(a -> !a.isAprovado())


O que foi feito:
Criação de uma lista apenas com alunos reprovados.

Diferencial:
Reutilização da regra de negócio já existente.

3️⃣ Agrupar alunos por curso
Collectors.groupingBy(Aluno::getCurso)


O que foi feito:
Agrupamento de alunos por curso usando Map<String, List<Aluno>>.

Por que usar Map:
Cada curso é a chave, e os alunos pertencentes a ele ficam em uma lista.

4️⃣ Contar alunos por curso
Collectors.groupingBy(
    Aluno::getCurso,
    Collectors.counting()
)


O que foi feito:
Contagem automática de quantos alunos existem em cada curso.

Uso real:
Relatórios, dashboards e métricas.

5️⃣ Remover alunos duplicados
new HashSet<>(alunos)


O que foi feito:
Remoção de duplicatas com base em nome e curso.

Fundamento:
HashSet utiliza equals() e hashCode() para identificar objetos iguais.

6️⃣ Ordenar alunos por nota (decrescente)
sorted(Comparator.comparingDouble(Aluno::getNota).reversed())


O que foi feito:
Ordenação dos alunos da maior para a menor nota.

Por que usar Comparator:
Forma moderna, segura e legível de ordenar dados.

🧠 Aprendizados do Projeto

Uso prático de Streams API

Diferença entre List, Set e Map

Importância de equals() e hashCode()

Escrita de código mais limpo e funcional

Estruturação de projeto seguindo boas práticas
