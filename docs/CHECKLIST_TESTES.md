# 📋 CHECKLIST_TESTES.md — CursoView

Este documento registra a execução sistemática dos testes manuais obrigatórios realizados no aplicativo **CursoView** (Semana 03 - Jetpack Compose Básico). A estrutura unifica a agilidade das listas de tarefas nativas do Git (`- [ ]`) com o rigor de auditoria, metadados e rastreabilidade exigidos pelos critérios oficiais da WorldSkills.

---

## 1. Testes de Inicialização, Compilação e Ambiente
Mapeia a estabilidade básica do ecossistema e a integridade do ciclo de build.

- [ ] **Item 1.1 — Sincronização do Motor Gradle**
  * **Cenário de Teste:** Importar o projeto no Android Studio e acionar `Sync Project with Gradle Files`.
  * **Comportamento Esperado:** Sincronização concluída com sucesso, sem falhas de dependências ou incompatibilidade de plugins.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 1.2 — Compilação Limpa (Build Execution)**
  * **Cenário de Teste:** Executar o comando `Build -> Make Project` ou `AssembleDebug` via Gradle.
  * **Comportamento Esperado:** Geração completa do artefato sem erros de compilação em código Kotlin ou na árvore de macros do Compose.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 1.3 — Deploy e Instalação**
  * **Cenário de Teste:** Executar o app em um emulador ou dispositivo físico homologado (Pixel API 33+).
  * **Comportamento Esperado:** Transferência e instalação do APK concluídas sem erros de assinatura ou de manifesto.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 1.4 — Estabilidade de Inicialização (Anti-Crash)**
  * **Cenário de Teste:** Lançar o aplicativo a partir do launcher do sistema operacional Android.
  * **Comportamento Esperado:** A UI renderiza a tela principal imediatamente. O app não sofre fechamento inesperado (*crash on startup*).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 1.5 — Arquitetura de Inicialização Limpa**
  * **Cenário de Teste:** Inspeção estática no arquivo fonte da `MainActivity.kt`.
  * **Comportamento Esperado:** A `MainActivity` invoca o `setContent` apenas para acionar o tema e o composable estrutural principal. Nenhuma lógica de UI ou estados locais do formulário devem estar centralizados nesta classe.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 2. Interface Visual e Textos Obrigatórios Estritos
Validação de conformidade textual e presença de componentes para auditoria estrita de UI.

- [ ] **Item 2.1 — Título Principal de Cabeçalho**
  * **Cenário de Teste:** Localizar o componente de texto posicionado no topo da hierarquia visual.
  * **Comportamento Esperado:** Exibir exatamente a string: `"Cadastro Visual de Cursos"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 2.2 — Subtítulo Informativo**
  * **Cenário de Teste:** Localizar o texto de apoio posicionado logo abaixo do título principal.
  * **Comportamento Esperado:** Exibir exatamente a string: `"Monte a apresentação inicial de um curso técnico."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 2.3 — Rótulos de Entrada do Formulário**
  * **Cenário de Teste:** Inspeção visual dos 5 campos de texto (`TextField`/`OutlinedTextField`) disponíveis.
  * **Comportamento Esperado:** Identificar exatamente as seguintes labels configuradas:
    1. `"Nome completo do curso"`
    2. `"Nome breve"`
    3. `"Categoria"`
    4. `"Carga horária"`
    5. `"Descrição curta"`
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 2.4 — Botões de Comando**
  * **Cenário de Teste:** Inspeção visual dos elementos clicáveis de ação do formulário.
  * **Comportamento Esperado:** Identificar os 3 botões com os textos exatos: `"Limpar"`, `"Validar cadastro"` e `"Carregar exemplo"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 2.5 — Container de Visualização**
  * **Cenário de Teste:** Verificar a presença do componente estrutural de espelhamento.
  * **Comportamento Esperado:** Presença visível de um componente `Card` (Material 3) com o título fixo de seção: `"Pré-visualização do curso"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 2.6 — Atributo de Identidade Visual**
  * **Cenário de Teste:** Analisar a renderização do elemento gráfico de imagem local.
  * **Comportamento Esperado:** Exibição de imagem/ícone educativo sem estiramentos, distorções de proporção ou quebras de escala (uso correto do `ContentScale`).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 3. Estados Iniciais do Card de Pré-visualização (Campos Vazios)
Verificação do estado padrão reativo da UI antes da interação do usuário.

- [ ] **Item 3.1 — Estado Inicial: Nome Breve**
  * **Cenário de Teste:** Abrir o app ou acionar o botão limpar e observar a linha correspondente no Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Nome breve não informado"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 3.2 — Estado Inicial: Nome Completo**
  * **Cenário de Teste:** Observar o campo correspondente ao nome completo renderizado internamente no Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Nome completo não informado"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 3.3 — Estado Inicial: Categoria**
  * **Cenário de Teste:** Observar a seção ou tag de categoria contida dentro do Card de visualização.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Categoria pendente"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 3.4 — Estado Inicial: Carga Horária**
  * **Cenário de Teste:** Observar o indicador de horas em formato textual inserido dentro do Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Carga horária pendente"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 3.5 — Estado Inicial: Descrição Curta**
  * **Cenário de Teste:** Analisar o bloco de texto reservado para o resumo informativo do curso no Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Descrição ainda não preenchida"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 4. Reatividade em Tempo Real (Campos Preenchidos)
Avaliação da integridade do fluxo unidirecional de dados (*Unidirectional Data Flow*) e propagação de estado.

- [ ] **Item 4.1 — Sincronismo Reativo Concorrente**
  * **Cenário de Teste:** Digitar dados válidos em tempo de execução nos 5 campos do formulário de maneira alternada.
  * **Comportamento Esperado:** O Card de pré-visualização deve substituir os placeholders literais pelos caracteres digitados instantaneamente, caractere por caractere, provando a recomposição eficiente da UI baseada em estados reativos mutáveis (`MutableState`).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 5. Validações de Regra de Negócio e Feedbacks na Área de Status
Garante blindagem algorítmica e mensagens de orientação adequadas sem causar quebras no ciclo de vida da aplicação.

- [ ] **Item 5.1 — Disparador de Validação Vazia**
  * **Cenário de Teste:** Manter todos os campos vazios e pressionar o botão `"Validar cadastro"`.
  * **Comportamento Esperado:** A área de status deve exibir textualmente e exatamente a string: `"Preencha os dados para gerar a visualização do curso."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.2 — Restrição de Limite Mínimo: Nome Completo**
  * **Cenário de Teste:** Inserir um texto com menos de 10 caracteres no campo `"Nome completo do curso"` e acionar validação.
  * **Comportamento Esperado:** A área de status exibe a orientação de que o nome completo precisa ser mais descritivo.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.3 — Restrição de Limite Máximo: Nome Breve**
  * **Cenário de Teste:** Inserir uma string com mais de 20 caracteres no campo `"Nome breve"` e acionar validação.
  * **Comportamento Esperado:** A área de status exibe a orientação de que o nome breve deve ser reduzido.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.4 — Obrigatoriedade de Campo: Categoria**
  * **Cenário de Teste:** Preencher os demais dados corretamente, mantendo o campo `"Categoria"` vazio e acionar validação.
  * **Comportamento Esperado:** A área de status exibe a orientação de que a categoria é obrigatória.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.5 — Obrigatoriedade de Campo: Carga Horária**
  * **Cenário de Teste:** Preencher os demais dados corretamente, mantendo o campo `"Carga horária"` vazio e acionar validação.
  * **Comportamento Esperado:** A área de status exibe a orientação de que a carga horária é obrigatória.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.6 — Proteção Contra Tipagem Alfanumérica (Crash-Test)**
  * **Cenário de Teste:** Digitar letras ou caracteres especiais no campo `"Carga horária"` (ex: `"40h"`, `"Trinta"`, `"@12"`) e acionar validação.
  * **Comportamento Esperado:** O aplicativo intercepta o valor usando tratamento seguro (ex: `toIntOrNull()`), exibe orientação de que a carga horária deve ser numérica e **não sofre crash** por `NumberFormatException`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.7 — Validação Numérica de Sinal (Inteiro Positivo)**
  * **Cenário de Teste:** Digitar um valor numérico menor ou igual a zero (ex: `0` ou `-60`) no campo `"Carga horária"` e acionar validação.
  * **Comportamento Esperado:** A área de status exibe a orientação de que a carga horária deve ser positiva.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.8 — Restrição de Limite Máximo: Descrição**
  * **Cenário de Teste:** Inserir um texto longo contendo mais de 120 caracteres no campo `"Descrição curta"` e acionar validação.
  * **Comportamento Esperado:** A área de status exibe a orientação de que a descrição ultrapassou o limite permitido.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.9 — Acúmulo de Pendências Simultâneas**
  * **Cenário de Teste:** Provocar intencionalmente múltiplos erros na interface simultaneamente (ex: nome curto e carga horária contendo letras) e acionar validação.
  * **Comportamento Esperado:** A área de status informa explicitamente que existem múltiplas pendências na tela.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 5.10 — Cenário de Sucesso Absoluto**
  * **Cenário de Teste:** Preencher todos os 5 campos do formulário com entradas válidas de acordo com todas as regras e acionar validação.
  * **Comportamento Esperado:** A área de status deve exibir textualmente e exatamente a string: `"Cadastro visual válido para apresentação."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 6. Comportamento das Ações dos Botões (Efeitos Colaterais)
Mapeia a execução dos manipuladores de eventos e a reconfiguração correta das árvores de estado.

- [ ] **Item 6.1 — Botão "Limpar"**
  * **Cenário de Teste:** Preencher o formulário com dados/erros e pressionar o botão `"Limpar"`.
  * **Comportamento Esperado:** 1. Zera todos os buffers de texto dos 5 campos do formulário.
    2. Reseta imediatamente o Card de pré-visualização para os placeholders iniciais (Item 3).
    3. Atualiza o texto da área de status exatamente para: `"Formulário limpo."`.
    4. Não provoca vazamento de memória ou travamentos.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 6.2 — Botão "Carregar exemplo"**
  * **Cenário de Teste:** Pressionar o botão `"Carregar exemplo"` em qualquer estado de execução.
  * **Comportamento Esperado:**
    1. Injeta de forma automática dados fictícios válidos em conformidade estrutural nos 5 campos do formulário.
    2. Atualiza imediatamente a visualização do Card com os dados inseridos.
    3. Modifica o texto da área de status exatamente para: `"Exemplo carregado para análise."`.
    4. Preserva o formulário totalmente editável (o usuário pode alterar o texto injetado imediatamente após a ação).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 7. Layout, Acessibilidade e Restrições Técnicas do Compose
Mapeia conformidade de renderização física de tela, uso correto de APIs do Material 3 e acessibilidade móvel.

- [ ] **Item 7.1 — Orientação e Estabilidade Dimensional**
  * **Cenário de Teste:** Rotacionar ou travar o dispositivo em modo retrato (*Portrait*) e testar em telas de tamanho padrão.
  * **Comportamento Esperado:** O layout se adapta à largura disponível sem quebrar e não apresenta nenhuma rolagem horizontal indesejada.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 7.2 — Rolagem Vertical e Teclado**
  * **Cenário de Teste:** Preencher os campos inferiores e abrir o teclado do sistema, forçando o estouro de conteúdo da tela.
  * **Comportamento Esperado:** A rolagem vertical opera de maneira fluida e contínua através do uso correto de modificadores (ex: `Modifier.verticalScroll()`), mantendo os elementos acessíveis.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 7.3 — Ciclo de Layout via Scaffold**
  * **Cenário de Teste:** Verificar o acoplamento do layout principal com a função `Scaffold`.
  * **Comportamento Esperado:** O container principal consome e aplica obrigatoriamente os paddings internos (`PaddingValues`) fornecidos pelo `Scaffold`, prevenindo ocultamento de componentes pelas barras nativas do sistema.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 7.4 — Alinhamento e Sobreposição Gráfica**
  * **Cenário de Teste:** Analisar as intersecções de elementos gráficos em tempo de execução.
  * **Comportamento Esperado:** Componentes visuais organizados estritamente em estruturas lineares/caixas (`Column`, `Row`, `Box`) sem sobreposições não planejadas de textos, botões ou inputs.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 7.5 — Área de Clique Mínima (Acessibilidade)**
  * **Cenário de Teste:** Avaliar as dimensões físicas dos botões e áreas editáveis na tela.
  * **Comportamento Esperado:** Os elementos interativos respeitam as especificações mínimas de área de toque (mínimo de `48dp x 48dp`) para garantir interações confortáveis.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 7.6 — Descrição de Mídia Semântica**
  * **Cenário de Teste:** Verificar o parâmetro `contentDescription` do componente `Image`.
  * **Comportamento Esperado:** O atributo contém uma string descritiva significativa para leitores de tela caso a imagem traga conteúdo informativo. Se a imagem for estritamente estética/decorativa, o parâmetro está definido explicitamente como `null` e a decisão técnica correspondente foi documentada no `README.md`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** - [ ] **Item 7.7 — Implementação de Ferramental de Preview**
  * **Cenário de Teste:** Abrir a visualização de Preview do código no Android Studio.
  * **Comportamento Esperado:** Localizar e renderizar com sucesso pelo menos três (`3`) funções anotadas com `@Preview` distintas para validação estática de componentes isolados da UI.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:** ---

## 8. Relatório Técnico de Ocorrências (Preenchimento Manual do Competidor)

### A. Falhas e Erros Detectados Durante o Desenvolvimento
* Registre aqui problemas de runtime encontrados durante as iterações do código (ex: Loops de recomposição infinita, quebra de layout com teclado ativo, crashes ao tentar converter caracteres inválidos em campos numéricos).

### B. Correções Técnicas Aplicadas
* Descreva a engenharia de correção adotada no código Kotlin/Compose (ex: implementação de `toIntOrNull()` para mitigar quebras, aplicação do modificador `verticalScroll` acoplado ao estado de rolagem, uso correto de `remember` para persistência local de estados de UI).

### C. Limitações Conhecidas ou Pendências Técnicas Conscientes
* Declare se a entrega atual atende a 100% das regras estipuladas no briefing da Semana 03 ou mapeie eventuais restrições remanescentes que precisariam ser mitigadas em sprints futuros.
