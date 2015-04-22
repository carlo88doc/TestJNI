#include "reply_jnitest_NativeConnector.h"
#include <jni.h>

extern "C" {

	JNIEXPORT jstring JNICALL Java_reply_jnitest_NativeConnector_getText(JNIEnv *env, jobject object)
	{
		return env->NewStringUTF("Hello From CPP");
	}


}


