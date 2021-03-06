package com.geekend.core.game.services.network.remote;

import playn.core.Json.Object;

public interface RemoteEventFactory<T extends RemoteEvent> {

	boolean supports(String className);

	T fromJson(Object object);

	String toJson(T event);

}
