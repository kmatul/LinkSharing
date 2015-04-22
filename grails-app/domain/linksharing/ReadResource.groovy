package linksharing

class ReadResource {

    Resource resource
    User user
    boolean isRead = false

    static constraints = {
    }

    static belongsTo = [resource : Resource, user : User]
}
