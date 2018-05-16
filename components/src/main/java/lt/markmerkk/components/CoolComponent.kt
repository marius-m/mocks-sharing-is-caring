package lt.markmerkk.components

import lt.markmerkk.models.Session


class CoolComponent() {
    fun extractUserName(session: Session): String {
        return session.userSettings.name
    }
}