package mx.ipn.upiicsa.clases.Entidades


import java.time.LocalDate

class Persona(var id : Int,
              var nombre : String,
              var primerApellido : String,
              var segundoApellido : String,
              var nacimiento : LocalDate) {
    var genero : Genero ?= null

}