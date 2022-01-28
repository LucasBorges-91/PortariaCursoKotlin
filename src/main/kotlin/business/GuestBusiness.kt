package business

import entity.Guest

class GuestBusiness {

    fun typeValidate(typeInvate: String) = (typeInvate == "comum" || typeInvate == "premium" || typeInvate == "luxo")

    fun major( guest: Guest ) = guest.age >= 18

    fun guestValidate(guest: Guest) = when (guest.type) {
        "comum" -> guest.code.startsWith("xt")
        "premium", "luxo" -> guest.code.startsWith("xl")
        else -> false
    }
}