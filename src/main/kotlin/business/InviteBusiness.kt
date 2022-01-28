package business

class InviteBusiness {

    fun typeValidate(typeInvate: String) = (typeInvate == "comum" || typeInvate == "premium" || typeInvate == "luxo")
    fun codeValidate(codeInvite: String, typeInvite: String): Boolean {
        if ( typeInvite == "comum" && codeInvite.startsWith( "xt" ) ) {
            return true
        } else if ( ( typeInvite == "premium" || typeInvite == "luxo" ) && codeInvite.startsWith( "xl" ) ) {
            return true
        } else {
            return false
        }
    }

}