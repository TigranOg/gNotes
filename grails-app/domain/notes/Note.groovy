package notes

class Note {
    String title
    String body

    //сделал на будущее возможность иметь ссылку на владельца данного комментария
    static belongsTo = [user: User]

    static constraints = {
        title(blank: false)
        body(blank: false)
    }
}
