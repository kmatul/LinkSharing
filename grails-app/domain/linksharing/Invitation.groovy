package linksharing

class Invitation {

    User sender
    String receiver
    String token
    Date dateCreated

    static constraints = {
        receiver email: true, blank: false
        token blank: false
    }

    static belongsTo = [sender : User]
}
