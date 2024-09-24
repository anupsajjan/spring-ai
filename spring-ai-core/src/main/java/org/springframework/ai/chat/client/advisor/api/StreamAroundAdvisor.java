/*
* Copyright 2024 - 2024 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.springframework.ai.chat.client.advisor.api;

import java.util.Map;

import org.springframework.ai.chat.client.AdvisedRequest;
import org.springframework.ai.chat.model.ChatResponse;

import reactor.core.publisher.Flux;

/**
 * @author Christian Tzolov
 * @since 1.0.0
 */
public interface StreamAroundAdvisor extends Advisor {

	/**
	 * Around advice that wraps the invocation of the advised request.
	 * @param advisedRequest
	 * @param adviceContext
	 * @param chain the chain of advisors to execute
	 * @return the result of the advised request
	 */
	Flux<ChatResponse> aroundStream(AdvisedRequest advisedRequest, Map<String, Object> adviceContext,
			AroundAdvisorChain chain);

}