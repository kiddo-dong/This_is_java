package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface PrintAnnotation {
	// 기본 속성:value()  값:-
	String value() default "-";
	int number() default 15;
}
