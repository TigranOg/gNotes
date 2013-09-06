package notes

class NotesController {

    def index() {
       def ip = request.getRemoteAddr()

        render ip
    }
}
