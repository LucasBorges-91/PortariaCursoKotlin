package control

import business.InviteBusiness

class Lobby {

    private val inviteBusiness = InviteBusiness()

    init {
        println( "Portaria inicializada" )
        println( controle() )
    }

    fun controle(): String {
        val idade = Console.readInt( "Qual sua idade?" )
        if ( idade < 18 ) {
             return "Negado. Menores de idade não são permitidos!"

        }

        val typeInvite = Console.readString( "Qual é o tipo de convite?" )
        if ( !inviteBusiness.typeValidate( typeInvite ) ) {
            return "Negado. Convite inválido!"
        }

        val codeInvite = Console.readString( "Qual é o código do convite?" )
        if ( !inviteBusiness.codeValidate( codeInvite, typeInvite ) ) {
            return "Negado. Convite inválido!"
        }

        return "TODO!"
    }
}