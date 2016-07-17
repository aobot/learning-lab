import com.loader.Student

/**
 * Created by @ssysong.ssy  2016-07-16 14:47
 */
def map = [a:new Student()]
def map2 = [:]
map2.putAll(map)

map = [b:new Student()]

println 'do'