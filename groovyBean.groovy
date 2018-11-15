@groovy.transform.ToString()
class User {

    Long id
    String firstName
    String lastName
    String email
    Date startDate

    void printFullName(){
        println "FullName: $firstName $lastName"
    }

}

User user = new User(firstName:"Big",lastName:"Kahuna")
println user