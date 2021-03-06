/*
 * Copyright 2018 Google, Inc.
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

package io.plaidapp.core.dribbble.data

import io.plaidapp.core.dribbble.data.api.model.Images
import io.plaidapp.core.dribbble.data.api.model.Shot
import io.plaidapp.core.dribbble.data.api.model.User
import okhttp3.MediaType
import okhttp3.ResponseBody

/**
 * Dribbble test data
 */

val player = User(
    id = 1L,
    name = "Nick Butcher",
    username = "nickbutcher"
)

val shots = listOf(
    Shot(
        id = 1L,
        title = "Foo",
        description = "",
        images = Images(),
        user = player
    ),
    Shot(
        id = 2L,
        title = "Bar",
        description = "",
        images = Images(),
        user = player
    ),
    Shot(
        id = 3L,
        title = "Baz",
        description = "",
        images = Images(),
        user = player
    )
)

val errorResponseBody = ResponseBody.create(MediaType.parse(""), "Error")
