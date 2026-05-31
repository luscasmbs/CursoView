package com.example.projetoteste.model

data class CourseData(
    val completename: String =  "",
    val shortname: String =  "",
    val type: String =  "",
    val worktime: String =  "",
    val shortdescription: String=  "",
    ){
        companion object{
            fun examplemodel(): CourseData{
                return CourseData(
                    completename = "Curso Técnico em Análise e Desenvolvimento de Sistemas",
                    shortname = "ADS",
                    type = "Tecnologia da Informação",
                    worktime = "1200",
                    shortdescription = "Formação técnica para criar apps e sites."
                )
            }
        }
}

