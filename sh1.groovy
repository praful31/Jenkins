job('job_by_seed') {
    scm {
        git {
            remote {
                name('origin')
                url('https://github.com/swapnibrad/shubham_b.git')
            }
        }
    }
    steps {
         sh 'echo \'successfully deployed\' >> home.txt' 
    }
}