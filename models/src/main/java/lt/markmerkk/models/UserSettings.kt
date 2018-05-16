package lt.markmerkk.models


data class UserSettings(
        val id: Long,
        val name: String,
        val age: Int
) {
    fun ageDoubler(age: Int): Int {
        return age + age
    }
}