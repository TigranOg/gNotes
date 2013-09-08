package notes

class Note {
    String title
    String body
    String ipAddress


    static constraints = {
        title(blank: false)
        body(blank: false)
    }
}
