package linksharing

class Topic implements Serializable{

    String name
    User createdBy
    Date dateCreated
    Date lastUpdated
    enum VisibilityVal {PUBLIC, PRIVATE}
    VisibilityVal visibility

    static constraints = {
        name blank: false
        name unique: "createdBy"
    }

    static belongsTo = [createdBy : User]
    static hasMany = [Resource]
}
