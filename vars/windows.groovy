def call(Closure body) {
    node('Master') {
        body()
    }
}
