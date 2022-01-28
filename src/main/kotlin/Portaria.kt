import java.nio.file.Files.readString

class Portaria {

    fun controle() {
        val idade = Console.readInt( "Qual sua idade?" )
        if ( idade < 18 ) {
            println( "Negado. Menores de idade não são permitidos!" )
            return
        }

        val tipoConvite = Console.readString( "Qual é o tipo de convite?" )
    }
}