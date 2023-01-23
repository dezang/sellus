package doubled.sellus.user

import doubled.sellus.user.adapter.out.persistence.CareerDataModel

interface User {
    fun getId(): Long
    fun getEmail(): String
    fun getNickName(): String?
    fun getExperiences(): List<String>
    fun getCareers(): List<CareerDataModel>
    fun getIntro(): String?
}
