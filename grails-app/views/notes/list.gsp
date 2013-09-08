<%@ page contentType="text/html;charset=UTF-8" %>
<html>

    <head>
        <title>Grails Notes</title>
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'style')}" type="text/css">
        <g:javascript library='jquery' />
        <r:layoutResources/>
    </head>

    <body>
        <div id="list-notes" class="list_content">
            <table>
                <tbody>
                <g:each in="${notes}" status="i" var="note">
                    <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                        <td><g:link action="show" id="${note.id}">${fieldValue(bean: note, field: "name")}</g:link></td>

                    </tr>
                </g:each>
                </tbody>
            </table>
        </div>


        <div class="comment_div">
            <button onclick="toggle()">Add new comment</button>
            <div id="comment_text" class="add_comment_div">
                <g:textArea id="comment" name="comment" class="comment_text"/>
                <g:submitButton name="create" class="save" value="Save" />
            </div>
        </div>

        <r:script>
            function toggle() {
                $('#comment_text').slideToggle("slow");
            }
        </r:script>

    </body>

</html>