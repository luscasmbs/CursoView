package com.example.projetoteste.model

data class ValidationCourseResult(
    val course: CourseData
) {
    val messages: List<String>
        get() {
            val errors = mutableListOf<String>()

            if (course.completename.length < 10) {
                errors.add("O nome completo deve ter no mínimo 10 caracteres.")
            }

            if (course.shortname.length > 20) {
                errors.add("O nome breve deve ter no máximo 20 caracteres.")
            }

            if (course.type.isBlank()) {
                errors.add("A categoria é obrigatória.")
            }

            if (course.worktime.toIntOrNull() == null || course.worktime.toIntOrNull()!! <= 0) {
                errors.add("A carga horária deve ser um número inteiro positivo.")
            }

            if (course.shortdescription.length > 120) {
                errors.add("A descrição curta deve ter no máximo 120 caracteres.")
            }

            return errors
        }

    val valid: Boolean
        get() = messages.isEmpty()

    val message: String
        get() = when {
            valid -> "Cadastro visual válido para apresentação."
            messages.size == 1 -> messages.first()
            else -> "Existem múltiplas pendências no cadastro."
        }
}
