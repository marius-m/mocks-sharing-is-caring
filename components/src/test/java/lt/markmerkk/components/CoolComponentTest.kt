package lt.markmerkk.components

import lt.markmerkk.mock_factory.Mocks
import org.junit.Assert.*
import org.junit.Test

class CoolComponentTest {
    @Test
    fun valid() {
        // Assemble
        val coolComponent = CoolComponent()
        val session = Mocks.createSession(
                userSettings = Mocks.createUserSettings(
                        id = 2L,
                        name = "cool_name",
                        age = 16
                )
        )

        // Act
        val resultName = coolComponent.extractUserName(session)

        // Assert
        assertEquals("cool_name", resultName)
    }
}