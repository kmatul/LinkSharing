import linksharing.*

class BootStrap {

    def init = { servletContext ->
        User user1 = new User(firstName: "Kumar", lastName: "Atul",email: "kumar.atul@intelligrape.co.in",
                admin: true,active: true, password: "test123",userName: "kmatul")
        println user1.validate()
        user1.save(failOnError: true)

        User user2 = new User(firstName: "Atul",email: "atul@intelligrape.co.in",
                admin: false,active: true, password: "test452",userName: "atul")
        println user1.validate()
        user2.save(failOnError: true)


        String []topicName = ["Groovy","Linux","Grails","OOJS","Clean Code"];
        HashMap []linkResourcesTitle = [[title:"Google", link : "http://www.google.co.in"],
                                        [title:"Wikipedia", link : "http://www.wikipedia.org"],
                                        [title:"Stack OverFlow", link : "http://www.stackoverflow.com"],
                                        [title:"Facebook", link : "http://www.facebook.com"],
                                        [title:"Geek Code", link : "http://www.geekcode.com/geek.html"]]

        HashMap []fileResourcesTitle = [[title:"Google 1", link : "/docs/google.pdf"],
                                        [title:"Wikipedia 1", link : "/docs/wikipedia.doc"],
                                        [title:"Stack OverFlow 1", link : "/docs/stackoverflow.doc"],
                                        [title:"Facebook 1", link : "/docs/facebook.pdf"],
                                        [title:"Geek Code 1", link : "/docs/geekcode.ppt"]]

        5.times {
            Topic topic = new Topic(name: topicName[it -1], createdBy: user1, visibility:(it%3 == 0) ? Topic.VisibilityVal.PRIVATE :Topic.VisibilityVal.PUBLIC)
            topic.save(failOnError: true);

            Subscription subscription = new Subscription(user: user1,topic: topic,seriousness: (it%2 == 0) ? Subscription.SeriousnessVal.CASUAL :Subscription.SeriousnessVal.SERIOUS)
            subscription.save(failOnError: true)

            5.times {
                LinkResource resource = new LinkResource(title :linkResourcesTitle[it-1].title, topic : topic,
                        description: "Test ${linkResourcesTitle[it-1].title}",createdBy: user1, url: linkResourcesTitle[it-1].link)
                println(resource.properties)
                resource.save(failOnError: true)

                ReadResource readResource = new ReadResource(user: user1,resource : resource, isRead: (it%2 == 0) ? true:false)
                readResource.save(failOnError: true)

            }

            5.times {
                DocumentResource resource = new DocumentResource(title :fileResourcesTitle[it-1].title, topic : topic,
                        description: "Test ${fileResourcesTitle[it-1].title}",createdBy: user1, filePath: fileResourcesTitle[it-1].link)
                println(resource.properties)
                resource.save(failOnError: true)

                ReadResource readResource = new ReadResource(user: user1,resource : resource, isRead: (it%3 == 0) ? true:false)
                readResource.save(failOnError: true)
            }
        }


        5.times {
            Topic topic = new Topic(name: topicName[it -1], createdBy: user2, visibility:(it%3 == 0) ? Topic.VisibilityVal.PRIVATE :Topic.VisibilityVal.PUBLIC)
            topic.save(failOnError: true);

            Subscription subscription = new Subscription(user: user2,topic: topic,seriousness: (it%2 == 0) ? Subscription.SeriousnessVal.CASUAL :Subscription.SeriousnessVal.SERIOUS)
            subscription.save(failOnError: true)

            5.times {
                LinkResource resource = new LinkResource(title :linkResourcesTitle[it-1].title, topic : topic,
                        description: "Test ${linkResourcesTitle[it-1].title}",createdBy: user2, url: linkResourcesTitle[it-1].link)
                println(resource.properties)
                resource.save(failOnError: true)

                ReadResource readResource = new ReadResource(user: user2,resource : resource, isRead: (it%2 == 0) ? true:false)
                readResource.save(failOnError: true)

            }

            5.times {
                DocumentResource resource = new DocumentResource(title :fileResourcesTitle[it-1].title, topic : topic,
                        description: "Test ${fileResourcesTitle[it-1].title}",createdBy: user2, filePath: fileResourcesTitle[it-1].link)
                println(resource.properties)
                resource.save(failOnError: true)

                ReadResource readResource = new ReadResource(user: user2,resource : resource, isRead: (it%3 == 0) ? true:false)
                readResource.save(failOnError: true)
            }
        }
//        Topic topic1 = new Topic(name: "Groovy", createdBy: user1, visibility:Topic.VisibilityVal.PUBLIC)
//        topic1.save(failOnError: true);
//
//        Topic topic2 = new Topic(name: "Linux", createdBy: user1, visibility:Topic.VisibilityVal.PRIVATE)
//        topic2.save(failOnError: true);
//
//        Topic topic3 = new Topic(name: "Grails", createdBy: user1, visibility:Topic.VisibilityVal.PUBLIC)
//        topic3.save(failOnError: true);
//
//        Topic topic4 = new Topic(name: "OOJS", createdBy: user1, visibility:Topic.VisibilityVal.PUBLIC)
//        topic4.save(failOnError: true);
//
//        Topic topic5 = new Topic(name: "Clean Code", createdBy: user1, visibility:Topic.VisibilityVal.PUBLIC)
//        topic5.save(failOnError: true);

    }


    def destroy = {
    }
}
