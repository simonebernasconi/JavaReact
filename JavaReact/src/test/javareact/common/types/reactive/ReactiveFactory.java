package test.javareact.common.types.reactive;

import java.util.List;

import test.javareact.common.packets.content.Value;

public final class ReactiveFactory {

	public static final ReactiveInterface getValue(String expression,
			Value startingValue, String name, boolean isPublic) {
		ReactiveInterface result = new ReactiveInterfaceImpl(expression, startingValue, name, isPublic);
		return result;
	}

	public static final ReactiveInterface getValue(String expression,
			Value startingValue, String name) {
		ReactiveInterface result = new ReactiveInterfaceImpl(expression, startingValue, name, true);
		return result;
	}

	public static final ReactiveInterface getValue(String expression,
			String name, boolean isPublic) {
		ReactiveInterface result = new ReactiveInterfaceImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveInterface getValue(String expression,
			String name) {
		ReactiveInterface result = new ReactiveInterfaceImpl(expression, name, true);
		return result;
	}
	
	public static final ReactiveInteger getInteger(String expression,
			int startingValue, String name, boolean isPublic) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveInteger getInteger(String expression,
			int startingValue, String name) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveInteger getInteger(String expression,
			String name, boolean isPublic) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveInteger getInteger(String expression,
			String name) {
		ReactiveInteger result = new ReactiveIntegerImpl(expression, name, true);
		return result;
	}

	public static final ReactiveList getInteger(String expression,
			List<?> startingValue, String name, boolean isPublic) {
		ReactiveList result = new ReactiveListImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveList getInteger(String expression,
			List<?> startingValue, String name) {
		ReactiveList result = new ReactiveListImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveList getList(String expression,
			String name, boolean isPublic) {
		ReactiveList result = new ReactiveListImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveList getList(String expression,
			String name) {
		ReactiveList result = new ReactiveListImpl(expression, name, true);
		return result;
	}

	
	public static final ReactiveDouble getDouble(String expression,
			double startingValue, String name, boolean isPublic) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveDouble getDouble(String expression,
			double startingValue, String name) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveDouble getDouble(String expression,
			String name, boolean isPublic) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveDouble getDouble(String expression, String name) {
		ReactiveDouble result = new ReactiveDoubleImpl(expression, name, true);
		return result;
	}

	public static final ReactiveBool getBool(String expression,
			boolean startingValue, String name, boolean isPublic) {
		ReactiveBool result = new ReactiveBoolImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveBool getBool(String expression,
			boolean startingValue, String name) {
		ReactiveBool result = new ReactiveBoolImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveBool getBool(String expression, String name,
			boolean isPublic) {
		ReactiveBool result = new ReactiveBoolImpl(expression, name, isPublic);
		return result;
	}

	public static final ReactiveBool getBool(String expression, String name) {
		ReactiveBool result = new ReactiveBoolImpl(expression, name, true);
		return result;
	}
	
	public static final ReactiveString getString(String expression,
			String startingValue, String name, boolean isPublic) {
		ReactiveString result = new ReactiveStringImpl(expression, new Value(
				startingValue), name, isPublic);
		return result;
	}

	public static final ReactiveString getString(String expression,
			String startingValue, String name) {
		ReactiveString result = new ReactiveStringImpl(expression, new Value(
				startingValue), name, true);
		return result;
	}

	public static final ReactiveString getString(String expression,
			String name, boolean isPublic) {
		ReactiveString result = new ReactiveStringImpl(expression, name,
				isPublic);
		return result;
	}

	public static final ReactiveString getString(String expression, String name) {
		ReactiveString result = new ReactiveStringImpl(expression, name, true);
		return result;
	}

}
