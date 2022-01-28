package control

import business.GuestBusiness
import entity.Guest

class Lobby {

    private val guestBusiness = GuestBusiness()

    init {
        println( "Portaria inicializada" )
        println( controle() )
    }

    fun controle(): String {
        val age = Console.readInt( "Qual sua idade?" )
        val guest = Guest( age = age )
        if ( !guestBusiness.major( guest ) ) {
             return "Negado. Menores de idade não são permitidos!"
        }

        guest.type = Console.readString( "Qual é o tipo de convite?" )
        if ( !guestBusiness.typeValidate( guest.type ) ) {
            return "Negado. Convite inválido!"
        }

        guest.code = Console.readString( "Qual é o código do convite?" )

        if ( !guestBusiness.guestValidate( guest ) ) {
            return "Negado. Convite inválido!"
        }

        return "Welcome"
    }
}