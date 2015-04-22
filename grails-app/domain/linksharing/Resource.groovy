package linksharing

abstract class Resource {

    String title
    String description
    User createdBy
    Topic topic
    Date dateCreated
    Date lastUpdated

    static constraints = {
        description blank: false, maxSize: 1024
        title unique:"topic"
    }

    static mapping = {tablePerHierarchy false}
    static belongsTo = [createdBy : User, topic : Topic]
}
