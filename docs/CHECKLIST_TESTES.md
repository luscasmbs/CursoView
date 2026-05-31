# 📋 CHECKLIST_TESTES.md — CursoView

Este documento registra a execução sistemática dos testes manuais obrigatórios realizados no aplicativo **CursoView** (Semana 03 - Jetpack Compose Básico). A estrutura unifica a agilidade das listas de tarefas nativas do Git (`- [x]`) com o rigor de auditoria, metadados e rastreabilidade exigidos pelos critérios oficiais da WorldSkills.

---

## 1. Testes de Inicialização, Compilação e Ambiente
Mapeia a estabilidade básica do ecossistema e a integridade do ciclo de build.

- [x] **Item 1.1 — Sincronização do Motor Gradle**
  * **Cenário de Teste:** Importar o projeto no Android Studio e acionar `Sync Project with Gradle Files`.
  * **Comportamento Esperado:** Sincronização concluída com sucesso, sem falhas de dependências ou incompatibilidade de plugins.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 1.2 — Compilação Limpa (Build Execution)**
  * **Cenário de Teste:** Executar o comando `Build -> Make Project` ou `AssembleDebug` via Gradle.
  * **Comportamento Esperado:** Geração completa do artefato final sem erros de compilação em código Kotlin ou na árvore de macros do Compose.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 1.3 — Deploy e Instalação**
  * **Cenário de Teste:** Executar o app em um emulador ou dispositivo físico homologado (Pixel API 33+).
  * **Comportamento Esperado:** Transferência e instalação do APK concluídas sem erros de assinatura ou de manifesto.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 1.4 — Estabilidade de Inicialização (Anti-Crash)**
  * **Cenário de Teste:** Lançar o aplicativo a partir do launcher do sistema operacional Android.
  * **Comportamento Esperado:** A UI renderiza a tela principal imediatamente. O app não sofre fechamento inesperado (*crash on startup*).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 1.5 — Arquitetura de Inicialização Limpa**
  * **Cenário de Teste:** Inspeção estática no arquivo fonte da `MainActivity.kt`.
  * **Comportamento Esperado:** A `MainActivity` invoca o `setContent` apenas para acionar o tema e o composable estrutural principal. Lógicas de UI ou estados locais devem estar desacoplados.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 2. Interface Visual e Textos Obrigatórios Estritos
Validação de conformidade textual e presença de componentes para auditoria estrita de UI.

- [x] **Item 2.1 — Título Principal de Cabeçalho**
  * **Cenário de Teste:** Verificar visualmente o topo da hierarquia de componentes na tela principal.
  * **Comportamento Esperado:** Exibição exata e literal da string: `"Cadastro Visual de Cursos"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 2.2 — Subtítulo Informativo**
  * **Cenário de Teste:** Verificar visualmente o texto de apoio posicionado logo abaixo do cabeçalho principal.
  * **Comportamento Esperado:** Exibição exata e literal da string: `"Monte a apresentação inicial de um curso técnico."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 2.3 — Rótulos de Entrada do Formulário**
  * **Cenário de Teste:** Analisar as propriedades de rótulo (*label*) dos campos de entrada de texto ativos.
  * **Comportamento Esperado:** Presença explícita e correta das seguintes strings de identificação:
    1. `"Nome completo do curso"`
    2. `"Nome breve"`
    3. `"Categoria"`
    4. `"Carga horária"`
    5. `"Descrição curta"`
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 2.4 — Botões de Comando**
  * **Cenário de Teste:** Inspeção visual e funcional dos elementos clicáveis de ação dispostos no formulário.
  * **Comportamento Esperado:** Existência e rotulação exata dos 3 botões: `"Limpar"`, `"Validar cadastro"` e `"Carregar exemplo"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 2.5 — Container de Visualização**
  * **Cenário de Teste:** Verificar a presença do componente estrutural de espelhamento reativo na interface.
  * **Comportamento Esperado:** Presença de um componente `Card` (Material 3) exibindo o título interno fixo: `"Pré-visualização do curso"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 2.6 — Atributo de Identidade Visual**
  * **Cenário de Teste:** Analisar o comportamento de renderização do elemento gráfico de imagem local.
  * **Comportamento Esperado:** Exibição de imagem ou ícone conceitual sem distorções de proporção, estiramentos ou quebras de escala (uso correto do `ContentScale`).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 3. Estados Iniciais do Card de Pré-visualização (Campos Vazios)
Verificação do estado padrão reativo da UI antes de qualquer interação do usuário.

- [x] **Item 3.1 — Estado Inicial: Nome Breve**
  * **Cenário de Teste:** Inicializar o aplicativo (ou acionar ação de limpeza) e inspecionar a linha correspondente no Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Nome breve não informado"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 3.2 — Estado Inicial: Nome Completo**
  * **Cenário de Teste:** Inspecionar o campo do título do curso renderizado internamente no Card de visualização.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Nome completo não informado"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 3.3 — Estado Inicial: Categoria**
  * **Cenário de Teste:** Inspecionar a seção ou tag reservada à categoria contida dentro do Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Categoria pendente"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 3.4 — Estado Inicial: Carga Horária**
  * **Cenário de Teste:** Inspecionar o indicador de horas em formato textual inserido dentro do Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Carga horária pendente"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 3.5 — Estado Inicial: Descrição Curta**
  * **Cenário de Teste:** Analisar o bloco de texto reservado para o resumo informativo do curso no Card.
  * **Comportamento Esperado:** Exibição literal exata da string: `"Descrição ainda não preenchida"`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 4. Reatividade em Tempo Real (Campos Preenchidos)
Avaliação da integridade do fluxo unidirecional de dados (*Unidirectional Data Flow*) e gerenciamento de estado.

- [x] **Item 4.1 — Sincronismo Reativo Concorrente**
  * **Cenário de Teste:** Digitar dados válidos em tempo de execução nos campos do formulário de maneira alternada.
  * **Comportamento Esperado:** O Card de pré-visualização substitui os placeholders literais pelos caracteres digitados instantaneamente, caractere por caractere, comprovando a recomposição eficiente da UI baseada em `MutableState`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 5. Validações de Regra de Negócio e Feedbacks na Área de Status
Garante blindagem algorítmica e mensagens de orientação adequadas sem causar quebras no ciclo de vida da aplicação.

- [x] **Item 5.1 — Disparador de Validação Vazia**
  * **Cenário de Teste:** Manter todos os campos vazios e pressionar o botão `"Validar cadastro"`.
  * **Comportamento Esperado:** A área de status deve exibir textualmente e exatamente a string: `"Preencha os dados para gerar a visualização do curso."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.2 — Restrição de Limite Mínimo: Nome Completo**
  * **Cenário de Teste:** Preencher o formulário com dados válidos, mas inserir menos de 10 caracteres no campo `"Nome completo do curso"`, e acionar validação.
  * **Comportamento Esperado:** A área de status exibe orientação clara indicando que o nome completo inserido é muito curto (mínimo de 10 caracteres).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.3 — Restrição de Limite Máximo: Nome Breve**
  * **Cenário de Teste:** Preencher o formulário com dados válidos, mas inserir mais de 20 caracteres no campo `"Nome breve"`, e acionar validação.
  * **Comportamento Esperado:** A área de status exibe orientação clara indicando que o nome breve ultrapassou o limite permitido (máximo de 20 caracteres).
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.4 — Obrigatoriedade de Campo: Categoria**
  * **Cenário de Teste:** Preencher os demais dados corretamente, mantendo apenas o campo `"Categoria"` totalmente vazio, e acionar validação.
  * **Comportamento Esperado:** A área de status exibe orientação clara indicando que o preenchimento da categoria é obrigatório.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.5 — Obrigatoriedade de Campo: Carga Horária**
  * **Cenário de Teste:** Preencher os demais dados corretamente, mantendo apenas o campo `"Carga horária"` totalmente vazio, e acionar validação.
  * **Comportamento Esperado:** A área de status exibe orientação clara indicando que o preenchimento da carga horária é obrigatório.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.6 — Proteção Contra Tipagem Alfanumérica (Crash-Test)**
  * **Cenário de Teste:** Digitar letras ou caracteres especiais no campo `"Carga horária"` (ex: `"40h"`, `"Trinta"`) e clicar em `"Validar cadastro"`.
  * **Comportamento Esperado:** O aplicativo intercepta o valor de maneira segura (uso de `toIntOrNull()`), exibe na área de status que a carga horária deve ser estritamente numérica e **não sofre interrupção abrupta (crash)**.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.7 — Validação Numérica de Sinal (Inteiro Positivo)**
  * **Cenário de Teste:** Digitar um valor numérico menor ou igual a zero (ex: `0` ou `-45`) no campo `"Carga horária"` e acionar validação.
  * **Comportamento Esperado:** A área de status exibe orientação clara informando que a carga horária do curso deve ser um valor positivo.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.8 — Restrição de Limite Máximo: Descrição**
  * **Cenário de Teste:** Inserir um bloco de texto longo contendo mais de 120 caracteres no campo `"Descrição curta"` e acionar validação.
  * **Comportamento Esperado:** A área de status exibe orientação indicando que a descrição ultrapassou o limite máximo de caracteres permitido.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.9 — Acúmulo de Pendências Simultâneas**
  * **Cenário de Teste:** Provocar múltiplos erros de validação ao mesmo tempo (ex: nome curto E carga horária com letras) e acionar validação.
  * **Comportamento Esperado:** A área de status gerencia o estado e exibe uma notificação clara informando que existem múltiplas pendências de validação pendentes na tela.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 5.10 — Cenário de Sucesso Absoluto**
  * **Cenário de Teste:** Preencher todos os 5 campos com dados válidos respeitando todas as regras e pressionar `"Validar cadastro"`.
  * **Comportamento Esperado:** A área de status deve exibir textualmente e exatamente a string: `"Cadastro visual válido para apresentação."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 6. Comportamento das Ações dos Botões (Efeitos Colaterais)
Mapeia a execução dos manipuladores de eventos e a reconfiguração correta das árvores de estado.

- [x] **Item 6.1 — Botão "Limpar"**
  * **Cenário de Teste:** Preencher o formulário com dados ou provocar erros de validação e pressionar o botão `"Limpar"`.
  * **Comportamento Esperado:** 1. Zera todos os buffers de texto dos 5 inputs.
    2. Reseta o Card instantaneamente para os placeholders iniciais (Item 3).
    3. Atualiza o texto da área de status exatamente para: `"Formulário limpo."`.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 6.2 — Botão "Carregar exemplo"**
  * **Cenário de Teste:** Pressionar o botão `"Carregar exemplo"` a partir de qualquer estado da tela.
  * **Comportamento Esperado:** 1. Injeta automaticamente dados fictícios válidos nos 5 campos.
    2. Atualiza imediatamente a visualização do Card.
    3. Modifica a área de status exatamente para: `"Exemplo carregado para análise."`.
    4. Mantém todos os campos editáveis pós-injeção.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 7. Layout, Acessibilidade e Restrições Técnicas do Compose
Mapeia conformidade de renderização física de tela, uso correto de APIs do Material 3 e acessibilidade móvel.

- [x] **Item 7.1 — Orientação e Estabilidade Dimensional**
  * **Cenário de Teste:** Executar ou rotacionar o aplicativo em modo retrato (*Portrait*) em telas de dimensões variadas.
  * **Comportamento Esperado:** O layout se adapta à largura física disponível sem cortes de componentes e não apresenta rolagens horizontais indesejadas.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 7.2 — Rolagem Vertical e Teclado**
  * **Cenário de Teste:** Interagir com os campos mais baixos da tela abrindo o teclado virtual do sistema operacional Android.
  * **Comportamento Esperado:** A rolagem vertical opera de maneira fluida e contínua através do uso correto de modificadores (ex: `Modifier.verticalScroll()`), impedindo a oclusão de componentes.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 7.3 — Ciclo de Layout via Scaffold**
  * **Cenário de Teste:** Analisar estruturalmente a árvore de layouts vinculada à função `Scaffold`.
  * **Comportamento Esperado:** O container de conteúdo aplica obrigatoriamente os paddings internos (`PaddingValues`) fornecidos pelo `Scaffold`, prevenindo sobreposição com barras nativas do sistema.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 7.4 — Alinhamento e Sobreposição Gráfica**
  * **Cenário de Teste:** Inspecionar visualmente o posicionamento físico dos elementos em tempo de execução.
  * **Comportamento Esperado:** Elementos ordenados estritamente através de containers lineares ou caixas (`Column`, `Row`, `Box`) sem sobreposição acidental de textos, botões ou inputs.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 7.5 — Área de Clique Mínima (Acessibilidade)**
  * **Cenário de Teste:** Avaliar as dimensões de toque físicas mapeadas para os botões e áreas interativas.
  * **Comportamento Esperado:** Os elementos clicáveis respeitam a diretriz mínima de área de toque de mercado (mínimo de `48dp x 48dp`) para garantir interações acessíveis.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 7.6 — Descrição de Mídia Semântica**
  * **Cenário de Teste:** Analisar as propriedades configuradas para o parâmetro `contentDescription` do elemento `Image`.
  * **Comportamento Esperado:** O atributo contém uma string descritiva significativa para acessibilidade (leitores de tela) ou está explicitamente configurado como `null` se a mídia possuir apenas papel decorativo.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

- [x] **Item 7.7 — Implementação de Ferramental de Preview**
  * **Cenário de Teste:** Abrir a visualização de Preview do código fonte no Android Studio.
  * **Comportamento Esperado:** Identificar e compilar com sucesso pelo menos três (`3`) funções anotadas com `@Preview` distintas para validação de componentes isolados da UI.
  * **Resultado Real:** ( ) Passou  |  ( ) Falhou
  * **Evidência / Commit:**

---

## 8. Relatório Técnico de Ocorrências

### A. Falhas e Erros Detectados Durante o Desenvolvimento


### B. Correções Técnicas Aplicadas


### C. Limitações Conhecidas ou Pendências Técnicas Conscientes
