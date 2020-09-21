package com.shalom.cpp_module

class CppBridge {
    init {

        System.loadLibrary("cpp-lib")

    }

   private external fun stringFromJNI():String

    fun getStringFromCpp()=stringFromJNI()
}