package postdata

data class PostAuthor(
    val post: Post,
    val author: Author,
    val comments: List<CommentAuthor>
)