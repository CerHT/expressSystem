package cn.edu.cqu.cht.mapper

import cn.edu.cqu.cht.model.Kotlin

/**
 *
 * @author chenhantao
 * @since 2018/11/2
 */
interface KotlinMapper {
    fun selectById(id: Long):Kotlin
}