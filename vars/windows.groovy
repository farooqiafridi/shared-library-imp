def call(Closure body) {
    node('none') {
        body()
    }
}
