/*
 * Copyright 2025 LiveKit, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.livekit.server

import livekit.LivekitAgentDispatch
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Retrofit Interface for accessing the AgentDispatchService Apis.
 */
interface AgentDispatchService {
    @Headers("Content-Type: application/protobuf")
    @POST("/twirp/livekit.AgentDispatchService/CreateDispatch")
    fun createDispatch(
        @Body request: LivekitAgentDispatch.CreateAgentDispatchRequest,
        @Header("Authorization") authorization: String,
    ): Call<LivekitAgentDispatch.AgentDispatch>

    @Headers("Content-Type: application/protobuf")
    @POST("/twirp/livekit.AgentDispatchService/DeleteDispatch")
    fun deleteDispatch(
        @Body request: LivekitAgentDispatch.DeleteAgentDispatchRequest,
        @Header("Authorization") authorization: String,
    ): Call<LivekitAgentDispatch.AgentDispatch>

    @Headers("Content-Type: application/protobuf")
    @POST("/twirp/livekit.AgentDispatchService/ListDispatch")
    fun listDispatch(
        @Body request: LivekitAgentDispatch.ListAgentDispatchRequest,
        @Header("Authorization") authorization: String,
    ): Call<LivekitAgentDispatch.ListAgentDispatchResponse>
}
