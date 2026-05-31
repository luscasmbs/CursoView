# CursoView

Aplicativo Android nativo desenvolvido em Kotlin com Jetpack Compose e Material 3 para o cadastro visual de cursos técnicos e profissionalizantes.

## Objetivo

O CursoView permite preencher dados de um curso, acompanhar uma pré-visualização em card, carregar um exemplo, limpar o formulário e validar as informações digitadas.

## Funcionalidades

- Tela principal com o título `Cadastro Visual de Cursos`.
- Subtítulo `Monte a apresentação inicial de um curso técnico.`.
- Formulário com os campos obrigatórios:
  - Nome completo do curso
  - Nome breve
  - Categoria
  - Carga horária
  - Descrição curta
- Pré-visualização dinâmica do curso.
- Botões de ação:
  - Limpar
  - Validar cadastro
  - Carregar exemplo
- Área de status para orientar o usuário.
- Rolagem vertical para uso em smartphone.

## Como executar

1. Abra o projeto no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Selecione um emulador ou dispositivo físico Android.
4. Execute o app pelo botão `Run`.

Também é possível compilar pelo terminal:

```powershell
.\gradlew.bat assembleDebug
```

## Estrutura do projeto

```text
app/src/main/java/com/example/projetoteste
├── MainActivity.kt
├── model
│   ├── CourseData.kt
│   └── ValidationCourseResult.kt
└── ui
    ├── components
    │   ├── CourseFormSection.kt
    │   ├── CoursePreviewCard.kt
    │   ├── CourseTextField.kt
    │   ├── CursoViewHeader.kt
    │   ├── FormActions.kt
    │   └── StatusCard.kt
    ├── screens
    │   └── CadastroCursos.kt
    └── theme
```

## Decisões técnicas

- A `MainActivity` apenas inicia o tema e chama a tela principal.
- A tela `CadastroCursos` concentra o estado local do formulário.
- Os componentes foram separados por responsabilidade visual.
- A validação foi isolada em `ValidationCourseResult`.
- O `Scaffold` é usado como estrutura principal da tela.
- A `Column` principal usa rolagem vertical para funcionar melhor em celulares.
- O card de pré-visualização usa `Card` do Material 3.

## Validações

O app valida:

- Nome completo com no mínimo 10 caracteres.
- Nome breve com no máximo 20 caracteres.
- Categoria obrigatória.
- Carga horária como número inteiro positivo.
- Descrição curta com no máximo 120 caracteres.
- Múltiplas pendências quando houver mais de um erro.

## Documentação e evidências

- Checklist de testes: [docs/CHECKLIST_TESTES.md](docs/CHECKLIST_TESTES.md)
- Evidências de execução: [docs/EVIDENCIAS.md](docs/EVIDENCIAS.md)
- Imagens das evidências: [docs/evidencias](docs/evidencias)
