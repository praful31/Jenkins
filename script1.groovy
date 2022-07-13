node {
    stage('git clone') {
         git 'https://github.com/praful31/nginx.git'
    }
    stage('pwd') {
        sh 'pwd >> home.txt' 
    }
    stage('test') {
        sh 'echo \'successfully deployed\' >> home.txt' 
    }
}