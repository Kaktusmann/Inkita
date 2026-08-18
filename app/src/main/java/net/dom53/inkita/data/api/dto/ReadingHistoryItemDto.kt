package net.dom53.inkita.data.api.dto

data class ReadingHistoryItemDto(
    val sessionId: Int? = null,
    val startTimeUtc: String? = null,
    val endTimeUtc: String? = null,
    val localDate: String? = null,
    val seriesId: Int? = null,
    val seriesName: String? = null,
    val chapters: List<ReadingHistoryChapterItemDto>? = null,
    val libraryId: Int? = null,
)

data class ReadingHistoryChapterItemDto(
    val chapterId: Int? = null,
    val label: String? = null,
    val startTimeUtc: String? = null,
    val endTimeUtc: String? = null,
)
