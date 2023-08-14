job('My First Devops Learning project by DSL'){
    description("First maven job generated by DSL on ${new Date()}")
    scm {
        git("git@github.com:nikhilkapleshwari/MyDevOpsLearning.git",'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'pom.xml')
    }
    publishers {
        archiveArtifacts '**/*.jar'
    }
}