job('demo2byGit') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/praful31/Jenkins.git')
            }
        }
    }
    steps {
         shell('echo successfully implemented item')
    }
}