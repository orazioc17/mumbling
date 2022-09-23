fun accum(s:String):String {
    var result = ""
    for (i in s.indices) {
        val index = i + 1
        result += if (index == 1) s[i].uppercase() else s[i].uppercase() + ( s[i].lowercase().repeat((index - 1)))
        result += if (index < s.length) "-" else ""
    }
    return result
}
