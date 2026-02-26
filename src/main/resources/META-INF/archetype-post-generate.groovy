// PostProcessing
println """
  ██████╗ ███████╗██████╗  ██████╗ ██████╗ ██╗      █████╗ ███╗   ██╗
 ██╔════╝ ██╔════╝██╔══██╗██╔═══██╗██╔══██╗██║     ██╔══██╗████╗  ██║
 ██║  ███╗█████╗  ██║  ██║██║   ██║██████╔╝██║     ███████║██╔██╗ ██║
 ██║   ██║██╔══╝  ██║  ██║██║   ██║██╔═══╝ ██║     ██╔══██║██║╚██╗██║
 ╚██████╔╝███████╗██████╔╝╚██████╔╝██║     ███████╗██║  ██║██║ ╚████║
  ╚═════╝ ╚══════╝╚═════╝  ╚═════╝ ╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝

       Generating the project for you...
"""

def messagesParam = request.properties['messages']
println "Messages parameter: ${messagesParam}"
def messages = messagesParam ? messagesParam.split(',').collect { it.trim() } : []

def aId = request.artifactId;
def artDir = new File(request.outputDirectory, aId)
def migrationDir = new File(artDir, "src/main/resources/db/migration")
def migrationFile = new File(migrationDir, "V1.0.0__Initial_Schema.sql")

if (messages.size() > 0) {
    def insertContent = new StringBuilder()
    insertContent.append("\n")
    messages.each { message ->
        def escapedMessage = message.replace("'", "''")
        insertContent.append("INSERT INTO MESSAGES (message) VALUES ('${escapedMessage}');\n")
    }
    // Append to existing file
    migrationFile.append(insertContent.toString())
}