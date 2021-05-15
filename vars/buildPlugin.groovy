def call(Map config) {
    node {
        git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
        bat 'mvn install'
        mail to: '...', subject: "${config.name} plugin build", body: '...'
    }
}
