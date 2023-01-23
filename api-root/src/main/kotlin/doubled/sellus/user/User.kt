package doubled.sellus.user

interface User {
    fun getId(): Long
    fun getEmail(): String
    fun getNickName(): String?
    fun getExperiences(): List<String>
    fun getCareers(): List<CareerDataModel>
    fun getIntro(): String?
}
