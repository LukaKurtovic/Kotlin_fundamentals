fun main(){

    val username = "luka123"
    val password = "123abcd"
    val email = "luka@gmail.com"

    if (username.length < 6 || username.isBlank()){
        println("Username not valid")
    } else if (password.length < 10 || password.isBlank()){
        println("Password not valid")
    } else if (email.isBlank() || !(email.contains("@")) || !(email.contains("."))){
        println("Email not valid")
    } else println("Data is valid")
}