stage('Checkout external proj') {
        steps {
            git branch: 'main',
                url: 'git@github.com:snk-world/ci_task_11_5.git'

            sh "ls -lat"
        }
}
