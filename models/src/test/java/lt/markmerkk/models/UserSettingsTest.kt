package lt.markmerkk.models

import lt.markmerkk.mock_factory.Mocks
import org.junit.Assert.*
import org.junit.Test

class UserSettingsTest {

    @Test
    fun valid() {
        // Assemble
        val userSettings = Mocks.createUserSettings(
                id = 2L,
                name = "mark",
                age = 21
        )
        val session = Mocks.createSession(
                id = 1L,
                userSettings = userSettings
        )

        // Act
        val resultAge = userSettings.ageDoubler(10)

        // Assert
        assertEquals(20, resultAge)
    }

}