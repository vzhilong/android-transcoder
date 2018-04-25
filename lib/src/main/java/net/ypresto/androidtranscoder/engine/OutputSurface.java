/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// from: https://android.googlesource.com/platform/cts/+/lollipop-release/tests/tests/media/src/android/media/cts/OutputSurface.java
// blob: fc8ad9cd390c5c311f015d3b7c1359e4d295bc52
// modified: change TIMEOUT_MS from 500 to 10000
package net.ypresto.androidtranscoder.engine;

import android.view.Surface;

public interface OutputSurface {
    Surface getSurface();

    void release();

    void awaitNewImage();

    void drawImage();
}
