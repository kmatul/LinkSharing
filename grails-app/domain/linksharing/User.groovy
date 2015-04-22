package linksharing

class User {

    String userName
    String email
    String password
    String firstName
    String lastName
    byte[] photo
    boolean admin = false
    boolean active = true
    Date dateCreated
    Date lastUpdated
    String fullName

    static transients = ['fullName']

    static constraints = {
        userName blank: false, unique: true, matches: "[a-zA-Z]+"
        email blank: false, unique: true, email: true
        password blank: false, password: true, size: 6..15
        firstName blank: false
        lastName nullable: true
        photo nullable: true

    }

    static hasMany = [topic : Topic]

    /**
     * Get user's full name
     * @return
     */
    String getFullName(){
        this.fullName = "${this.firstName} ${this.lastName}"
        return this.fullName
    }
}
