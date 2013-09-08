package notes

class NotesController {

    static defaultAction = "list"

    def index() {
        def ipAd = request.getRemoteAddr()

        //render ipAd
        //redirect(action: "list", params: params)
    }

    def list() {
        def notesList =  Note.list()
        if(!notesList) {
            notesList = new ArrayList<Note>();
        }
        [notes: notesList]
    }

    def create() {
        [note: new Note(params)]
    }

    /*  def save() {
          def note = new Note(params)
          if (!note.save(flush: true)) {
              render(view: "create", model: [note: note])
              return
          }

          flash.message = message(code: 'default.created.message', args: [message(code: 'testEntity.label', default: 'TestEntity'), testEntityInstance.id])
          redirect(action: "show", id: testEntityInstance.id)
      }*/

}
