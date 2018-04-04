package iii_conventions

import util.TODO
import util.doc25

fun todoTask25(): Nothing = TODO(
    """
        Task 25.
        Uncomment the commented line and make it compile. 
        Make all the changes to the file MyDate.kt.

        Tips: Make the class 'MyDate' implement 'Comparable'.
    """,
    documentation = doc25(),
    references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

operator fun MyDate.compareTo(other: MyDate): Int = compareValuesBy(this, other, MyDate::year, MyDate::month, MyDate::dayOfMonth)

fun task25(date1: MyDate, date2: MyDate): Boolean {
    return date1 < date2
}
