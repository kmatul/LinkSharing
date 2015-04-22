package linksharing

class Subscription {

    User user
    Topic topic
    enum SeriousnessVal {CASUAL, SERIOUS, VERY_SERIOUS}
    SeriousnessVal seriousness
    Date dateCreated

    static constraints = {
        user unique: "topic"

    }

    static belongsTo = [user : User, topic : Topic]


}
