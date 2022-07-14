job('job_by_seed2') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/praful31/repo-ssh.git')
               }
        }
    }
    steps {
         sh 'echo \'successfully deployed\' >> home.txt' 
    }
}