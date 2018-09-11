/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package example.app.chat.util;

import java.util.Optional;

import org.cp.elements.lang.Renderer;

import example.app.chat.model.Chat;

/**
 * The {@link ChatRenderer} class is a {@link Renderer} implementation that renders a {@link Chat} as a {@link String}.
 *
 * @author John Blum
 * @see java.lang.String
 * @see org.cp.elements.lang.Renderer
 * @see example.app.chat.model.Chat
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class ChatRenderer implements Renderer<Chat> {

	public static final Renderer<Chat> INSTANCE = new ChatRenderer();

	@Override
	public String render(Chat chat) {

		return Optional.ofNullable(chat)
			.map(it -> String.format("[%1$s] - \"%2$s\"", chat.getPerson(), chat.getMessage()))
			.orElse("Chat is null");
	}
}
