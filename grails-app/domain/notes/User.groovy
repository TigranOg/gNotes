package notes

class User {
    String ipAddress
    String password

    static hasMany = [notes: Note]

    static mapping = {
        table '`user`'
        password column: '`password`'
    }

    static constraints = {
        ipAddress(blank: false, unique: true)
        password(blank: true)
    }
}
