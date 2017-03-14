stage {
    scm {
        git('https://github.com/dillsvarma/thisone.git')
    }
    build {
        maven('clean package')
    }
}
