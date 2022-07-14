job('demo2byGit') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/praful31/Jenkins.git')4
               }
        }
    }
    steps {
         sh 'echo \'successfully deployed\' >> home.txt' 
    }
} 