package lt.markmerkk

import lt.markmerkk.models.Session
import lt.markmerkk.models.UserSettings


object Mocks {

    fun createUserSettings(
            id: Long = 1L,
            name: String = "valid_name",
            age: Int = 10
    ): UserSettings {
        return UserSettings(
                id = id,
                name = name,
                age = age
        )
    }

    fun createSession(
            id: Long = 1L,
            userSettings: UserSettings = createUserSettings()
    ): Session {
        return Session(
                id = id,
                userSettings = userSettings
        )
    }

}