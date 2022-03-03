stage('Checkout external proj') {
        steps {
        	 checkout([
      			  $class: 'GitSCM', 
		          branches: [[name: '*/main']], 
		          doGenerateSubmoduleConfigurations: false, 
  		          extensions: [[$class: 'CleanCheckout']], 
 		          submoduleCfg: [], 
        		  userRemoteConfigs: [[credentialsId: '1', url: 'git@github.com:snk-world/ci_task_11_5.git']]
		    ])
	}
}
