package doubled.sellus.user

interface User {
    fun getId(): Long
    fun getEmail(): String
    fun getNickName(): String
    fun getExperiences(): ArrayList<String>
    fun getCareer(): ArrayList<Career>
    fun getIntro(): String
}
