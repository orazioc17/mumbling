// Note: toUpperCase and toLowerCase are deprecated
fun accum(s:String):String = s.mapIndexed { index, char -> char.toUpperCase() + char.toString().toLowerCase().repeat(index) }.joinToString("-")
