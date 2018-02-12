package me.ankit.spring.manning.chapter3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AddressBeanCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
		// context.getEnvironment();
		return true;
	}

}
