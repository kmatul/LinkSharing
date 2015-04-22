package linksharing

class ResourceRating {

    Resource resource
    User user
    int score = 0

    static constraints = {
        score max: 5, min: 0
    }

    static belongsTo = [resource : Resource, user : User]
}
