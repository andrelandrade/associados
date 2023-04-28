package associados.api.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}