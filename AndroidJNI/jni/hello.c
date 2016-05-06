#include <jni.h> 
#include <string.h> 
jstring JNICALL Java_com_example_androidjni_MainActivity_get(JNIEnv *env, jobject clazz) { 
        return (*env)->NewStringUTF(env, "Hello from JNI !"); 
} 

