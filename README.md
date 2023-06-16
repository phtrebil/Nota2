# Nota2

O Nota2 é um aplicativo que permite criar, visualizar, atualizar e excluir notas com informações de texto, bem como imagens. Ele utiliza diversos componentes e bibliotecas populares do Android para fornecer uma experiência de CRUD (Create, Read, Update, Delete) eficiente e sincronizada.

## Recursos Principais

- CRUD de notas: Crie, leia, atualize e exclua notas com facilidade.
- Suporte a texto e imagens: Adicione informações de texto (título e descrição) e também imagens às suas notas.
- RecyclerView: Utiliza o RecyclerView para exibir as listas de notas, proporcionando um desempenho eficiente.
- Coroutines: Utiliza a biblioteca Coroutines para lidar com operações assíncronas e concorrência.
- Flow: Utiliza o Flow, uma API reativa, para fornecer uma experiência de programação assíncrona e baseada em eventos.
- Room Database: Utiliza a biblioteca Room para persistir as notas localmente no dispositivo.
- UUID versão 4: Utiliza UUIDs (Identificadores Únicos Universais) na versão 4 para atribuir identificadores únicos às notas.
- Retrofit: Utiliza a biblioteca Retrofit para fazer chamadas de API Web para sincronizar o banco de dados local com as informações da API.
- Sincronização: Utiliza flags para controlar a sincronização entre o banco de dados local e a API Web, garantindo que as informações estejam sempre atualizadas.

## Requisitos de Instalação e Configuração

1. Certifique-se de ter o Android Studio instalado.
2. Clone este repositório: `git clone https://github.com/seu-usuario/nota2.git`
3. Abra o projeto no Android Studio.
4. Certifique-se de ter as dependências corretamente configuradas no arquivo `build.gradle`.
5. Execute o aplicativo em um dispositivo Android ou emulador.

## Contribuição

Contribuições são bem-vindas! Se você encontrar problemas, tiver ideias ou quiser adicionar novos recursos, fique à vontade para abrir uma issue ou enviar uma pull request.

| :placard: Vitrine.Dev |     |
| -------------  | --- |
| :sparkles: Nome        | **Nota2**
| :label: Tecnologias | Kotlin, coroutines, flow, room, retrofit, recyclerView, UUIDv4, flags.
| :rocket: URL         | https://github.com/phtrebil/Nota2
| :fire: Desafio     | https://github.com/phtrebil/Nota2
