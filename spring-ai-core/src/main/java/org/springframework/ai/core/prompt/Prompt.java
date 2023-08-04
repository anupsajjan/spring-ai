/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ai.core.prompt;

import java.util.Collections;
import java.util.List;

import org.springframework.ai.core.prompt.messages.HumanMessage;
import org.springframework.ai.core.prompt.messages.Message;

public class Prompt {

	private List<Message> messages;

	public Prompt(String contents) {
		this.messages = Collections.singletonList(new HumanMessage(contents));
	}

	public Prompt(Message message) {
		this.messages = Collections.singletonList(message);
	}

	public Prompt(List<Message> messages) {
		this.messages = messages;
	}

	public String getContents() {
		StringBuilder sb = new StringBuilder();
		for (Message message : messages) {
			sb.append(message.getContent());
		}
		return sb.toString();
	}

	public List<Message> getMessages() {
		return this.messages;
	}

}