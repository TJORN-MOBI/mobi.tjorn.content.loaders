/*
 * Copyright 2016 TJORN LLC
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

package mobi.tjorn.content.loaders;

import android.content.AsyncTaskLoader;
import android.content.Context;

/**
 * A sub-class that inherits from Android stock {@link android.content.AsyncTaskLoader}.
 */
public abstract class BaseLoader<D> extends AsyncTaskLoader<D> {
    public BaseLoader(Context context) {
        super(context);
    }
}
